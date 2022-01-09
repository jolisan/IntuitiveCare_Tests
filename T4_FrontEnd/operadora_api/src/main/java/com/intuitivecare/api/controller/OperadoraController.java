package com.intuitivecare.api.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.intuitivecare.api.model.Arquivo;
import com.intuitivecare.api.model.Operadora;

@RestController
@RequestMapping("/api")
public class OperadoraController {
	
	@RequestMapping(path = "/operadora/search", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	
	public ResponseEntity searchOperadora(@RequestParam(value="texto") String texto) throws Exception {

		Arquivo arquivo = new Arquivo();
		List<Operadora> listaOperadoras = arquivo.lerArquivo("src\\main\\resources\\relatorios\\Relatorio_cadop.csv");

		List listaSimilares = new ArrayList();
		for(Operadora o : listaOperadoras) {
		      if(o.toString().toUpperCase().contains(texto.toUpperCase()) == true) {
		    	  listaSimilares.add(o);
		      }
		}
		
		String json = new ObjectMapper().writeValueAsString(listaSimilares);
		return new ResponseEntity(json, HttpStatus.OK);
	}

}
