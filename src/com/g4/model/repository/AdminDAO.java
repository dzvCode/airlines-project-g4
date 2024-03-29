package com.g4.model.repository;

import com.g4.model.conn.DBConnection;
import com.g4.model.entity.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDAO extends DBConnection implements CrudRepository<Admin> {
     public boolean read(Admin admin) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = createConnection();
        String sql = "SELECT * FROM admin WHERE code=? and password=?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, admin.getCode());
            ps.setString(2, admin.getPassword());
            rs = ps.executeQuery();

            if (rs.next()) {
                admin.setCode(rs.getString("code"));
                admin.setName(rs.getString("name"));
                admin.setPassword(rs.getString("password"));
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

    @Override
    public boolean register(Admin t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void read() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void findById(Admin t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Admin t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Admin t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}