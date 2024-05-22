package com.jair.curso.webapp.springbootwebapp.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jair.curso.webapp.springbootwebapp.models.User;
import com.jair.curso.webapp.springbootwebapp.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {
        UserDto userDto = new UserDto();

        User user = new User("Jair", "Deyner");

        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");

        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        User jair = new User("Jair", "Tello");
        User maria = new User("Maria", "Guzman");
        User pepe = new User("Pepe", "Parco");

        List<User> users = Arrays.asList(jair, maria, pepe);

        return users;
    }

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap() {
        User user = new User("Jair", "Deyner");

        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Mundo Spring Boot");
        body.put("user", user);

        return body;
    }
}
