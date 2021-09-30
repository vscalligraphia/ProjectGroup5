package com.moglix.catalogproject.service;

import com.moglix.catalogproject.dto.Catalog;
import com.moglix.catalogproject.repository.CatalogDOA;

public interface CatalogService {
	
	public String addCatalog(Catalog catalog);
	public String updateCatalog(String pid, Catalog catalog);
	
	public Catalog getCatalogById(String pid);
	public void deleteCatalogById(String pid);
	public Catalog[] getAllCatalog();
	public void deleteAllCatalog();
	

}
