package com.shopping.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.shopping.ecommerce.entity.ProductCategory;
                                              // Name of Json Entry       /product-category      
@RepositoryRestResource(collectionResourceRel="productCategory", path="product-category")
@CrossOrigin("http://localhost:4200/")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{

}
