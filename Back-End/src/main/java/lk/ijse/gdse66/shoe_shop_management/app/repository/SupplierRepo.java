package lk.ijse.gdse66.shoe_shop_management.app.repository;


import lk.ijse.gdse66.shoe_shop_management.app.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepo extends JpaRepository<Supplier, String> {

    Supplier findTopByOrderByCodeDesc();
    List<Supplier> findByName(String name);

    Supplier findByCode(String id);

}
