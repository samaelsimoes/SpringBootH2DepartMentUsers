package com.dev.listaUserDept.repositories;

import com.dev.listaUserDept.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
