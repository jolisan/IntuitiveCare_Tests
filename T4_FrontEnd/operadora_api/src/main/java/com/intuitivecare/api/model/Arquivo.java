package com.intuitivecare.api.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.FileInputStream;

public class Arquivo {
	private String caminho;

	public Arquivo() {
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}
	
	public List<Operadora> lerArquivo(String caminho) {
		String path = caminho;
		
		List<Operadora> list = new ArrayList<Operadora>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "ISO_8859_1"));
			String line = br.readLine();
			line = br.readLine(); // Pulando a linha 0
			line = br.readLine(); // Pulando a linha 1
			line = br.readLine(); // Pulando a linha 2
			while (line != null) {
				
				String[] vect = line.split("\";\"");  
				String registroANS = vect[0].replace("\\", "").replace("\"", "");
				String cnpj = vect[1];
				String razaoSocial = vect[2];
				String nomeFantasia = vect[3];
				String modalidade = vect[4];
				String logradouro = vect[5];
				String numero = vect[6];
				String complemento = vect[7];
				String bairro = vect[8];
				String cidade = vect[9];
				String uf = vect[10];
				String cep = vect[11];
				String ddd = vect[12];
				String telefone = vect[13];
				String fax = vect[14];
				String enderecoEletronico = vect[15];
				String representante = vect[16];
				String cargoRepresentante = vect[17];
				String dataRegistroANS = vect[18].replace("\\", "").replace("\"", "");
				
				Operadora operadora = new Operadora(registroANS, cnpj, razaoSocial, nomeFantasia, modalidade, logradouro, numero, complemento, bairro,
						 cidade, uf, cep, ddd, telefone, fax, enderecoEletronico, representante, cargoRepresentante, dataRegistroANS);
				list.add(operadora);
				
				line = br.readLine();
			}	
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return list;
	}
}
