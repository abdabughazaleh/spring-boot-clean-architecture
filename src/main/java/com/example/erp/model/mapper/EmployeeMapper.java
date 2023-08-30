package com.example.erp.model.mapper;

import com.example.erp.model.dto.EmployeeDTO;
import com.example.erp.model.dto.EmployeeReqDTO;
import com.example.erp.model.dto.EmployeeRespDTO;
import com.example.erp.model.dto.UpdateEmployeeReqDTO;
import com.example.erp.model.dto.v3.EmployeeReqV3DTO;
import com.example.erp.model.dto.v4.EmployeeReqV4DTO;
import com.example.erp.model.entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    Employee toEntity(UpdateEmployeeReqDTO dto);
    Employee toEntity(EmployeeReqDTO dto);
    Employee toEntity(EmployeeReqV3DTO dto);
    Employee toEntity(EmployeeReqV4DTO dto);
    EmployeeRespDTO toRespDTO(Employee entity);
    EmployeeDTO toDTO(Employee entity);
    Employee toEntity(EmployeeDTO dto);
}
