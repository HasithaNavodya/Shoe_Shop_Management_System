package lk.ijse.gdse66.shoe_shop_management.app.service;

import lk.ijse.gdse66.shoe_shop_management.app.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
    UserDetailsService userDetailService();
    void Save(UserDTO userDTO);
    UserDTO searchByEmail(String email);
    UserDTO updateUser(UserDTO userDTO);
}
