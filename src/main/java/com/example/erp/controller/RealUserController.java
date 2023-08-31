package com.example.erp.controller;

import com.example.erp.config.UserConfiguration;
import com.example.erp.model.dto.mock.MockUserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users")
@Slf4j
public class RealUserController {
    @Value("${users.get-user-info.url}")
    private String getUserInfo;

    @Autowired
    private UserConfiguration userConfiguration;
    @GetMapping("/user")
    public MockUserDTO user(@RequestParam Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        log.info("getting user details from url : " + getUserInfo);
        MockUserDTO forObject = restTemplate.getForObject(getUserInfo + id, MockUserDTO.class);
        return forObject;
    }


    @GetMapping("/user-config")
    public void userConfig() {
        log.info("user profile url    : {} ",this.userConfiguration.getProfile());
        log.info("user edit url       : {} ",this.userConfiguration.getEdit());
        log.info("user support url    : {} ",this.userConfiguration.getSupport());
    }


}

