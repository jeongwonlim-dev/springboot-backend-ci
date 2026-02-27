package com.jeongwonlim.springbootbackendci.repository;

import com.jeongwonlim.springbootbackendci.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
