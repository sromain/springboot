package com.javamind.springboot.rest;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javamind.springboot.entity.Site;
import com.javamind.springboot.service.SiteService;

@RestController
@RequestMapping(value="/sites")
public class SiteRestController {
	@Resource
	private SiteService siteService;
	
	@RequestMapping(method = RequestMethod.POST)
	public Site createSite(@RequestBody Site site) {
		return this.siteService.createSite(site);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Site> getAllSite() {
		return this.siteService.getAllSites();
	}
	
	@RequestMapping(value="/{code}", method = RequestMethod.GET)
	public Site getSiteForLibelle(@PathVariable(value="code") String code) {
		return this.siteService.getSiteByLibelle(code);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
	public void deleteSite(@PathVariable(value = "id") Long id) {
		this.siteService.deleteSite(id);
	}
 
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Site updateSite(@PathVariable(value = "id") Integer id, @RequestBody Site site) {
		site.setId(id);
 
 		return this.siteService.updateSite(site);
 	}
 
	public SiteService getPlaceService() { 
		return siteService;
	}
 
	public void setPlaceService(SiteService siteService) {
   		this.siteService = siteService;
   	} 
}
