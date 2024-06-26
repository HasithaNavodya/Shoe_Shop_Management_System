package lk.ijse.gdse66.shoe_shop_management.app.repository;

import lk.ijse.gdse66.shoe_shop_management.app.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface CustomerRepo extends JpaRepository<Customer,String> {
    Customer findTopByOrderByCodeDesc();
    List<Customer> findByNameStartingWith(String name);
    Customer findByCode(String id);
    /*custom JPQL query*/
    @Query("SELECT c.code FROM Customer c")
    List<String> findAllCustomerCodes();
}
