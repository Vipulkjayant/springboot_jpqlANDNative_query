package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import DAO.UserDAO;
import Entity.User;

@SpringBootApplication
@EntityScan("Entity")
@EnableJpaRepositories("DAO")
public class SpringbootJpqlAndNativeQueryApplication {

	public static void main(String[] args) {
	ApplicationContext context=SpringApplication.run(SpringbootJpqlAndNativeQueryApplication.class, args);
    UserDAO d=context.getBean(UserDAO.class);
//    User u=new User(101,"lalit","90");
//    d.save(u);
//    System.out.println("done");
	
     List<User> li=d.getUserbyname("lalit");
     li.forEach(l->{
    	 System.out.println(l);
     });
     
     List<User> li2=d.getallUsers();
     li2.forEach(l2->{
    	 System.out.println(l2);
     });
     
	}

}
