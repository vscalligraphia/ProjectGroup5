package com.moglix.catalogproject.repository;

import com.moglix.catalogproject.dto.Catalog;

public class CatalogRepositorImpl implements CatalogRepository {
	
	

	public static int counter = 0;
	
	Catalog catalogs[] = new Catalog[10];
	
	private static CatalogRepository catalogrepository;
	
	private CatalogRepositorImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public static CatalogRepository getInstance() {
		if(catalogrepository==null) {
			catalogrepository = new CatalogRepositorImpl();
			return catalogrepository;
		}
		else {
			return catalogrepository;
		}
	}
	
	@Override
	public String addCatalog(Catalog catalog) {
		if(counter<catalogs.length) {
			catalogs[counter++] = catalog;
			return "Success";
			
		}
		else {
			return "Array is full";
		}

	}
	
	
	@Override
	public String updateCatalog(String pid, Catalog catalog) {
		int index= this.getIndex(pid);
		if(index!=-1) {
			catalogs[index]= catalog;
			return "Success";
		}
		else {
			return "not found";
		}
	
	}

	@Override
	public Catalog getCatalogById(String pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCatalogById(String pid) {
		// TODO Auto-generated method stub

	}

	@Override
	public Catalog[] getAllCatalog() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllCatalog() {
		// TODO Auto-generated method stub

	}

	private int getIndex(String pid) {
		for(int i=0; i<catalogs.length; i++) {
			if(catalogs[i]!=null && catalogs[i].getProduct_ID().equals(pid)) {
				return i;
			}
		}
		return -1;
		
	}
}
