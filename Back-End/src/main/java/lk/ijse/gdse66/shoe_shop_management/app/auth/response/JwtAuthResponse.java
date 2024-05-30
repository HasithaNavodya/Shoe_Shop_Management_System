package lk.ijse.gdse66.shoe_shop_management.app.auth.response;

import lk.ijse.gdse66.shoe_shop_management.app.util.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JwtAuthResponse {
    private String token;
    private Role role;
}

