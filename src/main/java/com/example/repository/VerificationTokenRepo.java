package com.example.repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration; 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import com.example.model.VerificationToken;
 @Repository
public interface VerificationTokenRepo extends JpaRepository<VerificationToken,Long> 
 {
	 
	VerificationToken findByToken(String token);	 
 

}
