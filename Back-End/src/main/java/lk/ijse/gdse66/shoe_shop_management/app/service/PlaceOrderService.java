package lk.ijse.gdse66.shoe_shop_management.app.service;



import lk.ijse.gdse66.shoe_shop_management.app.dto.CustomerDTO;
import lk.ijse.gdse66.shoe_shop_management.app.dto.InventoryDTO;
import lk.ijse.gdse66.shoe_shop_management.app.dto.OrderDTO;

import java.util.List;

public interface PlaceOrderService {

    void placeOrder(OrderDTO orderDTO);
    InventoryDTO searchItemByCode(String code);
    List<String> getAllItemCodes();
    CustomerDTO searchCustomerById(String code);
    List<String> getAllCustomerIds();
    String generateNextOrderId();
}
