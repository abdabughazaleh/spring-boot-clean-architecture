package com.example.erp.service;

import com.example.erp.model.dto.EmployeeDTO;
import com.example.erp.model.dto.EmployeeReqDTO;
import com.example.erp.model.dto.EmployeeRespDTO;
import com.example.erp.model.dto.UpdateEmployeeReqDTO;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    EmployeeRespDTO save(EmployeeReqDTO req);
    EmployeeRespDTO saveV11(EmployeeReqDTO req);
    String getEmployeeDetailsAsStr(Long id);
    EmployeeRespDTO update(UpdateEmployeeReqDTO dto);

    void delete(Long id);
    EmployeeDTO get(Long id);
}
