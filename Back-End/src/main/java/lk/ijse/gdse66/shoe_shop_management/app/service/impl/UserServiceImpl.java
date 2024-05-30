package lk.ijse.gdse66.shoe_shop_management.app.service.impl;


import lk.ijse.gdse66.shoe_shop_management.app.dto.UserDTO;
import lk.ijse.gdse66.shoe_shop_management.app.entity.User;
import lk.ijse.gdse66.shoe_shop_management.app.repository.EmployeeRepo;
import lk.ijse.gdse66.shoe_shop_management.app.repository.UserRepo;
import lk.ijse.gdse66.shoe_shop_management.app.service.UserService;
import lk.ijse.gdse66.shoe_shop_management.app.service.exception.DuplicateRecordException;
import lk.ijse.gdse66.shoe_shop_management.app.service.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final EmployeeRepo employeeRepo;
    private final ModelMapper mapper;

    @Override
    public UserDetailsService userDetailService() {
        return username -> userRepo.findByEmail(username)
                .orElseThrow(() -> new
                        UsernameNotFoundException(
                        "user not found"));
    }

    @Override
    public void Save(UserDTO userDTO) {
        if (userRepo.existsById(userDTO.getEmail())){
            throw new DuplicateRecordException("User Email is already exists!");
        } else if (!employeeRepo.existsByEmail(userDTO.getEmail())) {
            throw new NotFoundException("No Employee can be found this email");
        } else {
            userRepo.save(mapper.map(userDTO, User.class));
        }
    }
    @Override
    public UserDTO searchByEmail(String email) {
        return mapper.map(userRepo.findByEmail(email),UserDTO.class);
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) {
        if (!userRepo.existsById(userDTO.getEmail())){
            throw new NotFoundException("user Code does not exists!");
        }
        System.out.println("userServiceUpdate");
        return mapper.map(userRepo.save(mapper.map(userDTO, User.class)), UserDTO.class);
    }
}

