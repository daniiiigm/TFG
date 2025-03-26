package com.gestion.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Document {
    private int id;
    private String name;
    private String archive;
    private LocalDateTime loadDate;
    private User user;
}
