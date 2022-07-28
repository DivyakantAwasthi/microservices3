package com.divyakant.userservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "userDetails")
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long userId;
        private String firstName;
        private String lastName;
        private String email;
        private Long departmentId;
    }

