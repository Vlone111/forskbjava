package com.example.skb.services;

import com.example.skb.dto.RequestDto;
import com.example.skb.mappers.ModelToRequestDto;
import com.example.skb.models.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class ProductService {
    private final ModelToRequestDto modelToRequestDto;

    public Product setId(RequestDto requestDto) {
        Product product = modelToRequestDto.toProduct(requestDto);
        product.setId(UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE);
        return product;
    }
}
