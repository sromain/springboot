package com.javamind.springboot.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.javamind.springboot.entity.Site;
import com.javamind.springboot.helper.Helper;
import com.javamind.springboot.repository.SiteRepository;
import com.javamind.springboot.service.SiteService;

@Service(value="siteService")
public class SiteServiceImpl implements SiteService {
	
	@Resource
	private SiteRepository siteRepository;

	public List<Site> getAllSites() {
		return Helper.copyIterator(this.siteRepository.findAll().iterator());
	}

	public Site getSiteById(Long id) {
		return this.siteRepository.findOne(id);
	}

	public Site createSite(Site site) {
		return this.siteRepository.save(site);
	}

	public Site updateSite(Site site) {
		return this.siteRepository.save(site);
	}

	public void deleteSite(Long id) {
		this.siteRepository.delete(id);
	}

	public Site getSiteByLibelle(String libelle) {
		return this.siteRepository.findByLibelle(libelle);
	}

	public SiteRepository getSiteRepository() {
		return siteRepository;
	}

	public void setSiteRepository(SiteRepository siteRepository) {
		this.siteRepository = siteRepository;
	}

}
