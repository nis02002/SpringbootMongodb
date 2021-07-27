package com.ning;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<User, Long> {
	
	///public User findByUsername(String name);

}
