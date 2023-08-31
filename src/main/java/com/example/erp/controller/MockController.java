package com.example.erp.controller;

import com.example.erp.model.dto.mock.MockUserDTO;
import com.sun.deploy.Environment;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mock-data")
@Profile(value = {"local", "sit", "dev", "uat"})
public class MockController {
    @GetMapping("/user")
    public MockUserDTO user(@RequestParam Integer id) {
        return MockUserDTO.builder()
                .userId(id)
                .id(100)
                .completed(false)
                .title("just for testing")
                .build();
    }
}
