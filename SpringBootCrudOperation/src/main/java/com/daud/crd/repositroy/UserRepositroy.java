package com.daud.crd.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import com.daud.crd.entity.Users;

public interface UserRepositroy extends JpaRepository<Users, Integer>{

}
