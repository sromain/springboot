package com.javamind.springboot.service;

import java.util.List;

import com.javamind.springboot.entity.Site;

public interface SiteService {
	List<Site> getAllSites();

	Site getSiteById(Long id);
	
	Site createSite(Site site);
	
	Site updateSite(Site site);
	
	void deleteSite(Long id);
	
	Site getSiteByLibelle(String libelle);
}
