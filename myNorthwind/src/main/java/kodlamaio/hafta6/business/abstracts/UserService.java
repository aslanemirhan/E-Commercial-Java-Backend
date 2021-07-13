package kodlamaio.hafta6.business.abstracts;

import kodlamaio.hafta6.core.entities.User;
import kodlamaio.hafta6.core.utilities.results.DataResult;
import kodlamaio.hafta6.core.utilities.results.Result;

public interface UserService {

	Result add(User user);
	DataResult<User> findByEmail(String email);
}
