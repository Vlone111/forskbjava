package com.example.skb.controller;

import com.example.skb.dto.RequestDto;
import com.example.skb.dto.ResponseDto;
import com.example.skb.mappers.ModelToResponseDto;
import com.example.skb.models.Product;
import com.example.skb.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class JsonController {
    private final ProductService productService;
    private final ModelToResponseDto modelToResponseDto;

    @PostMapping("/setid")
    public ResponseEntity<ResponseDto> setid(@RequestBody RequestDto requestDto) {
        Product product = productService.setId(requestDto);
        ResponseDto responseDto = modelToResponseDto.toResponseDto(product);
        return ResponseEntity.ok(modelToResponseDto.toResponseDto(productService.setId(requestDto)));
    }
}
