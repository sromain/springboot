package com.javamind.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.javamind.springboot.entity.Site;

public interface SiteRepository extends CrudRepository<Site, Long> {
	Site findByLibelle(String libelle);
}
