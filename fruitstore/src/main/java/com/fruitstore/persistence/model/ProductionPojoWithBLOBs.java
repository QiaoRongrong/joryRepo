package model;

public class ProductionPojoWithBLOBs extends ProductionPojo {
    private String pricebypiece;

    private String pricebyweight;

    private String pricebybox;

    private byte[] picone;

    private byte[] pictwo;

    private byte[] picthree;

    public String getPricebypiece() {
        return pricebypiece;
    }

    public void setPricebypiece(String pricebypiece) {
        this.pricebypiece = pricebypiece == null ? null : pricebypiece.trim();
    }

    public String getPricebyweight() {
        return pricebyweight;
    }

    public void setPricebyweight(String pricebyweight) {
        this.pricebyweight = pricebyweight == null ? null : pricebyweight.trim();
    }

    public String getPricebybox() {
        return pricebybox;
    }

    public void setPricebybox(String pricebybox) {
        this.pricebybox = pricebybox == null ? null : pricebybox.trim();
    }

    public byte[] getPicone() {
        return picone;
    }

    public void setPicone(byte[] picone) {
        this.picone = picone;
    }

    public byte[] getPictwo() {
        return pictwo;
    }

    public void setPictwo(byte[] pictwo) {
        this.pictwo = pictwo;
    }

    public byte[] getPicthree() {
        return picthree;
    }

    public void setPicthree(byte[] picthree) {
        this.picthree = picthree;
    }
}