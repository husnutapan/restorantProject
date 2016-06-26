package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.model.Masa;
import com.service.MasaService;

@RestController
public class MasaController {

	@Autowired
	private MasaService masaService;

	@RequestMapping(value = "/masalar/", method = RequestMethod.GET)
	public ResponseEntity<List<Masa>> listAllMasa() {
		List<Masa> masalar = masaService.findAllMasa();
		if (masalar.isEmpty()) {
			return new ResponseEntity<List<Masa>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Masa>>(masalar, HttpStatus.OK);
	}
}
