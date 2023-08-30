package com.example.erp.controller.v3;

import com.example.erp.model.dto.EmployeeRespDTO;
import com.example.erp.model.dto.v3.EmployeeReqV3DTO;
import com.example.erp.service.v3.EmployeeServiceV3;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees/v3")
@RequiredArgsConstructor
public class EmployeeControllerV3 {
    private final EmployeeServiceV3 employeeServiceV3;

    @PostMapping(value = "")
    public EmployeeRespDTO save(@RequestBody EmployeeReqV3DTO req) throws Exception {
        return this.employeeServiceV3.save(req);
    }
    @PostMapping(value = "",params = "v=0.1")
    public EmployeeRespDTO saveV301(@RequestBody EmployeeReqV3DTO req) throws Exception {
        return this.employeeServiceV3.saveV301(req);
    }
}
