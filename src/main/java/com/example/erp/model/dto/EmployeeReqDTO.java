package com.example.erp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeReqDTO {
    private String username;
    private String fullName;
    private String password;
    private String email;
}
