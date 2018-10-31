package com.nxstep.it.ProductReservation.Service;

import com.nxstep.it.ProductReservation.Repository.ProductRepository;
import com.nxstep.it.ProductReservation.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;


    public Product createProduct(Product p)
    {
        productRepository.save(p);
        return p;
    }


}
