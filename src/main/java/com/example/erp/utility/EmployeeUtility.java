package com.example.erp.utility;

import com.example.erp.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmployeeUtility {
    private final EmployeeService employeeService;

    public String getEmployeeDetails(Long id){
        return this.employeeService.getEmployeeDetailsAsStr(id);
    }
}
