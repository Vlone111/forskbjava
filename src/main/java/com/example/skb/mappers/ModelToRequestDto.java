package com.example.skb.mappers;

import org.mapstruct.Mapper;
import com.example.skb.dto.RequestDto;
import com.example.skb.models.Product;
import org.mapstruct.Mapping;

@Mapper(componentModel = "Spring")//если честно не до конца понял зачем эта строчка вообще нужна
public interface ModelToRequestDto {
    @Mapping(target = "date", source = "info.date")
        // таргетируем в явном виде доту, потому что иначе он не видит
    Product toProduct(RequestDto requestDto);
}
