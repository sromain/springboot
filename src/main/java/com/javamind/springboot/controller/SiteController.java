package com.javamind.springboot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javamind.springboot.Application;
import com.javamind.springboot.entity.Site;
import com.javamind.springboot.service.SiteService;

@Controller
public class SiteController {
	@Autowired
	SiteService siteService;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/site", method=RequestMethod.GET)
	public String doGet(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "site";
	}
	
	@RequestMapping(value="/site", method=RequestMethod.POST)
	public String doPost(HttpServletRequest httpServletRequest) {

		String code = httpServletRequest.getParameter("edCodeSite");
		String libelle = httpServletRequest.getParameter("edLibelleSite");

		Site site = new Site();
		site.setCode(code);
		site.setLibelle(libelle);
		
		siteService.createSite(site);
	
		Application.logger.info("******** Sites **********");
		for (Site siteLocal : siteService.getAllSites()) {
			Application.logger.info("Code : " + siteLocal.getCode() + " / Libelle : " + siteLocal.getLibelle());
		}
		Application.logger.info("*************************");
		
		
		return "site";
	}
}
