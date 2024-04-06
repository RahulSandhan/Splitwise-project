package com.example.SplitwiseApr24.repositories;

import com.example.SplitwiseApr24.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

     public Optional<User> findUserByUserNameEqualsOrPhoneNumber(String userName, String phoneNumber);

     Optional<User> findUserByUserName(String userName);
}
