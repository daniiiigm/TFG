package com.gestion.application.model;

import com.gestion.domain.model.enums.Rol;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDTO {
    private String name;
    private String surname;
    private String email;
    private Rol rol;
}
