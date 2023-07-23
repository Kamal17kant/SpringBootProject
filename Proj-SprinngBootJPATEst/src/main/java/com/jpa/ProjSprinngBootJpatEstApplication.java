package com.jpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.dao.UserRepo;
import com.jpa.entities.Users;

@SpringBootApplication
public class ProjSprinngBootJpatEstApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=	SpringApplication.run(ProjSprinngBootJpatEstApplication.class, args);
		UserRepo userRepo=ctx.getBean(UserRepo.class);
		//inserting multiple data at same time in a table
		/*
		Users user1=new Users();
		user1.setName("kamal");
		user1.setCity("Gaya");
		user1.setStatus("current");
		
		Users user2=new Users();
		user2.setName("Kant");
		user2.setCity("Tetariya");
		user2.setStatus("current");

		Users user3=new Users();
		user3.setName("Prakash");
		user3.setCity("Bihar");
		user3.setStatus("current");

		Users user4=new Users();
		user4.setName("kamal Kant Prakash");
		user4.setCity("India");
		user4.setStatus("current");
		
		List<Users> users=List.of(user1,user2,user3,user4);
		userRepo.saveAll(users);
		users.forEach(user->{
			System.out.println(user);
		});
		*/
		//Updating data from a table  having user id=5
		/*
		Optional<Users> findbyId=userRepo.findById(5);//findById method returns all details of user having id 5
		Users users=findbyId.get();
		System.out.println("Data present before updation "+users);
		users.setName("Deepu");
		users.setCity("India");
		Users result=userRepo.save(users);
		System.out.println("data updated to "+result);
		*/
		//Find all data from a table
		/*
		Iterable<Users> itr= userRepo.findAll();
		itr.forEach(data->System.out.println(data));
		*/
		//deleting the user element from a table using id
		/*
		userRepo.deleteById(5);
		System.out.println("data deleted ");
		*/
		//find by name method from interface of UserRepo
		/*
		List<Users> list=userRepo.findByName("kamal");
		list.forEach(data->System.out.println("data is "+data));
		*/
		//find by name and city method from interface of UserRepo 
				List<Users> li=userRepo.findByNameAndCity("kamal","Gaya");
				li.forEach(data->System.out.println("data is "+data));
				
	}
}


