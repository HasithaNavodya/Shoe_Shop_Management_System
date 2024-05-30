package lk.ijse.gdse66.shoe_shop_management.app.repository;

import lk.ijse.gdse66.shoe_shop_management.app.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,String> {
    Employee findTopByOrderByCodeDesc();
    List<Employee> findByNameStartingWith(String name);

    boolean existsByEmail(String email);
    Employee findByCode(String id);
    Employee findByEmail(String email);
}
