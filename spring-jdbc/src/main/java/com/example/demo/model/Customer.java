package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Data
//Class annotated with @component will be registered as bean
@Component
public class Customer {
    
    int customerId;
    String customerName;
    String email;

}

