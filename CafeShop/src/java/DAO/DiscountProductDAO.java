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
import java.util.ArrayList;
import java.util.List;
import model.Events;
import model.Product;

/**
 *
 * @author sa
 */
public class DiscountProductDAO {

    public List<Product> getProductByEventsID(String id) {
        List<Product> list = new ArrayList<>();
        String query = "select * from Product\n"
                + "where eventID = ?";
        try {
            ConnectDB db = new ConnectDB();
            Connection conn = db.OpenConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getFloat(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9)));
            }
            conn.close();

        } catch (Exception e) {
        }
        return list;
    }

    public Product getProductById(String id) {
        String query = "select * from Product\n"
                + "where id = ?";
        try {
            ConnectDB db = new ConnectDB();
            Connection conn = db.OpenConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getFloat(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public float getPercentByEventID(int event_id) {
        String query = "select * from Events\n"
                + "where id = ?";
        try {
            ConnectDB db = new ConnectDB();
            Connection conn = db.OpenConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, event_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Events events = new Events(rs.getInt(1),rs.getString(2),rs.getString(3),
                        rs.getString(4),rs.getFloat(5));

                return events.getPercent();

            }
            conn.close();

        } catch (Exception e) {
        }
        return -1;
    }

}
