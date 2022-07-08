package com.g4.model.repository;

import com.g4.model.conn.DBConnection;
import com.g4.model.entity.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author diego
 */
public class AdminDAO extends DBConnection {
     public boolean read(Admin admin) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = createConnection();
        String sql = "SELECT * FROM users WHERE code=?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, admin.getCode());
            rs = ps.executeQuery();

            if (rs.next()) {
                admin.setCode(rs.getString("code"));
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
}
