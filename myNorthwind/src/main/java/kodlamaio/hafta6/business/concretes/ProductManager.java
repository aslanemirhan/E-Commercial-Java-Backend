package kodlamaio.hafta6.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hafta6.business.abstracts.ProductService;
import kodlamaio.hafta6.dataAccess.abstracts.ProductDao;
import kodlamaio.hafta6.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}


	@Override
	public List<Product> getAll() {
		return this.productDao.findAll();
	}

}
