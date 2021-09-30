package com.moglix.catalogproject.repository;

import com.moglix.catalogproject.dto.Catalog;

public interface CatalogRepository {
	
	public String addCatalog(Catalog catalog);
	public String updateCatalog(String pid, Catalog catalog);
	
	public Catalog getCatalogById(String pid);
	public void deleteCatalogById(String pid);
	public Catalog[] getAllCatalog();
	public void deleteAllCatalog();

}
