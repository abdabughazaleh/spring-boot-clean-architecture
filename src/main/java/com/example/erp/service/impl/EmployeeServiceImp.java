package com.example.erp.service.impl;

import com.example.erp.model.dto.EmployeeDTO;
import com.example.erp.model.dto.EmployeeReqDTO;
import com.example.erp.model.dto.EmployeeRespDTO;
import com.example.erp.model.dto.UpdateEmployeeReqDTO;
import com.example.erp.model.entity.Employee;
import com.example.erp.model.mapper.EmployeeMapper;
import com.example.erp.repository.EmployeeRepo;
import com.example.erp.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImp implements EmployeeService {
    private final EmployeeRepo employeeRepo;
    private final EmployeeMapper employeeMapper;
    @Override
    public EmployeeRespDTO save(EmployeeReqDTO req) {
        Employee employee = this.employeeMapper.toEntity(req);
        Employee savedEmployee = this.employeeRepo.save(employee);
        return this.employeeMapper.toRespDTO(savedEmployee);
    }

    @Override
    public EmployeeRespDTO saveV11(EmployeeReqDTO req) {
        Employee employee = this.employeeMapper.toEntity(req);
        employee.setToken(UUID.randomUUID().toString());
        Employee savedEmployee = this.employeeRepo.save(employee);
        return this.employeeMapper.toRespDTO(savedEmployee);
    }

    @Override
    public String getEmployeeDetailsAsStr(Long id) {
        Optional<Employee> byId = this.employeeRepo.findById(id);
        return byId.get().getFullName() + " | " +byId.get().getEmail() ;
    }

    @Override
    public EmployeeRespDTO update(UpdateEmployeeReqDTO dto) {
        Employee entity = this.employeeMapper.toEntity(dto);
        Employee savedEntity = this.employeeRepo.save(entity);
        return this.employeeMapper.toRespDTO(savedEntity);
    }

    @Override
    public void delete(Long id) {
        Optional<Employee> byId = this.employeeRepo.findById(id);
        byId.get().setDeletedAt(LocalDateTime.now());
        this.employeeRepo.save(byId.get());
    }

    @Override
    public EmployeeDTO get(Long id) {
        Optional<Employee> byId = this.employeeRepo.findById(id);
        return this.employeeMapper.toDTO(byId.get());
    }


}
