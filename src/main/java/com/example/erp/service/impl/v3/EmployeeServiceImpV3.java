package com.example.erp.service.impl.v3;

import com.example.erp.model.dto.EmployeeRespDTO;
import com.example.erp.model.dto.v3.EmployeeReqV3DTO;
import com.example.erp.model.entity.Employee;
import com.example.erp.model.mapper.EmployeeMapper;
import com.example.erp.repository.EmployeeRepo;
import com.example.erp.service.v3.EmployeeServiceV3;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpV3 implements EmployeeServiceV3 {
    private final EmployeeRepo employeeRepo;
    private final EmployeeMapper employeeMapper;

    @Override
    public EmployeeRespDTO save(EmployeeReqV3DTO req) throws Exception {
        if (req.getEmail() == null){
            throw new Exception("email cannot be null");
        }
        Employee employee = this.employeeMapper.toEntity(req);
        Employee savedEmployee = this.employeeRepo.save(employee);
        return this.employeeMapper.toRespDTO(savedEmployee);
    }

    @Override
    public EmployeeRespDTO saveV301(EmployeeReqV3DTO req) throws Exception {
        if (req.getEmail() == null){
            throw new Exception("email not correct! ");
        }
        Employee employee = this.employeeMapper.toEntity(req);
        Employee savedEmployee = this.employeeRepo.save(employee);
        return this.employeeMapper.toRespDTO(savedEmployee);
    }
}
