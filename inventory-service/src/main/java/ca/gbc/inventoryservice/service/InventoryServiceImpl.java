// Inventory Service Implementation

package ca.gbc.inventoryservice.service;

import ca.gbc.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;




@Slf4j
@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {


    private final InventoryRepository inventoryRepository;


    @Override
    public boolean isInStock(String skuCode, Integer quantity) {
        return inventoryRepository.existsBySkuCodeAndQuantityGreaterThanEqual(skuCode, quantity);
    }
}
