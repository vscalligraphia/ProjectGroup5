package com.moglix.catalogproject.service;

import com.moglix.catalogproject.dto.Catalog;
import com.moglix.catalogproject.repository.CatalogRepositorImpl;
import com.moglix.catalogproject.repository.CatalogRepository;

public class CatalogServiceImpl implements CatalogService{
	CatalogRepository catalogRepository = CatalogRepositorImpl.getInstance();
	
	private static CatalogService catalogservice;
	private CatalogServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	public static CatalogService getInstance() {
		if(catalogservice==null) {
			catalogservice = new CatalogServiceImpl();
			return catalogservice;
		}
		else {
			return catalogservice;
		}
		
		}
	
	@Override
	public String addCatalog(Catalog catalog) {
		// TODO Auto-generated method stub
		return catalogRepository.addCatalog(catalog);
	}

	@Override
	public String updateCatalog(String pid, Catalog catalog) {
		// TODO Auto-generated method stub
		return catalogRepository.updateCatalog(pid, catalog);
	}

	@Override
	public Catalog getCatalogById(String pid) {
		// TODO Auto-generated method stub
		return catalogRepository.getCatalogById(pid);
	}

	@Override
	public void deleteCatalogById(String pid) {
		// TODO Auto-generated method stub
		catalogRepository.deleteCatalogById(pid);
		
	}

	@Override
	public Catalog[] getAllCatalog() {
		// TODO Auto-generated method stub
		return catalogRepository.getAllCatalog();
	}

	@Override
	public void deleteAllCatalog() {
		// TODO Auto-generated method stub
		catalogRepository.deleteAllCatalog();
	}

}
