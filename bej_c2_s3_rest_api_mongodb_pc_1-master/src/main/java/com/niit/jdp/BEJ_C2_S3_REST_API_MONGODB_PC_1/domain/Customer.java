/*
 * Author Name : M.Krishna.
 * Date: 24-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_PC_1.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
    @Id
    private int customerId;
    private String customerName;
    private String email;
    private String password;
    private long phoneNumber;
    private Product customerProduct;

    public Customer() {
    }

    public Customer(int customerId, String customerName, String email, String password, long phoneNumber, Product customerProduct) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.customerProduct = customerProduct;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Product getCustomerProduct() {
        return customerProduct;
    }

    public void setCustomerProduct(Product customerProduct) {
        this.customerProduct = customerProduct;
    }
}
