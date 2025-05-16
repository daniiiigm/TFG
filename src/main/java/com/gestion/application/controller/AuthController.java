package com.gestion.application.controller;
import com.gestion.application.config.JwtUtil;
import com.gestion.application.model.AuthRequestDTO;
import com.gestion.application.model.UserRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private final JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody AuthRequestDTO requestDTO) {
        if ("user".equals(requestDTO.getUsername()) && "password".equals(requestDTO.getPassword())) {
            String token = jwtUtil.generateToken(requestDTO.getUsername());
            return ResponseEntity.ok(token);
        }
        return ResponseEntity.status(401).body("Invalid credentials");
    }
}
