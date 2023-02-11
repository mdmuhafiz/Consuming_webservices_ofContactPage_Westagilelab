package com.westagileMicroservices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.westagileMicroservices.dto.WestAgileLab;

@Controller
public class WestAgileContactSearch {
	@RequestMapping("/viewSearchPage")
	public String viewSerachPage() {
		return "search_id";
	}
	@RequestMapping("/searchContact")
	public String searchContactDetailsForWestAgileWebsite(@RequestParam("id") long id,ModelMap model) {
		WestAgileLabClient client = new WestAgileLabClient();
		WestAgileLab searchContact = client.searchContactDetailsForWestAgileWebsite(id);
		model.addAttribute("searchContact", searchContact);
		return "showContactInfoOfWestAgileLab";
		
	}

}
