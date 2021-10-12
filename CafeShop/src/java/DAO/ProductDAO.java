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
import model.Product;

/**
 *
 * @author sa
 */
public class ProductDAO {

    public List<Product> getAllProduct() {
        ArrayList<Product> list = new ArrayList<>();
        String query = "select * from Product";
        try {
            ConnectDB db = new ConnectDB();
            Connection conn = db.OpenConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getFloat(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8)));
            }
            conn.close();
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getProductByCategoryID(String id) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product where categoryID = ?";

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
                        rs.getString(6)));
            }
            conn.close();

        } catch (Exception e) {
        }
        return list;
    }

    public Product getProductById(String id) {
        String query = "select * from product\n"
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

    public List<Product> searchByName(String name) {
        ArrayList<Product> list = new ArrayList<>();
        String query = "select * from product\n"
                + "where name like ?";
        try {
            ConnectDB db = new ConnectDB();
            Connection conn = db.OpenConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getFloat(4),
                        rs.getString(5),
                        rs.getString(6)));
            }
            conn.close();
        } catch (Exception e) {
        }
        return list;
    }

    public void deleteProduct(String id) {
        String query = "delete from product\n"
                + " where id=?";
        try {
            ConnectDB db = new ConnectDB();
            Connection conn = db.OpenConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
            conn.close();
            ps.close();
        } catch (Exception e) {
        }
    }

    public void insertProduct(String name, int categoryID, String price, String images, String description, String quantity, String sold, int eventID) {
        String query = "insert into product values(?,?,?,?,?,?,?,?)";
        try {
            ConnectDB db = new ConnectDB();
            Connection conn = db.OpenConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, categoryID);
            ps.setString(3, price);
            ps.setString(4, images);
            ps.setString(5, description);
            ps.setString(6, quantity);
            ps.setString(7, sold);
            ps.setInt(8, eventID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void updateProduct(String name, String categoryID, String price, String images, String description, String id) {
        String query = "update product\n"
                + "set name=?, categoryID=?, price=?, images=?,[description]=? where id=?";

        try {
            ConnectDB db = new ConnectDB();
            Connection conn = db.OpenConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, categoryID);
            ps.setString(3, price);
            ps.setString(4, images);
            ps.setString(5, description);
            ps.setString(6, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Product> getAllProductSoldByDesc() {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * FROM Product\n"
                + "                ORDER BY sold DESC";

        try {
            ConnectDB db = new ConnectDB();
            Connection conn = db.OpenConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getFloat(4),
                        rs.getString(5),
                        rs.getString(6)));
                rs.getInt(7);

            }
        } catch (Exception e) {
        }
        return list;

    }

    public void updateProductSold(int sold, int id) {
        String query = "update Product\n"
                + " set [sold] = ?\n"
                + " where id = ?";
        try {
            ConnectDB db = new ConnectDB();
            Connection conn = db.OpenConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, sold);
            ps.setInt(2, id);

            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void updateProductQuantity(int quantity, int id) {
        String query = "update Product\n"
                + " set [quantity] = ?\n"
                + " where id = ?";
        try {
            ConnectDB db = new ConnectDB();
            Connection conn = db.OpenConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, quantity);
            ps.setInt(2, id);

            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

}
