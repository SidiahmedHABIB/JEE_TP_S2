package com.javaee.filmotheque.repositories;

import com.javaee.filmotheque.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
