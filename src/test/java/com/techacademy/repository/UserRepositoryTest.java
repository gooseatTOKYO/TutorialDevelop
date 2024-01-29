package com.techacademy.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.techacademy.entity.User;

@SpringBootTest

class UserRepositoryTest {
    private final UserRepository userRepository;

    @Autowired
    UserRepositoryTest(UserRepository repository) {
        this.userRepository = repository;
    }

    @Test
    void testFindById() {
        User user = userRepository.findById(1).get();
        assertEquals(user.getId(), 1);
        assertEquals(user.getName(), "キラメキ太郎");
    }
}