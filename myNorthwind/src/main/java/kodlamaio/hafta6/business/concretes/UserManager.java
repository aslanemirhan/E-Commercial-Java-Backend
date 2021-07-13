package kodlamaio.hafta6.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hafta6.business.abstracts.UserService;
import kodlamaio.hafta6.core.dataAccess.UserDao;
import kodlamaio.hafta6.core.entities.User;
import kodlamaio.hafta6.core.utilities.results.DataResult;
import kodlamaio.hafta6.core.utilities.results.Result;
import kodlamaio.hafta6.core.utilities.results.SuccessDataResult;
import kodlamaio.hafta6.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı Eklendi");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.findByEmail(email),"Kullanıcı Bulundu");
	}

}
