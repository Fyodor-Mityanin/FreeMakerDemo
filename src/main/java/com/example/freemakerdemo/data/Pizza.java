package com.example.freemakerdemo.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pizza {
    private String name;
    private double price;
}