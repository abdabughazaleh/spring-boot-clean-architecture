package com.example.erp.controller;


import com.example.erp.model.dto.EmployeeDTO;
import com.example.erp.model.dto.EmployeeReqDTO;
import com.example.erp.model.dto.EmployeeRespDTO;
import com.example.erp.model.dto.UpdateEmployeeReqDTO;
import com.example.erp.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController("Main Employee Controller")
@RequestMapping("/employees")
@RequiredArgsConstructor
@Slf4j
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping(value = "/employee/{id}")
    public EmployeeDTO getEmployeeByPathParam(@PathVariable("id") Long id) {
        log.info("Employee ID : {} ", id);
        return this.employeeService.get(id);
    }

    @PostMapping(value = "/employee")
    public EmployeeRespDTO save(@RequestBody EmployeeReqDTO req) {
        log.info("New request coming  with request details :  {} ", req);
        return this.employeeService.save(req);
    }

    @PostMapping(value = "/employee", params = "v=1.1.0")
    public EmployeeRespDTO saveV11(@RequestBody EmployeeReqDTO req) {
        return this.employeeService.saveV11(req);
    }

    @PutMapping(value = "/employee")
    public EmployeeRespDTO update(@RequestBody UpdateEmployeeReqDTO req) throws Exception {
        return this.employeeService.update(req);
    }

    @DeleteMapping(value = "/employee/{id}")
    public void delete(@PathVariable Long id) {
        this.employeeService.delete(id);
    }


}
