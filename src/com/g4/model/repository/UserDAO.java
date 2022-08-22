package com.g4.model.repository;

import com.g4.model.conn.DBConnection;
import com.g4.model.entity.MyDoublyLinkedList;
import com.g4.model.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO extends DBConnection implements CrudRepository<User> {

    @Override
    public boolean register(User user) {
        //PreparedStatement ps = null;
        //Connection conn = createConnection();
        String sql = "INSERT INTO users (name, dni, phone, email, origin, "
                + "destination, departure_date, ticket_price) VALUES(?,?,?,?,?,?,?,?)";
        
        try (Connection conn = createConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            //ps = conn.prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getDni());
            ps.setString(3, user.getPhone());
            ps.setString(4, user.getEmail());
            ps.setString(5, user.getOrigin());
            ps.setString(6, user.getDestination());
            ps.setString(7, user.getDepartureDate());
            ps.setInt(8, user.getTicketPrice());
            ps.execute();
            //return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } 
        return true;
        /*
        finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        */
    }

    @Override
    public boolean update(User user) {
        PreparedStatement ps = null;
        Connection conn = createConnection();
        String sql = "UPDATE users SET name=?, phone=?, email=?, destination=?, departure_date=?, ticket_price=? WHERE dni=?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getPhone());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getDestination());
            ps.setString(5, user.getDni());
            ps.setString(6, user.getDepartureDate());
            ps.setInt(7, user.getTicketPrice());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
            conn.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    @Override
    public boolean delete(User user) {
        PreparedStatement ps = null;
        Connection conn = createConnection();
        String sql = "DELETE FROM users WHERE dni=?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getDni());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    @Override
    public void read() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = createConnection();
        String sql = "SELECT * FROM users";
        
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();         
            
            while (rs.next()) {
                User user = new User();
                
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setDni(rs.getString("dni"));
                user.setPhone(rs.getString("phone"));
                user.setEmail(rs.getString("email"));
                user.setOrigin(rs.getString("origin"));
                user.setDestination(rs.getString("destination"));
                user.setDepartureDate(rs.getString("departure_date"));
                user.setTicketPrice(rs.getInt("ticket_price"));
                
                MyDoublyLinkedList.insertAtTail(user);
            }     
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}