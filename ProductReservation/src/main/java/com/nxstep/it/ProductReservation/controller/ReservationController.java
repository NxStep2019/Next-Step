package com.nxstep.it.ProductReservation.controller;


import com.nxstep.it.ProductReservation.Service.ProductService;
import com.nxstep.it.ProductReservation.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product_reservation")
public class ReservationController {

    @Autowired
    ProductService service;

    @RequestMapping(value = "/createProduct" , method = RequestMethod.POST )
    //@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Product> saveProduct(@RequestBody Product p)
    {
        Product outP = service.createProduct(p);
        return new ResponseEntity<Product>(outP, HttpStatus.CREATED);

    }
}
