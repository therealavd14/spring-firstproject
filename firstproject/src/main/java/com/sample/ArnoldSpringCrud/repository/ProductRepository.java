package com.sample.ArnoldSpringCrud.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.ArnoldSpringCrud.model.*;

public interface ProductRepository extends JpaRepository<Product, Long> {

}