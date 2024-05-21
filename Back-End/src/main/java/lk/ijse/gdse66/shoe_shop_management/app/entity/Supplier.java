package lk.ijse.gdse66.shoe_shop_management.app.entity;

import jakarta.persistence.*;
import lk.ijse.gdse66.shoe_shop_management.app.util.SupplierCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Supplier {
    @Id
    private String code;
    private String name;
    private String email;
    @Enumerated(EnumType.STRING)
    private SupplierCategory category;
    private String addressLine1;
    private String addressLine2;
    private String mobileContact;
    private String landLineContact;
}
