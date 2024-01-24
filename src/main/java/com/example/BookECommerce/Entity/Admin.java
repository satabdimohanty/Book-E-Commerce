package com.example.BookECommerce.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="AdminTbl1")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int adminId;
    private String adminName;
    private String adminEmail;

    private String adminPassword;
    private String adminNumber;
}
