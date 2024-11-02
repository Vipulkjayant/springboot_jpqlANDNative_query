package DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Entity.User;

public interface UserDAO extends JpaRepository<User, Integer>{


	@Query("select u FROM User u")
	public List<User> getallUsers();
	
	@Query("select u From User u where u.name= ?1")
	public List<User> getUserbyname(@Param("n") String name);
}
