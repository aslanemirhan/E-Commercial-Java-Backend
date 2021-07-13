package kodlamaio.hafta6.business.abstracts;

import java.util.List;



import kodlamaio.hafta6.core.utilities.results.DataResult;
import kodlamaio.hafta6.core.utilities.results.Result;
import kodlamaio.hafta6.entities.concretes.Product;
import kodlamaio.hafta6.entities.dtos.ProductWithCategoryDto;

public interface ProductService {

	DataResult<List<Product>> getAll();
	//SIRALAMA METHODU
	DataResult<List<Product>> getAllSorted();
	//SAYFALAMA METHODU
	DataResult<List<Product>> getAll(int pageNo, int pageSize);
	Result add(Product product);
	
	DataResult<Product> getByProductName(String productName);
	
	DataResult<Product> getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	
	DataResult<List<Product>> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	
	DataResult<List<Product>> getByCategoryIn(List<Integer> categories);
	
	DataResult<List<Product>> getByProductNameContains(String productName);
	
	DataResult<List<Product>> getByProductNameStartsWith(String productName);
	
	
	DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
	
	DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
}
