package com.g4.model.entity;

import lombok.*;

/**
 *
 * @author diego
 */

@Data
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String dni;
    private String phone;
    private String email;
    private String destination;
}