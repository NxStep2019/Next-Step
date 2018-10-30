package com.ns.ws.productregistration.controller;

import com.ns.ws.productregistration.model.IProduct;
import com.ns.ws.productregistration.model.SimpleProduct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by singsate on 30-Oct-18.
 */
@RestController
@RequestMapping("product-registration")
public class ProductRegistrationController {

    private static final Logger log = LoggerFactory.getLogger(ProductRegistrationController.class);
    @RequestMapping(
            value = "/register",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SimpleProduct> registerProduct(@RequestBody SimpleProduct product){
        if(product instanceof SimpleProduct){
            log.info("Registered : \n" + product);
            return new ResponseEntity<SimpleProduct>(product, HttpStatus.CREATED);
        }else{
            log.error("!!!!UNKNOWN Product....");
            return new ResponseEntity<SimpleProduct>(HttpStatus.BAD_REQUEST);
        }
    }
}
