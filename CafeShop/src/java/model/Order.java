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
public class Order {
    private int id;
    private double pricetotal;
    private String name;
    private String phoneNumber;
    private String address;
    private String gmail;
    private String information;
    private int accountID;

    public Order() {
    }

    public Order(int id, double pricetotal, String name, String phoneNumber, String address, String gmail, String information, int accountID) {
        this.id = id;
        this.pricetotal = pricetotal;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gmail = gmail;
        this.information = information;
        this.accountID = accountID;
    }

    

    public double getPricetotal() {
        return pricetotal;
    }

    public void setPricetotal(double pricetotal) {
        this.pricetotal = pricetotal;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getname() {
        return name;
    }

    public void name(String firstname) {
        this.name = firstname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "Order{" + "pricetotal=" + pricetotal + ", accountID=" + accountID + ", name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address + ", gmail=" + gmail + ", information=" + information + '}';
    }

}
