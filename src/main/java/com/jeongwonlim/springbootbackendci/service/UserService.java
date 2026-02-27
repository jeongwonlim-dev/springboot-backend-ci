package com.jeongwonlim.springbootbackendci.service;

import com.jeongwonlim.springbootbackendci.model.User;
import com.jeongwonlim.springbootbackendci.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    // 생성자 주입
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // 전체 사용자 조회
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
