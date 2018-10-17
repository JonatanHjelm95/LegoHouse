/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import data.User;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author jonab
 */
public class HTMLGenerator {

    String html = "<div class=\"topnav\">\n"
            + "        <form id=\"Home\" action=\"FrontController\" method=\"POST\">\n"
            + "            <input type=\"hidden\" name=\"command\" value=\"home\">\n"
            + "            <input id=\"btn\" type=\"submit\" value=\"Home\">\n"
            + "        </form>\n"
            + "        <form id=\"createHouse\" action=\"FrontController\" method=\"POST\">\n"
            + "            <input type=\"hidden\" name=\"command\" value=\"createHouse\">\n"
            + "            <input id=\"btn\" type=\"submit\" value=\"Create House\">\n"
            + "        </form>\n"
            + "        <form id=\"register\" action=\"FrontController\" method=\"POST\">\n"
            + "            <input type=\"hidden\" name=\"command\" value=\"registerpage\">\n"
            + "            <input id=\"btn\" type=\"submit\" value=\"Register\">\n"
            + "        </form>\n"
            + "        <form id=\"login\" action=\"FrontController\" method=\"POST\">\n"
            + "            <input type=\"hidden\" name=\"command\" value=\"loginpage\">\n"
            + "            <input id=\"btn\" type=\"submit\" value=\"Login\">\n"
            + "        </form>\n"
            + "        </div>";
    
    String active = "class=\"active\"";

    String home = "<form id=\"Home\" action=\"FrontController\" method=\"POST\">\n"
            + "            <input type=\"hidden\" name=\"command\" value=\"home\">\n"
            + "            <input id=\"btn\" type=\"submit\" value=\"Home\">\n"
            + "        </form>";
    String createHouse = "<form id=\"createHouse\" action=\"FrontController\" method=\"POST\">\n"
            + "            <input type=\"hidden\" name=\"command\" value=\"createHouse\">\n"
            + "            <input id=\"btn\" type=\"submit\" value=\"Create House\">\n"
            + "        </form>";
    String register = "<form id=\"register\" action=\"FrontController\" method=\"POST\">\n"
            + "            <input type=\"hidden\" name=\"command\" value=\"registerpage\">\n"
            + "            <input id=\"btn\" type=\"submit\" value=\"Register\">\n"
            + "        </form>";
    String login = "<form id=\"login\" action=\"FrontController\" method=\"POST\">\n"
            + "            <input type=\"hidden\" name=\"command\" value=\"loginpage\">\n"
            + "            <input id=\"btn\" type=\"submit\" value=\"Login\">\n"
            + "        </form>";

    public String generateMenu(HttpServletRequest request) {
        User user = null;
        if (request.getSession(false) != null) {
            try {
                user = (User) request.getSession(false).getAttribute("user");
                return "<div class=\"topnav\">\n"
                        + "<a id=\"login\" href=\"?origin=logout\">logout</a>"
                        + "<h4 id=\"user\" > Logged in as: " + user.getEmail() + "</h4>\n"
                        + "<h1 id=\"header\" >Lego house</h1>\n"
                        + "<a id=\"home\" class=\"active\" href=\"?origin=index\">Home</a>\n"
                        + "<a id=\"products\" href=\"?origin=products\">Products</a>\n"
                        + "</div>";
            } catch (NullPointerException ne) {
                ne.printStackTrace();
            }

        }
        return "<div class=\"topnav\">\n"
                + "        <form id=\"Home\" action=\"FrontController\" method=\"POST\">\n"
                + "            <input type=\"hidden\" name=\"command\" value=\"home\">\n"
                + "            <input id=\"btn\" type=\"submit\" value=\"Home\">\n"
                + "        </form>\n"
                + "        <form id=\"createHouse\" action=\"FrontController\" method=\"POST\">\n"
                + "            <input type=\"hidden\" name=\"command\" value=\"createHouse\">\n"
                + "            <input id=\"btn\" type=\"submit\" value=\"Create House\">\n"
                + "        </form>\n"
                + "        <form id=\"register\" action=\"FrontController\" method=\"POST\">\n"
                + "            <input type=\"hidden\" name=\"command\" value=\"registerpage\">\n"
                + "            <input id=\"btn\" type=\"submit\" value=\"Register\">\n"
                + "        </form>\n"
                + "        <form id=\"login\" action=\"FrontController\" method=\"POST\">\n"
                + "            <input type=\"hidden\" name=\"command\" value=\"loginpage\">\n"
                + "            <input id=\"btn\" type=\"submit\" value=\"Login\">\n"
                + "        </form>\n"
                + "        </div>";
    }
    
    public String topMenu(HttpServletRequest request){
        String menu = "<div class=\"topnav\">\n";
        System.out.println(">>>" + request.getPathTranslated()+ "<<<");
        return null;
    }

}
