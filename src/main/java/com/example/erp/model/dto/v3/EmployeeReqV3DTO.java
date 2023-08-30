package com.example.erp.model.dto.v3;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeReqV3DTO {
    private String username;
    private String fullName;
    private String password;
    private String email;
}
