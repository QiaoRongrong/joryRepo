package model;

public class CartPojoWithBLOBs extends CartPojo {
    private String price;

    private String carriagefee;

    private String totalprice;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
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
}