package com.acchange.apc.repositories;

import com.acchange.apc.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Integer>{
}
