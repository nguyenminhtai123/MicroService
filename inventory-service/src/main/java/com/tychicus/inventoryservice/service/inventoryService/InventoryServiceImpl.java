package com.tychicus.inventoryservice.service.inventoryService;

import com.tychicus.inventoryservice.dto.InventoryResponse;
import com.tychicus.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryServiceImpl implements InventoryService{

    private final InventoryRepository inventoryRepository;

    @Override
    public List<InventoryResponse> isInStock(List<String> skuCodes) {
        log.info("Checking inventory for skuCodes: {}", skuCodes);

        return inventoryRepository.findBySkuCodeIn(skuCodes).stream()
                .map(inventory -> InventoryResponse.builder()
                        .skuCode(inventory.getSkuCode())
                        .isInStock(inventory.getQuantity() > 0)
                        .build())
                .toList();
    }
}
