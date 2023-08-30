package com.example.erp.model.dto.v4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeReqV4DTO {
    @NotNull(message = "Please enter valid username")
    private String username;
    @NotNull
    @NotNull(message = "Please enter your full-name in correct way!")
    @Pattern(regexp="^[A-Z]+$", message="name not valid")
    private String fullName;
    @NotNull
    private String password;
    @Email(message = "Your email not correct!")
    @NotNull
    private String email;
}
