package com.tychicus.inventoryservice.service.inventoryService;

import com.tychicus.inventoryservice.dto.InventoryResponse;

import java.util.List;

public interface InventoryService {
    public List<InventoryResponse> isInStock(List<String> skuCodes);
}
