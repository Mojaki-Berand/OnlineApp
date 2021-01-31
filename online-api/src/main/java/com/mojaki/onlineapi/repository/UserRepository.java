package com.mojaki.onlineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mojaki.onlineapi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
