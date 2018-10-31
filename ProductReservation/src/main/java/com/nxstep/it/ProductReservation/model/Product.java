package com.nxstep.it.ProductReservation.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
public class Product {

    @Id
    private Long pId;
    private String pName;
    private Integer pRating;
    private String pDescription;


    public Product() {
    }

    public Product(Long pId, String pName, Integer pRating, String pDescription) {
        this.pId = pId;
        this.pName = pName;
        this.pRating = pRating;
        this.pDescription = pDescription;
    }

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Integer getpRating() {
        return pRating;
    }

    public void setpRating(Integer pRating) {
        this.pRating = pRating;
    }

    public String getpDescription() {
        return pDescription;
    }

    public void setpDescription(String pDescription) {
        this.pDescription = pDescription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pId='" + pId + '\'' +
                ", pName='" + pName + '\'' +
                ", pRating=" + pRating +
                ", pDescription='" + pDescription + '\'' +
                '}';
    }
}
