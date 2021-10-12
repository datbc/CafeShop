/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sa
 */
public class OrderDetails {
    private Product product;
    private int productID;
    private int OrderID;

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public OrderDetails(int OrderID) {
        this.OrderID = OrderID;
    }
    

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    private Order order;
    private int quantity;
    public double price;

    public OrderDetails() {
    }
        public OrderDetails(Product product, int productID, Order order, int quantity, double price) {
        this.product = product;
        this.productID = productID;
        this.order = order;
        this.quantity = quantity;
        this.price = price;
    }

    public OrderDetails(Product product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public OrderDetails(int productID, int quantity) {
        this.productID = productID;
        this.quantity = quantity;
    }
    

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderDetails{" + "product=" + product + ", productID=" + productID + ", order=" + order + ", quantity=" + quantity + ", price=" + price + '}';
    }





    
    
    
}
