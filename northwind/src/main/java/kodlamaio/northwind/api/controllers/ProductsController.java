package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController//Sen kontrolersen
@RequestMapping("/api/products")//dış dünyadan bu istek gelirse bu controller çalışır
public class ProductsController {
	
	
	private ProductService productService;
	
	@Autowired//projede productService buluyor new işlemi ortadan kalkıyor 
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}


	@GetMapping("/getall")
     public List<Product> getAll(){
    	 return this.productService.getall();
     }
}
