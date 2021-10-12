/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConnectDB.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Order;
import model.OrderDetails;
import model.Product;

/**
 *
 * @author sa
 */
public class OrderDAO {

    public static int addOrder(Order order) {

        String query = "insert into [Order] values(?,?,?,?,?,?,?)";
        try {
            ConnectDB db = new ConnectDB();
            Connection conn = db.OpenConnection();
            PreparedStatement ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, order.getPricetotal());
            ps.setString(2, order.getname());
            ps.setString(3, order.getPhoneNumber());
            ps.setString(4, order.getAddress());
            ps.setString(5, order.getGmail());
            ps.setString(6, order.getInformation());
            ps.setInt(7, order.getAccountID());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }
      
    public static void addOrderDetails(OrderDetails order) {
        String query = "insert into [OrderDetails] values(?,?,?)";
        try {
            ConnectDB db = new ConnectDB();
            Connection conn = db.OpenConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, order.getProductID());
            ps.setInt(2, order.getOrderID());
            ps.setInt(3, order.getQuantity());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
