package com.example.flipcommerce.Dto.ResponseDto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductWithQuantityDto {

    String productName;

    int quantity;
}
