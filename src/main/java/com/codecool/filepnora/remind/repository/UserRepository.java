package com.codecool.filepnora.remind.repository;

import com.codecool.filepnora.remind.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
