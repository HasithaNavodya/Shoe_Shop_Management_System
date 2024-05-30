package lk.ijse.gdse66.shoe_shop_management.app.controller;

import lk.ijse.gdse66.shoe_shop_management.app.auth.request.SignInRequest;
import lk.ijse.gdse66.shoe_shop_management.app.auth.request.SignUpRequest;
import lk.ijse.gdse66.shoe_shop_management.app.auth.response.JwtAuthResponse;
import lk.ijse.gdse66.shoe_shop_management.app.dto.UserDTO;
import lk.ijse.gdse66.shoe_shop_management.app.service.AuthenticationService;
import lk.ijse.gdse66.shoe_shop_management.app.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")

public class UserController {

    private final AuthenticationService authenticationService;

    @Autowired
    private UserService userService;

    @PostMapping("/signIn")
    public ResponseEntity<JwtAuthResponse> signIn(@RequestBody SignInRequest signInRequest){
        return ResponseEntity.ok(authenticationService.signIn(signInRequest));
    }
    @PostMapping("/signUp")
    public ResponseEntity<JwtAuthResponse> signUp(@RequestBody SignUpRequest signUpRequest){
        return ResponseEntity.ok(authenticationService.signUp(signUpRequest));
    }

    @GetMapping("/searchByEmail")
    public UserDTO searchByEmail(@RequestParam("email")String email){
        return userService.searchByEmail(email);
    }

    @PatchMapping("/update")
    public UserDTO update(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }
}

