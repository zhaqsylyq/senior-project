package com.seniorproject.first.prototype.repository;

import com.seniorproject.first.prototype.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findUserByUserEmail(String userEmail);
    //public Optional findUserByUserEmail(String userEmail);
}
