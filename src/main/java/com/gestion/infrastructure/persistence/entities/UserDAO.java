package com.gestion.infrastructure.persistence.entities;


import com.gestion.infrastructure.Rol;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class UserDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String surname;
    private String email;
    @Enumerated(EnumType.STRING)
    private Rol rol;
    @NotNull
    private LocalDate creationDate;
}
