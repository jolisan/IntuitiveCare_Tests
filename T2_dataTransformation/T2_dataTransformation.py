import tabula
import pandas as pd
import zipfile

def extractQuadros(quadrosList, arquivoTISS):
    for i in range(0, len(quadrosList)):
        if quadrosList[i] == 30:
            try:
                extractQuadro30(arquivoTISS)
                print("CSV do Quadro 30 salvo com sucesso!")
            except:
                print("Ocorreu um erro ao salvar o CSV do Quadro 30!")
        elif quadrosList[i] == 31:
            try:
                extractQuadro31(arquivoTISS)
                print("CSV do Quadro 31 salvo com sucesso!")
            except:
                print("Ocorreu um erro ao salvar o CSV do Quadro 31!")
        elif quadrosList[i] == 32:
            try:
                extractQuadro32(arquivoTISS)
                print("CSV do Quadro 32 salvo com sucesso!")
            except:
                print("Ocorreu um erro ao salvar o CSV do Quadro 32!")
    return 1

def extractQuadro30(arquivoTISS):
    quadro = tabula.read_pdf(arquivoTISS, pages="114")
    quadro = pd.concat([quadro[0]], ignore_index=True)
    quadro.to_csv("Quadro30.csv", index=False)

def extractQuadro31(arquivoTISS):
    quadro = tabula.read_pdf(arquivoTISS, pages='115-120', multiple_tables=True, pandas_options={'header': None})
    # Mesclando todas as página que contem o Quadro 31, pois na última página também existe o Quadro 32
    quadro = pd.concat([quadro[0], quadro[1], quadro[2], quadro[3], quadro[4], quadro[5]], ignore_index=True)
    # Removendo todos os espaços nulos
    quadro = quadro.where(pd.notnull(quadro), ' ')
    # Removendo a primeira linha
    quadro.columns = [quadro.iloc[0], quadro.iloc[1]]
    # Removendo o cabeçalho duplicado
    quadro = quadro[2:]
    quadro.to_csv("Quadro31.csv", index=False)

def extractQuadro32(arquivoTISS):
    quadro = tabula.read_pdf(arquivoTISS, pages="120")
    quadro = pd.concat([quadro[1]], ignore_index=True)
    quadro.to_csv("Quadro32.csv", index=False)

def compressFiles(files):
    zf = zipfile.ZipFile('Teste_Jolisan.zip', 'w', zipfile.ZIP_DEFLATED)
    try:
        for file in files:
            zf.write(file)
        print("Arquivo(s) comprimido(s) com sucesso!")
    except FileNotFoundError:
        print("Ocorreu um erro ao comprimir o(s) arquivo(s)!")
    finally:
        zf.close()


arquivoTISS = "new_TISS.pdf"
extractQuadros([30, 31, 32], arquivoTISS)
csvs = ["Quadro30.csv", "Quadro31.csv", "Quadro32.csv"]
compressFiles(csvs)