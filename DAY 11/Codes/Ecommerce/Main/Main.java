package com.eccommerce.Main;

import com.eccommerce.Service.CartService;
import com.eccommerce.Util.DiscountUtil;
import com.eccommerce.model.Product;
public class MainApp {
    public static void main(String[] args) {
        CartService cart=new CartService();
        Product p1=new Product(1,"IPhone 18 pro Max",DiscountUtil.applyDiscount(175000));
        Product p2=new Product(2,"Redmi",DiscountUtil.applyDiscount(87300));
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.showCart();
        int totalAmount=cart.calculateTotal();
        System.out.println("Total Amount: $"+totalAmount);
    }
}