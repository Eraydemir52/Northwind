package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service //biness görevini görücek kısım
public class ProductManager implements ProductService {

	private ProductDao productDao;
	
	@Autowired//istıns veriyor//interface gelirse bunu ver yapıyor c# daki Autfac 
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	@Override
	public List<Product> getall() {
		
		return this.productDao.findAll();
	}
	
	

}
