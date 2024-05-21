package lk.ijse.gdse66.shoe_shop_management.app.service;

import lk.ijse.gdse66.shoe_shop_management.app.dto.InventoryDTO;
import lk.ijse.gdse66.shoe_shop_management.app.dto.SupplierDTO;

import java.util.List;

public interface InventoryService {
    InventoryDTO saveItem(InventoryDTO inventoryDTO);
    InventoryDTO updateItem(InventoryDTO inventoryDTO);
    boolean deleteItem(String id);
    List<InventoryDTO> getAllItem();
    List<InventoryDTO> searchItemByName(String name);
    InventoryDTO searchItemById(String id);
    String generateNextId();
    List<SupplierDTO> loadSupplierCode();
}
