package com.example.spring_data_jpa_pr.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "tbl_customer")
public class Customer {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private int age;
}


