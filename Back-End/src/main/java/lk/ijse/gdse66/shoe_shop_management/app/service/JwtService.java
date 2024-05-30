package lk.ijse.gdse66.shoe_shop_management.app.service;

import org.springframework.security.core.userdetails.UserDetails;

//@Service
public interface JwtService {
    String extractUserName(String token);
    String generateToken(UserDetails userDetails);
    boolean isTokenValid(String token, UserDetails userDetails);
}

