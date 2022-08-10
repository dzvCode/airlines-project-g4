package com.g4.model.repository;

import com.g4.model.conn.DBConnection;
import com.g4.model.entity.MyQueue;
import static com.g4.model.entity.MyQueue.front;
import com.g4.model.entity.User;
import static com.g4.view.frmClients.model;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class UserDAO extends DBConnection implements CrudRepository<User> {

    @Override
    public boolean register(User user) {
        //PreparedStatement ps = null;
        //Connection conn = createConnection();
        String sql = "INSERT INTO users (name, dni, phone, email, origin, "
                + "destination, departure_date) VALUES(?,?,?,?,?,?,?)";
        
        try (Connection conn = createConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            //ps = conn.prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getDni());
            ps.setString(3, user.getPhone());
            ps.setString(4, user.getEmail());
            ps.setString(5, user.getOrigin());
            ps.setString(6, user.getDestination());
            ps.setString(7, user.getDepartureDate());
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
    public void read(DefaultTableModel model) {
        PreparedStatement ps = null;
        
        /*
        public static ArrayList<Object[]> upload() {
        ArrayList<Object[]> data = new ArrayList<>();
        if (front == null) {
            return data;
        }

        MyQueue.Node temp = front;
        while (temp != null) {
            Object[] aux = new Object[]{temp.user.getName()};
            data.add(aux);
            temp = temp.next;
        }
        return data;
       
    }*/
        ResultSet rs = null;
        Connection conn = createConnection();
        String sql = "SELECT * FROM users";
        //String sql = "SELECT * FROM users WHERE dni=?";
        
        try {
            ps = conn.prepareStatement(sql);
            //ps.setString(1, user.getDni());
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int numColumns = rsMd.getColumnCount();

            model.addColumn("ID");
            model.addColumn("Nombre");
            model.addColumn("DNI");
            model.addColumn("Telefono");
            model.addColumn("Email");
            model.addColumn("Origen");
            model.addColumn("Destino");
            model.addColumn("Fecha de vuelo");
            
            while (rs.next()) {
                Object[] rows = new Object[numColumns];
                for (int i = 0; i < numColumns; i++) {
                    rows[i] = rs.getObject(i+1);
                    
                }
                model.addRow(rows);
                /*user.setId(Integer.parseInt(rs.getString("id")));
                user.setName(rs.getString("name"));
                user.setDni(rs.getString("dni"));
                user.setPhone(rs.getString("phone"));
                user.setEmail(rs.getString("email"));
                user.setDestination(rs.getString("destination"));
                user.setDepartureDate(rs.getString("departure_date"));
                return true;*/
            }

            //return false;
        } catch (SQLException e) {
            System.err.println(e);
            //return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    @Override
    public boolean update(User user) {
        PreparedStatement ps = null;
        Connection conn = createConnection();
        String sql = "UPDATE users SET name=?, phone=?, email=?, destination=?, departure_date=? WHERE dni=?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getPhone());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getDestination());
            ps.setString(5, user.getDni());
            ps.setString(6, user.getDepartureDate());
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
}