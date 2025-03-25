package com.example.skb.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {
    private double price;
    private Info info;

    @Data
    public static class Info {
        private long id;
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "UTC")//для того, чтобы красиво
        // дата выводилась
        private Date date;
    }
}
