package lk.ijse.gdse66.shoe_shop_management.app.service;

import lk.ijse.gdse66.shoe_shop_management.app.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {

    EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);
    EmployeeDTO updateEmployee(EmployeeDTO employeeDTO);
    boolean deleteEmployee(String id);
    List<EmployeeDTO> getAllEmployees();
    List<EmployeeDTO> searchEmployee(String name);
    String generateNextId();
}
