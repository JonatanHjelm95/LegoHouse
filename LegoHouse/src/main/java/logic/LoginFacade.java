/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import data.DAO;
import data.User;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jonatan
 */
public class LoginFacade {
    
    DAO dao;

    public LoginFacade(DAO dao) {
        this.dao = dao;
    }

    public LoginFacade() {
    }
    
    public User userLogin(String email, String password){
        return dao.login(email, password);
    }
}
