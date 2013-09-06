package com.fruitstore.persistence.model;

import java.util.Date;

public class Order {
    private Integer id;

    private String produnctionids;

    private String amount;

    private Byte status;

    private String phonenum;

    private String addr;

    private Date createdate;

    private Date deliverydate;

    private Date reveivedate;

    private String carriagefee;

    private String totalprice;

    private String operator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProdunctionids() {
        return produnctionids;
    }

    public void setProdunctionids(String produnctionids) {
        this.produnctionids = produnctionids == null ? null : produnctionids.trim();
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public Date getReveivedate() {
        return reveivedate;
    }

    public void setReveivedate(Date reveivedate) {
        this.reveivedate = reveivedate;
    }

    public String getCarriagefee() {
        return carriagefee;
    }

    public void setCarriagefee(String carriagefee) {
        this.carriagefee = carriagefee == null ? null : carriagefee.trim();
    }

    public String getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(String totalprice) {
        this.totalprice = totalprice == null ? null : totalprice.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }
}