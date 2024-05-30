package lk.ijse.gdse66.shoe_shop_management.app.dto;

import lk.ijse.gdse66.shoe_shop_management.app.util.CustomerLoyaltyLevel;
import lk.ijse.gdse66.shoe_shop_management.app.util.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class CustomerDTO implements Serializable {
    private String code;
    private String name;
    private String email;
    private Gender gender;
    private String contact;
    private Date dob;
    private String addressLine1;
    private String addressLine2;
    private Date loyaltyDate;
    private CustomerLoyaltyLevel loyaltyLevel;
    private Integer loyaltyPoints;
    private Timestamp recentPurchaseDate;
}
