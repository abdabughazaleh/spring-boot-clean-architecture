package com.example.erp.service.impl.v4;

import com.example.erp.model.dto.EmployeeDTO;
import com.example.erp.model.dto.EmployeeReqDTO;
import com.example.erp.model.dto.EmployeeRespDTO;
import com.example.erp.model.dto.UpdateEmployeeReqDTO;
import com.example.erp.model.dto.v4.EmployeeReqV4DTO;
import com.example.erp.model.entity.Employee;
import com.example.erp.model.mapper.EmployeeMapper;
import com.example.erp.repository.EmployeeRepo;
import com.example.erp.service.EmployeeService;
import com.example.erp.service.v4.EmployeeServiceV4;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpV4 implements EmployeeServiceV4 {
    private final EmployeeRepo employeeRepo;
    private final EmployeeMapper employeeMapper;
    @Override
    public EmployeeRespDTO save(EmployeeReqV4DTO req) {
        Employee employee = this.employeeMapper.toEntity(req);
        Employee savedEmployee = this.employeeRepo.save(employee);
        return this.employeeMapper.toRespDTO(savedEmployee);
    }

}
