package lk.ijse.gdse66.shoe_shop_management.app.service;

import lk.ijse.gdse66.shoe_shop_management.app.auth.request.SignInRequest;
import lk.ijse.gdse66.shoe_shop_management.app.auth.request.SignUpRequest;
import lk.ijse.gdse66.shoe_shop_management.app.auth.response.JwtAuthResponse;

public interface AuthenticationService {
    JwtAuthResponse signIn(SignInRequest signInRequest);
    JwtAuthResponse signUp(SignUpRequest signUpRequest);
}

