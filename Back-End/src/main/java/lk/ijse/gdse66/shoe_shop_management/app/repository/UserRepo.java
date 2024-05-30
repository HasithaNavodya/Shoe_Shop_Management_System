package lk.ijse.gdse66.shoe_shop_management.app.repository;

import lk.ijse.gdse66.shoe_shop_management.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User,String > {
    Optional<User> findByEmail(String email);
    User getAllByEmail(String email);
}
