/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jonab
 */
public class DAO {

    private static final String NEW_USER = "INSERT INTO user (email, password) VALUES (?, ?)";
    private static final String USER_LOGIN = "SELECT id FROM user WHERE email=? AND password=?";

    public void createUser(User user) {
        try {
            Connection con = Connector.connection();
            PreparedStatement ps = con.prepareStatement(NEW_USER, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
//            ps.setString(3, user.getRole());
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);
            user.setId(id);
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public User login(String email, String password) {
        try {
            Connection con = Connector.connection();
            PreparedStatement ps = con.prepareStatement(USER_LOGIN);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String role = rs.getString("role");
                int id = rs.getInt("id");
                User user = new User(email, password);
                user.setId(id);
                return user;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
