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
public class JavaApplication2 {

    public static void main(String[] args) {
        ArrayList<Product> productList;
        productList = new ArrayList<>();
        ListOfItems listOfItems = new ListOfItems(productList);
        
        CategoryProduct categoryProduct = new CategoryProduct();
        productList.add(new Product("Coca-Cola",34,categoryProduct.beverages ));
        productList.add(new Product("Sprite",35,categoryProduct.beverages ));
        productList.add(new Product("Mountain Dew",34,categoryProduct.beverages ));
        productList.add(new Product("Ligo Sardines",25,categoryProduct.cannedFoodPack ));
        productList.add(new Product("Pancit Canton",16.5, categoryProduct.cannedFoodPack));
        
        //System.out.println(listOfItems.getSpecificCategory(categoryProduct.beverages));
        
    }
    
}
