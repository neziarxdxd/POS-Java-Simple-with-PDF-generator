/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2.models;

/**
 *
 * @author MYPC
 */
public class Product {
    public String nameOfProduct;
    public double priceOfProduct;
    public String category;

    public Product(String nameOfProduct, double priceOfProduct, String category) {
        this.nameOfProduct = nameOfProduct;
        this.priceOfProduct = priceOfProduct;
        this.category = category;
    }

    
    
}
