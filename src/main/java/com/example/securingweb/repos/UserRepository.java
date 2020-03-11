package com.example.securingweb.repos;

import com.example.securingweb.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
