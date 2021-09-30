package com.moglix.catalogproject;

import com.moglix.catalogproject.dto.Catalog;
import com.moglix.catalogproject.service.CatalogService;
import com.moglix.catalogproject.service.CatalogServiceImpl;

public class Mainn {

	public static void main(String[] args) {
		
		CatalogService catalogService =  CatalogServiceImpl.getInstance();
		
		Catalog catalog = new Catalog();
		
		catalog.setProduct_ID("P1");
		catalog.setProduct_Name("Asus Mobile");
		catalog.setCat_ID("C1");
		catalog.setProduct_Description("64Gb Rom and 4GB Ram");
		catalog.setProduct_Image("image.jpg");
		
		System.out.println(catalog.getProduct_ID());
		System.out.println(catalog.getProduct_Name());
		System.out.println(catalog.getCat_ID());
		System.out.println(catalog.getProduct_Description());
		System.out.println(catalog.getProduct_Image());
		
		String result = catalogService.addCatalog(catalog);
		System.out.println(result);
		
		
		
		

	}

}
