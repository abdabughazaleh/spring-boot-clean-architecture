package com.example.erp.controller.v4;


import com.example.erp.model.dto.EmployeeRespDTO;
import com.example.erp.model.dto.v4.EmployeeReqV4DTO;
import com.example.erp.service.v4.EmployeeServiceV4;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/employees/v4")
@RequiredArgsConstructor
public class EmployeeControllerV4 {

    private final EmployeeServiceV4 employeeServiceV4;

    @PostMapping(value = "")
    public EmployeeRespDTO save(@RequestBody @Valid EmployeeReqV4DTO req) {
        return this.employeeServiceV4.save(req);
    }

}
