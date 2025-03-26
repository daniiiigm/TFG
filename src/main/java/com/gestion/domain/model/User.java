package com.gestion.domain.model;

import com.gestion.infrastructure.Rol;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private Rol rol;
    private LocalDate creationDate;

}
