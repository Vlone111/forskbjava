package com.example.skb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestDto {
    private double price;
    private Info info;

    @Data
    public static class Info {
        private Date date;
    }
}
