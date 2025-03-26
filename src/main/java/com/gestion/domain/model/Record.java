package com.gestion.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Record {
    private int id;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private User user;
}
