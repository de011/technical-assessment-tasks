package com.assessment.task.service;

import com.assessment.task.dto.AuthResponseDTO;
import com.assessment.task.dto.UserDTO;

public interface AuthenticationService {
    AuthResponseDTO signUp(UserDTO userDTO);
    AuthResponseDTO signIn(String email, String password);
    String refreshToken(String refreshToken);
}
