package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{//entity framework base repository c# daki
	//verdimiz veri tipi için  oparasyonları hazırlarr

}
