package com.mcjerz.aster.repository;


import com.mcjerz.aster.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {}
