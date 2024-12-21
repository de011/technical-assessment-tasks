/*
package com.assessment.task.controller;

import com.assessment.task.dto.UserDTO;
import com.assessment.task.dto.AuthResponseDTO;
import com.assessment.task.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public String register(@RequestBody UserDTO userDTO) {
        userService.registerUser(userDTO);
        return "User registered successfully";
    }

    @PostMapping("/signin")
    public AuthResponseDTO signin(@RequestBody UserDTO userDTO) {
        userService.authenticateUser(userDTO.getEmail(), userDTO.getPassword());
        return new AuthResponseDTO("<JWT_ACCESS_TOKEN>", "<JWT_REFRESH_TOKEN>");
    }
}
*/
