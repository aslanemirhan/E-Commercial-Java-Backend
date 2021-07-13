package kodlamaio.hafta6.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hafta6.core.entities.User;

public interface UserDao extends JpaRepository<User,Integer>{

	User findByEmail(String email);
}
	