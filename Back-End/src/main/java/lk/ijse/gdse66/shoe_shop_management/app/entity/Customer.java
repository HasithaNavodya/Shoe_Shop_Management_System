package lk.ijse.gdse66.shoe_shop_management.app.entity;

import jakarta.persistence.*;
import lk.ijse.gdse66.shoe_shop_management.app.util.CustomerLoyaltyLevel;
import lk.ijse.gdse66.shoe_shop_management.app.util.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Timestamp;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

    @Id
//@GeneratedValue(strategy = GenerationType.AUTO)
    private String code;
    private String name;
    private String email;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String contact;
    private Date dob;
    private String addressLine1;
    private String addressLine2;
    private Date loyaltyDate;

    @Enumerated(EnumType.STRING)
    private CustomerLoyaltyLevel loyaltyLevel;

    private Integer loyaltyPoints;
    private Timestamp recentPurchaseDate;


}
