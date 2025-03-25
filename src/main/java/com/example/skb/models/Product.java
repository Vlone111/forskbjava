package com.example.skb.models;

import lombok.Data;

import java.util.Date;

@Data
public class Product {
    private long id;
    private double price;
    private Date date;
}
