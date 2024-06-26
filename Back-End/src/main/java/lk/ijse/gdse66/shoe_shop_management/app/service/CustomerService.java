package lk.ijse.gdse66.shoe_shop_management.app.service;

import lk.ijse.gdse66.shoe_shop_management.app.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    CustomerDTO updateCustomer(CustomerDTO customerDTO);
    boolean deleteCustomer(String id);
    List<CustomerDTO> getAllCustomers();
    List<CustomerDTO> searchCustomer(String name);

    String generateNextId();
}
