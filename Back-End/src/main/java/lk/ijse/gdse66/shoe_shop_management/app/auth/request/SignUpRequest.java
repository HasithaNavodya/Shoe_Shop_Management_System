package lk.ijse.gdse66.shoe_shop_management.app.auth.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SignUpRequest {
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String role;
}

