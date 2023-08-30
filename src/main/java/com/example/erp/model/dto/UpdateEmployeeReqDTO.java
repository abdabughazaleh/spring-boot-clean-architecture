package com.example.erp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmployeeReqDTO {
    private Long id;
    private String fullName;
    private String password;
    private String email;
}
