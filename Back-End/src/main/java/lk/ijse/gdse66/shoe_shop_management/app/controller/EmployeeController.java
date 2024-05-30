package lk.ijse.gdse66.shoe_shop_management.app.controller;

import lk.ijse.gdse66.shoe_shop_management.app.dto.EmployeeDTO;
import lk.ijse.gdse66.shoe_shop_management.app.service.EmployeeService;
import lk.ijse.gdse66.shoe_shop_management.app.util.Gender;
import lk.ijse.gdse66.shoe_shop_management.app.util.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("api/v1/employee")
@CrossOrigin(origins = "*")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public EmployeeController() {
        System.out.println("employee working !");
    }

    @GetMapping("/nextId")
    public String nextId(){
        return employeeService.generateNextId();
    }

    @PostMapping(value = "/save",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public EmployeeDTO save(@RequestParam("code") String code,
                            @RequestParam("name") String name,
                            @RequestParam("email") String email,
                            @RequestParam("proPic") MultipartFile proPic,
                            @RequestParam("contact") String contact,
                            @RequestParam("gender") Gender gender,
                            @RequestParam("designation") String designation,
                            @RequestParam("role") Role role,
                            @RequestParam("civilStatus") String civilStatus,
                            @RequestParam("branch") String branch,
                            @RequestParam("guardianName") String guardianName,
                            @RequestParam("guardianContact") String guardianContact,
                            @RequestParam("addressLine1") String addressLine1,
                            @RequestParam("addressLine2") String addressLine2,
                            @RequestParam("dob") String dob,
                            @RequestParam("joinDate") String joinDate) throws IOException, ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date newDate = dateFormat.parse(dob);
        Date newJoinDate = dateFormat.parse(joinDate);

        String image = Base64.getEncoder().encodeToString(proPic.getBytes());
        EmployeeDTO employeeDTO = new EmployeeDTO(code,name,image,gender,civilStatus,designation,role,newDate,newJoinDate,branch,
                addressLine1, addressLine2,contact,email,guardianName,guardianContact);
        return employeeService.saveEmployee(employeeDTO);
    }

    @PatchMapping (value = "/update",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public EmployeeDTO update( @RequestParam("code") String code,
                               @RequestParam("name") String name,
                               @RequestParam("email") String email,
                               @RequestParam("proPic") MultipartFile proPic,
                               @RequestParam("contact") String contact,
                               @RequestParam("gender") Gender gender,
                               @RequestParam("designation") String designation,
                               @RequestParam("role") Role role,
                               @RequestParam("civilStatus") String civilStatus,
                               @RequestParam("branch") String branch,
                               @RequestParam("guardianName") String guardianName,
                               @RequestParam("guardianContact") String guardianContact,
                               @RequestParam("addressLine1") String addressLine1,
                               @RequestParam("addressLine2") String addressLine2,
                               @RequestParam("dob") String dob,
                               @RequestParam("joinDate") String joinDate) throws IOException, ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date newDate = dateFormat.parse(dob);
        Date newJoinDate = dateFormat.parse(joinDate);

        String image = Base64.getEncoder().encodeToString(proPic.getBytes());
        EmployeeDTO employeeDTO = new EmployeeDTO(code,name,image,gender,civilStatus,designation,role,newDate,newJoinDate,branch,
                addressLine1, addressLine2,contact,email,guardianName,guardianContact);
        return employeeService.updateEmployee(employeeDTO);
    }

    @DeleteMapping("/delete")
    public boolean delete(@RequestParam("code") String code){
        return employeeService.deleteEmployee(code);
    }

    @GetMapping("getAll")
    private List<EmployeeDTO> getAllCustomers(){
        List<EmployeeDTO> employeeDTOs = new ArrayList<>();
        return employeeService.getAllEmployee();
    }

    @GetMapping("/search")
    public List<EmployeeDTO> search(@RequestParam ("name") String name){
        return employeeService.searchEmployee(name);
    }

    @GetMapping("/searchByEmail")
    public EmployeeDTO searchByEmail(@RequestParam("email")String email){
        return employeeService.searchByEmail(email);
    }


}
