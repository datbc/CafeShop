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
import model.Account;
import java.util.List;

/**
 *
 * @author sa
 */
public class AccountDAO {

    public Account login(String user, String pass) {
        String query = "select * from account\n"
                + "where username = ?\n"
                + "and pass = ?";
        try {
            ConnectDB db = new ConnectDB();
            Connection conn = db.OpenConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }
            conn.close();
            ps.close();
        } catch (Exception e) {
        }
        return null;
    }
    
    public List<Account> getAllAccountByIsAdmin(String number){
        List<Account> list = new ArrayList<>();
        
        String query = "select * from Account where isAdmin = ?";
        try {
            ConnectDB db = new ConnectDB();
            Connection conn = db.OpenConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, number);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
            }
            conn.close();
        } catch (Exception e) {
        }
        return list;
    }
    
    

    

    public Account chechAccountExist(String user) {
        String query = "select * from account\n"
                + "where username = ?\n";
        try {
            ConnectDB db = new ConnectDB();
            Connection conn = db.OpenConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }
            conn.close();
            ps.close();
        } catch (Exception e) {
        }
        return null;
    }

    public void signup(String user, String pass) {
        String query = "insert into Account values(?,?,0)";
        try {
            ConnectDB db = new ConnectDB();
            Connection conn = db.OpenConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.executeUpdate();
            conn.close();
            ps.close();
        } catch (Exception e) {
        }
    }

    public void Update(String pass) {
        String query = "update account\n"
                + "set pass=? where id=7";
        try {
            ConnectDB db = new ConnectDB();
            Connection conn = db.OpenConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, pass);
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
        }
    }
    

    
    public List<Account> getAllAccount(){
        List<Account> list = new ArrayList<>();
        
        String query = "select * from Account";
        try {
            ConnectDB db = new ConnectDB();
            Connection conn = db.OpenConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
            }
            conn.close();
        } catch (Exception e) {
        }
        return list;
    }
   
    

    public void deleteAccount(String id) {
        String query = "delete from Account\n"
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
    

}
