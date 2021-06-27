package kodlamaio.hafta6.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hafta6.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{

}
