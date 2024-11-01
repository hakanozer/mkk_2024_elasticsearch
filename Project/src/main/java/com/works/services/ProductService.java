package com.works.services;

import com.works.entities.Product;
import com.works.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    final ProductRepository productRepository;

    public Iterable<Product> saveAll(List<Product> productList) {
        return productRepository.saveAll(productList);
    }

    public List<Product> findAllName(String name, int page) {
        Pageable pageable = PageRequest.of(page, 10);
        return productRepository.findByTitle(name, pageable);
    }

}
