package com.example.erp.service.v3;

import com.example.erp.model.dto.EmployeeDTO;
import com.example.erp.model.dto.EmployeeReqDTO;
import com.example.erp.model.dto.EmployeeRespDTO;
import com.example.erp.model.dto.UpdateEmployeeReqDTO;
import com.example.erp.model.dto.v3.EmployeeReqV3DTO;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeServiceV3 {
    EmployeeRespDTO save(EmployeeReqV3DTO req) throws Exception;

    EmployeeRespDTO saveV301(EmployeeReqV3DTO req) throws Exception;
}

