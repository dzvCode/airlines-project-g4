package com.g4.model.repository;

import com.g4.model.conn.DBConnection;
import com.g4.model.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author diego
 */
public class UserDAO extends DBConnection {
    public boolean register(User user) {
        PreparedStatement ps = null;
        Connection conn = createConnection();
        String sql = "INSERT INTO users (name, dni, phone, email, destination) VALUES(?,?,?,?,?)";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getDni());
            ps.setString(3, user.getPhone());
            ps.setString(4, user.getEmail());
            ps.setString(5, user.getDestination());
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

    public boolean modify(User user) {
        PreparedStatement ps = null;
        Connection conn = createConnection();
        String sql = "UPDATE users SET name=?, phone=?, email=?, destination=? WHERE dni=?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getPhone());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getDestination());
            ps.setString(5, user.getDni());
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

    public boolean read(User user) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = createConnection();
        String sql = "SELECT * FROM users WHERE dni=?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getDni());
            rs = ps.executeQuery();

            if (rs.next()) {
                user.setId(Integer.parseInt(rs.getString("id")));
                user.setName(rs.getString("name"));
                user.setDni(rs.getString("dni"));
                user.setPhone(rs.getString("phone"));
                user.setEmail(rs.getString("email"));
                user.setDestination(rs.getString("destiny"));
                return true;
            }

            return false;
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
}