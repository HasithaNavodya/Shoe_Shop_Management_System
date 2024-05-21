package lk.ijse.gdse66.shoe_shop_management.app.entity;

import jakarta.persistence.*;
import lk.ijse.gdse66.shoe_shop_management.app.util.Gender;
import lk.ijse.gdse66.shoe_shop_management.app.util.Role;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Employee {
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
    @Id
    private Long id;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
