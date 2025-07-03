package org.example.ecommercespring.dto;

import lombok.*;

import java.util.List;

@Data // or just @Getter and @Setter if you only need those
@Builder
public class FakeStoreCategoryResponseDTO {
    private String status;

    private String message;

    private List<String> categories;
}
