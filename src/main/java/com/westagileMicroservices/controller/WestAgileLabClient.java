package com.westagileMicroservices.controller;

import org.springframework.web.client.RestTemplate;

import com.westagileMicroservices.dto.WestAgileLab;

public class WestAgileLabClient {
	public WestAgileLab searchContactDetailsForWestAgileWebsite(long id) {
		RestTemplate restTemplate = new RestTemplate();
		WestAgileLab westagilelab = restTemplate.getForObject("http://localhost:8080/westagilelab/contact/"+id, WestAgileLab.class);
		return westagilelab;
		
	}

}
