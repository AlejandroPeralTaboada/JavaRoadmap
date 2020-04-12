package com.alexperal.training.java.lists.l03;

public class TicketElement {

    String product;
    Long productPrice;

    public TicketElement(String product, Long productPrice){

        this.product = product;
        this.productPrice = productPrice;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Long getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
    }
}
