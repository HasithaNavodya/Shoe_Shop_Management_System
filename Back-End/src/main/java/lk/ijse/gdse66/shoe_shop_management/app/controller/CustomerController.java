package lk.ijse.gdse66.shoe_shop_management.app.controller;

import lk.ijse.gdse66.shoe_shop_management.app.dto.CustomerDTO;
import lk.ijse.gdse66.shoe_shop_management.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin(origins = "*")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public CustomerController() {
        System.out.println("customer working !");
    }

    @GetMapping("/nextId")
    public String nextId(){
        return customerService.generateNextId();
    }


    @PostMapping("/save")
    public CustomerDTO save(@RequestBody CustomerDTO customerDTO){
        System.out.println(customerDTO);
        return customerService.saveCustomer(customerDTO);
    }

    @PatchMapping ("/update")
    public CustomerDTO update(@RequestBody CustomerDTO customerDTO){
        System.out.println(customerDTO);
        return customerService.updateCustomer(customerDTO);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> delete(@RequestParam("code") String code) {
        boolean isDeleted = customerService.deleteCustomer(code);
        if (isDeleted) {
            return ResponseEntity.ok().body("{\"message\": \"Customer deleted successfully\"}");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"message\": \"Customer does not exist\"}");
        }
    }

    @GetMapping("GetAll")
    public List<CustomerDTO> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/search")
    public List<CustomerDTO> search(@RequestParam("name") String name){
        return customerService.searchCustomer(name);
    }



}