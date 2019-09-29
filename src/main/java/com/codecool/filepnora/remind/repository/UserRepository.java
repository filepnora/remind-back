package com.codecool.filepnora.remind.repository;

import com.codecool.filepnora.remind.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User getById(Long id);

    @Query("SELECT u FROM User u")
    List<User> getAllUsers();
}
