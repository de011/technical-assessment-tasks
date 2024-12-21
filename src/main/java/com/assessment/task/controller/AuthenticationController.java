package com.assessment.task.controller;

import com.assessment.task.dto.AuthResponseDTO;
import com.assessment.task.dto.UserDTO;
import com.assessment.task.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<String> signUp(@RequestBody UserDTO userDTO) {
        try {
            authenticationService.signUp(userDTO);
            return new ResponseEntity<>("User registered successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Registration failed: " + e.getMessage(), HttpStatus.BAD_REQUEST); // Return 400 if registration fails
        }
    }

    @PostMapping("/signin")
    public ResponseEntity<AuthResponseDTO> signIn(@RequestBody UserDTO userDTO) {
        try {
            AuthResponseDTO authResponse = authenticationService.signIn(userDTO.getEmail(), userDTO.getPassword());
            return new ResponseEntity<>(authResponse, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
        }
    }

    @PostMapping("/refresh")
    public ResponseEntity<String> refreshToken(@RequestBody String refreshToken) {
        try {
            String newAccessToken = authenticationService.refreshToken(refreshToken);
            return new ResponseEntity<>(newAccessToken, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error refreshing token: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
