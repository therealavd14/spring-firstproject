package com.sample.ArnoldSpringCrud.service;

import java.util.List;

import com.sample.ArnoldSpringCrud.model.*;

public interface ProductService {
    Product createProduct(Product product);

    Product updateProduct(Product product);

    List < Product > getAllProduct();

    Product getProductById(long productId);

    void deleteProduct(long id);
}