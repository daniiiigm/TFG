package com.gestion.application.controller;
import com.gestion.application.config.JwtUtil;
import com.gestion.application.model.AuthRequestDTO;
import com.gestion.application.model.UserRequestDTO;
import com.gestion.domain.ports.in.UserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private final JwtUtil jwtUtil;
    private final UserUseCase userUseCase;


    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody AuthRequestDTO requestDTO) {
            String token = userUseCase.login(requestDTO);

            if (token == null){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
            }

            Map<String, String> response = new HashMap<>();
            response.put("token", token);
            return ResponseEntity.ok(response);
    }
}
