package org.example.Dao;

import org.example.Entity.Product;

import java.util.List;

public interface ProductDao {
    void save(Product product);
    void delete(Long id);
    List<Product> findAll();
    Product findById(Long id);
}
