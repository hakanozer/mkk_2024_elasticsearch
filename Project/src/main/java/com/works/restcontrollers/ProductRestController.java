package com.works.restcontrollers;

import com.works.entities.Product;
import com.works.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("products")
public class ProductRestController {

    final ProductService productService;

    @PostMapping("saveAll")
    public Iterable<Product> saveAll(@RequestBody List<Product> products) {
        return productService.saveAll(products);
    }

    @GetMapping("search")
    public List<Product> search(
            @RequestParam String title,
            @RequestParam int page

    ) {
        return productService.findAllName(title, page );
    }

}
