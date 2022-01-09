package com.intuitive.webscraping;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class WebScraping {
	
	/* Método que busca o URL do TISS mais recente. */
	public static String getLatestTissUrl(String url) throws IOException{
		Document document = Jsoup.connect(url).get();
		
		// Obtendo a lista de callouts que contém as tags "<p>" contendo as tags "<a>" com o href
		List<Element> callouts =  document.getElementsByClass("callout");
		
		List<Element> as = new ArrayList<>();
		List<String> hrefs = new ArrayList<>();
		
		// Obtendo a lista de tags "<a>" que contém os hrefs para cada documento
		callouts.forEach(element -> {
			as.add(element.getElementsByTag("a").first());
		});
		
		// Obtendo os hrefs na lista de tags "<a>"
		as.forEach(element -> {
			hrefs.add(element.attr("href"));
		});
		
		// Retornando o URL do TISS mais recente
		return hrefs.get(0);
	}
	
	/* Método que busca o URL do Documento TISS mais recente, utilizando a URL obtida do TISS mais recente */
	public static String getLatestTissDocumentUrl(String url) throws IOException {
		Document document = Jsoup.connect(url).get();
		
		// Obtendo a lista de <tr> e <td> que contém as tags "<a>" com o href
		List<Element> tbody =  document.getElementsByTag("tbody");
		
		List<Element> as = new ArrayList<>();
		List<String> hrefs = new ArrayList<>();
		
		// Obtendo a lista de tags "<a>" que contém os hrefs para cada documento
		tbody.forEach(element -> {
			as.add(element.getElementsByTag("a").first());
		});
		
		// Obtendo os hrefs com o URL's dos Documentos lista de tags "<a>"
		as.forEach(element -> {
			hrefs.add(element.attr("href"));
		});

		// Retornando o URL do Documento TISS mais recente
		return hrefs.get(0);
	}
	
	/* Método que efetua o Download do Documento TISS mais recente, utilizando a URL passado */
	public static void downloadLatestTiss(String FILE_URL) {
		String FILE_NAME = "new_TISS.pdf";
		try (BufferedInputStream in = new BufferedInputStream(new URL(FILE_URL).openStream());
			FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME)) {
			byte dataBuffer[] = new byte[1024];
			int bytesRead;
			
			while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
				fileOutputStream.write(dataBuffer, 0, bytesRead);
			}
			System.out.println("Download do arquivo TISS mais recente, OK!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		// URL do site a ser acessado
		String url = "https://www.gov.br/ans/pt-br/assuntos/prestadores/padrao-para-troca-de-informacao-de-saude-suplementar-2013-tiss";
		
		try {
			String latestTissUrl = getLatestTissUrl(url);
			String latestTissDocumentUrl = getLatestTissDocumentUrl(latestTissUrl);
			downloadLatestTiss(latestTissDocumentUrl);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
