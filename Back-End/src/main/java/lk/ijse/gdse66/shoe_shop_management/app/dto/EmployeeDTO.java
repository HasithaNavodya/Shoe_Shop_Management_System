package lk.ijse.gdse66.shoe_shop_management.app.dto;

import lk.ijse.gdse66.shoe_shop_management.app.util.Gender;
import lk.ijse.gdse66.shoe_shop_management.app.util.Role;
import lombok.*;
import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDTO implements Serializable {
    private String code;
    private String name;
    private String proPic;
    private Gender gender;
    private String civilStatus;
    private String designation;
    private Role role;
    private Date dob;
    private Date joinDate;
    private String branch;
    private String addressLine1;
    private String addressLine2;
    private String contact;
    private String email;
    private String guardianName;
    private String guardianContact;
}
