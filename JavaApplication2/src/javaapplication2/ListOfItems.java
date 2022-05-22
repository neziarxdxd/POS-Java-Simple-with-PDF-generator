/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javaapplication2.models.CategoryProduct;
import javaapplication2.models.Product;
import java.util.ArrayList;

/**
 *
 * @author MYPC
 */
public class ListOfItems {
    ArrayList<Product> productList;
    CategoryProduct categoryProduct;

    public ListOfItems(ArrayList<Product> productList) {
        this.productList = productList;
    }

    
  
    public ArrayList<Product>getListOfItems(){
        return productList;
    }
    
    public ArrayList<Product> getSpecificCategory(String category){
       ArrayList<Product> categoryProduct = new ArrayList<>();
        for (Product product: productList){
            if(product.category.equals(category)){
                categoryProduct.add(product);
            }
        }
      return categoryProduct;
    }
    
    
    
    
    
    
}
