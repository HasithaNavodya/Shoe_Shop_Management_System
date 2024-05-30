package lk.ijse.gdse66.shoe_shop_management.app.dto;

import lk.ijse.gdse66.shoe_shop_management.app.util.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserDTO {
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private Role role;
}
