package lk.ijse.gdse66.shoe_shop_management.app.repository;

import lk.ijse.gdse66.shoe_shop_management.app.embedded.OrderDetailPK;
import lk.ijse.gdse66.shoe_shop_management.app.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
public interface OrderDetailRepo extends JpaRepository<OrderDetail, OrderDetailPK> {
    @Query(value = "SELECT * FROM order_detail WHERE order_id = :orderId", nativeQuery = true)
    List<OrderDetail> findOrderDetailsByOrderId(String orderId);

}
