/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import DAO.DiscountProductDAO;
import java.util.ArrayList;
import model.OrderDetails;

/**
 *
 * @author sa
 */
public class CartTotal {
//    public static double getTotal(ArrayList<OrderDetails> list) {
//        double total = 0;      
//        DiscountProductDAO dao = new DiscountProductDAO();   
//        double reducePrice = 0.0;
//        for(OrderDetails o : list) {
//            if(o.getProduct().getEventID() != 0) {
//                double percent = dao.getPercentByEventID(o.getProduct().getEventID());
//                reducePrice = o.getProduct().getPrice()*(percent/100.0);
//            } 
//            total+=o.getQuantity()*(o.getProduct().getPrice() - reducePrice);
//        }
//        return total;
//    }
    public static double getTotal(ArrayList<OrderDetails> carts) {
        double total = 0;
        for(OrderDetails o : carts) {
            total+=o.getQuantity()*o.getProduct().getPrice();
        }
        return total;
    }
}
            