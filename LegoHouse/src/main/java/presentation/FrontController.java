/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import data.DAO;
import data.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logic.HTMLGenerator;
import logic.LoginFacade;

/**
 *
 * @author jonab
 */
@WebServlet(name = "FrontController", urlPatterns = {"/FrontController"})
public class FrontController extends HttpServlet {

   private LoginFacade lf; 

    public FrontController() {
        this.lf = new LoginFacade();
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String origin = request.getParameter("origin");
            generateMenu(request);
            if (origin != null) {
                switch (origin) {
                    case "index":
                        generateMenu(request);
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                        break;
                    case "login":
                        generateMenu(request);
                        request.getRequestDispatcher("loginpage.jsp").forward(request, response);
                        break;
                    case "signup":
                        generateMenu(request);
                        request.getRequestDispatcher("registerpage.jsp").forward(request, response);
                        break;
                    case "create user":
                        createUser(request);
                        generateMenu(request);
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                        break;
                    case "logout":
                        request.getSession(false).invalidate();
                        generateMenu(request);
                        request.getRequestDispatcher("login.jsp").forward(request, response);
                        break;
                    case "validate user":
//                        String email = request.getParameter("email");
//                        String password = request.getParameter("password");
//                        User user = lf.userLogin(email, password);
//                        HttpSession session = request.getSession(true);
//                        session.setAttribute("user", user);
                        checkPassword(request, response);
                        generateMenu(request);
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                    default:
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                        break;
                }
            } else {
                generateMenu(request);
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }

        }

    }

    private void createUser(HttpServletRequest request) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        User user = new User(email, password);
        lf.createUser(user);
    }
    
    private void checkPassword(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        User user = null;
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        try {
            User user = lf.getUser(email);
            
        } catch (Exception e) {
            request.setAttribute("error", "wrong username");
            request.getRequestDispatcher("errorpage.jsp").forward(request, response);
            return;
        }
        if (user.getPassword().equals(password)) {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else {
            request.setAttribute("error", "wrong password");
            request.getRequestDispatcher("errorpage.jsp").forward(request, response);
        }
    }

    private void generateMenu(HttpServletRequest request) {
        HTMLGenerator html = new HTMLGenerator();
        String menu = html.generateMenu(request);
//        String menu = html.testmenu();

        request.setAttribute("menu", menu);
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
