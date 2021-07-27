package com.ning;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import org.springframework.transaction.annotation.Transactional;




public interface UserService {
	/*
	Product createProduct(Product product);

	Product updateProduct(Product product);

	List<Product> getAllProduct();

	Product getProductById(long productId);

	void deleteProduct(long id);
	*/
	User create (String name, String email, String password);
	List<User> getAllUser();
    //User getUserByName(String name);
	
	//User getUserById(long userId);

	//void deleteUser(long id);
}
