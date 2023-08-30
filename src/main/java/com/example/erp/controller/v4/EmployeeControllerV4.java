package com.example.erp.controller.v4;


import com.example.erp.model.dto.EmployeeRespDTO;
import com.example.erp.model.dto.v4.EmployeeReqV4DTO;
import com.example.erp.service.v4.EmployeeServiceV4;
import lombok.RequiredArgsConstructor;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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
