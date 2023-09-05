package com.example.erp.controller.v2;

import com.example.erp.model.dto.EmployeeDTO;
import com.example.erp.model.dto.EmployeeReqDTO;
import com.example.erp.model.dto.EmployeeRespDTO;
import com.example.erp.model.dto.UpdateEmployeeReqDTO;
import com.example.erp.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees/v2")
@RequiredArgsConstructor
public class EmployeeControllerV2 {
    private final EmployeeService employeeService;

    @GetMapping(value = "/{id}")
    public EmployeeDTO getEmployeeByPathParam(@PathVariable("id") Long id) {
        return this.employeeService.get(id);
    }

    @PostMapping(value = "")
    public EmployeeRespDTO save(@RequestBody EmployeeReqDTO req) {
        return this.employeeService.save(req);
    }

    @PostMapping(value = "", params = "1.1.0")
    public EmployeeRespDTO saveV11(@RequestBody EmployeeReqDTO req) {
        return this.employeeService.saveV11(req);
    }

    @PutMapping(value = "")
    public EmployeeRespDTO update(@RequestBody UpdateEmployeeReqDTO req) throws Exception {
        return this.employeeService.update(req);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        this.employeeService.delete(id);
    }

}
