package com.ning;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public List<User> getAllUser() {
		return this.userRepository.findAll();
	}

	public User create(String firstName,String lastName, String password) {
		return userRepository.save(new User(firstName, lastName, password));
	}
	
	/*public User getUserByName(String name) {
		return userRepository.findByUsername(name);
			
	}
	*/
	
	
	
}
