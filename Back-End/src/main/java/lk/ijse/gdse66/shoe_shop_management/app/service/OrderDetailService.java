package lk.ijse.gdse66.shoe_shop_management.app.service;


import lk.ijse.gdse66.shoe_shop_management.app.dto.CustomDTO;
import lk.ijse.gdse66.shoe_shop_management.app.dto.OrderDTO;
import lk.ijse.gdse66.shoe_shop_management.app.dto.OrderDetailDTO;

import java.util.List;

public interface OrderDetailService {
    List<OrderDTO> getAllRefundOrders();
    boolean refundOrder(String orderId);

    boolean refundOrderDetails(CustomDTO customDTO);
    OrderDTO getOrderByOrderId(String orderId);
    List<OrderDetailDTO> getOrderDetailListByOrderId(String orderId);
}
