package com.infnet.products.api.service;

import com.infnet.products.api.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private AtomicLong counter = new AtomicLong();

    public List<Product> findAll() {
        return products;
    }

    public Optional<Product> findById(Long id) {
        return products.stream().filter(product -> product.getId().equals(id)).findFirst();
    }

    public Product save(Product product) {
        product.setId(counter.incrementAndGet());
        products.add(product);
        return product;
    }

    public Optional<Product> update(Long id, Product updatedProduct) {
        return findById(id).map(existingProduct -> {
            existingProduct.setName(updatedProduct.getName());
            existingProduct.setDescription(updatedProduct.getDescription());
            existingProduct.setCategory(updatedProduct.getCategory());
            existingProduct.setPrice(updatedProduct.getPrice());

            return existingProduct;
        });
    }

    public boolean delete(Long id) {
        return products.removeIf(product -> product.getId().equals(id));
    }
}