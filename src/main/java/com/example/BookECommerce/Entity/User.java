package com.example.BookECommerce.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int UserId;
    private String userName;
    private String userEmail;

    private String userPassword;
    private Long userNumber;
}
