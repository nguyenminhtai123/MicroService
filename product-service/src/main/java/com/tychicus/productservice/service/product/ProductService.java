package com.tychicus.productservice.service.product;

import com.tychicus.productservice.dto.ProductRequest;
import com.tychicus.productservice.dto.ProductResponse;
import com.tychicus.productservice.model.Product;

import java.util.List;

public interface ProductService {

    public void createProduct(ProductRequest productRequest);

    public List<ProductResponse> getAllProducts();
}
