package com.example.skb.mappers;

import com.example.skb.dto.ResponseDto;
import com.example.skb.models.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "Spring")
public interface ModelToResponseDto {
    @Mapping(target = "info.id", source = "id")
    @Mapping(target = "info.date", source = "date")
    ResponseDto toResponseDto(Product product);
}
