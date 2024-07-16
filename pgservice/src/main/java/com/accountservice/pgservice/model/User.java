package com.accountservice.pgservice.model;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@Data
@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
//    @Column("user_name")
    private String name;
    private  String location;
    private  Long accountNumber;
}
