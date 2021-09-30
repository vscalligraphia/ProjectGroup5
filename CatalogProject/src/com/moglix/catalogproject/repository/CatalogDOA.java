package com.moglix.catalogproject.repository;

import com.moglix.catalogproject.dto.Catalog;

public class CatalogDOA {
	
	public static int counter = 0;
	
	Catalog catalogs[] = new Catalog[10];
	
	public String addCatalog(Catalog catalog) {
		if(counter<catalogs.length) {
			catalogs[counter++] = catalog;
			return "Success";
			
		}
		else {
			return "Array is full";
		}
	}
	
	
	private int getIndex(String pid) {
		for(int i=0; i<catalogs.length; i++) {
			if(catalogs[i]!=null && catalogs[i].getProduct_ID().equals(pid)) {
				return i;
			}
		}
		return -1;
		
	}

	
	public String updateCatlog(String pid, Catalog catalog) {
		
		int index= this.getIndex(pid);
		if(index!=-1) {
			catalogs[index]= catalog;
			return "Success";
		}
		else {
			return "not found";
		}
	}
	

}
