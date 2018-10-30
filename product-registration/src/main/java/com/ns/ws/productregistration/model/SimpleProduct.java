package com.ns.ws.productregistration.model;

/**
 * Created by singsate on 30-Oct-18.
 */
public class SimpleProduct {

    private String pid;
    private String pName;
    private short pRating;
    private String pDiscription;

    public SimpleProduct() {
    }

    public SimpleProduct(String pid, String pName, short pRating, String pDiscription) {
        this.pid = pid;
        this.pName = pName;
        this.pRating = pRating;
        this.pDiscription = pDiscription;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public short getpRating() {
        return pRating;
    }

    public void setpRating(short pRating) {
        this.pRating = pRating;
    }

    public String getpDiscription() {
        return pDiscription;
    }

    public void setpDiscription(String pDiscription) {
        this.pDiscription = pDiscription;
    }

    @Override
    public String toString() {
        return "SimpleProduct{" +
                "pid='" + pid + '\'' +
                ", pName='" + pName + '\'' +
                ", pRating=" + pRating +
                ", pDiscription='" + pDiscription + '\'' +
                '}';
    }
}
