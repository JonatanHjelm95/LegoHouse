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
    private static final String USER_LOGIN = "SELECT * FROM user WHERE email=? AND password=?";
    private static final String GET_USER = "SELECT * FROM LegoDB.user where email =?;";

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
                int id = rs.getInt("id");
                String em = rs.getString("email");
                String pwrd = rs.getString("password");
                if (email.equals(em) && password.equals(pwrd)) {
                    User user = new User(email, password);
                    user.setId(id);
                    return user;
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public User getUser(String email) throws Exception {
        try {
            Connection con = Connector.connection();
            PreparedStatement ps = con.prepareStatement(GET_USER);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                String em = rs.getString("email");
                String pwrd = rs.getString("password");
                User user = new User(em, pwrd);
                user.setId(id);
                return user;
            } else {
                throw new Exception("That user doesn't exist");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
