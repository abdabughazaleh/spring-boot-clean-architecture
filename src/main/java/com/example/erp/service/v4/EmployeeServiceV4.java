package com.example.erp.service.v4;

import com.example.erp.model.dto.EmployeeReqDTO;
import com.example.erp.model.dto.EmployeeRespDTO;
import com.example.erp.model.dto.v4.EmployeeReqV4DTO;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeServiceV4 {
    EmployeeRespDTO save(EmployeeReqV4DTO req);
}
