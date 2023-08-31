package com.example.erp.model.dto.mock;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MockUserDTO {
    private Integer userId;
    private Integer id;
    private String title;
    private Boolean completed;
}
