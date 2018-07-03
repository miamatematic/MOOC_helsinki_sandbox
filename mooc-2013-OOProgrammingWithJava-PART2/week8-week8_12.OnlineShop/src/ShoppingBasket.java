/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mia
 */
import java.util.Map;
import java.util.HashMap;
public class ShoppingBasket {
    private  Map <String, Purchase> basket;
    
    public ShoppingBasket(){
        basket = new HashMap <String,Purchase>();
    }
    
    public void add(String product, int price){
        if (this.basket.containsKey(product)){
            this.basket.get(product).increaseAmount();
        }
        else{
          Purchase purchase = new Purchase(product, 1, price);
        this.basket.put(product, purchase);  
        }
        
    }
    
    public int price (){
        int price = 0;
        for (Purchase product : this.basket.values()){
            
            price += product.price();
        }return price;
    }
    
    public void print(){
        for (Purchase pur : this.basket.values()){
            System.out.println(pur);
        }
    }
}
