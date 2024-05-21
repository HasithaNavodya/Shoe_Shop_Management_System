package lk.ijse.gdse66.shoe_shop_management.app.dto;

import lk.ijse.gdse66.shoe_shop_management.app.util.SupplierCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierDTO {
    private String code;
    private String name;
    private String email;
    private SupplierCategory category;
    private String addressLine1;
    private String addressLine2;
    private String mobileContact;
    private String landLineContact;
}
