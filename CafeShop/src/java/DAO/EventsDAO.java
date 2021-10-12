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

/**
 *
 * @author sa
 */
public class EventsDAO {
    public List<Events> getAllEvents(){
        List<Events> list = new ArrayList<>();
        
        String query = "select * from Events";
        try {
            ConnectDB db = new ConnectDB();
            Connection conn = db.OpenConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(new Events(rs.getInt(1),rs.getString(2),rs.getString(3),
                        rs.getString(4),rs.getFloat(5)));
            }
            conn.close();
        } catch (Exception e) {
        }
        return list;
    }
    
        public void insertCategory(String title,String images,String details,String percent) {
        String query = "insert into Events values(?,?,?,?)";
        try {
            ConnectDB db = new ConnectDB();
            Connection conn = db.OpenConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,title);
            ps.setString(2,images);
            ps.setString(3,details);
            ps.setString(4,percent);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
