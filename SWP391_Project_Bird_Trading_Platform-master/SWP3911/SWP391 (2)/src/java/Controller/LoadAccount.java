/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.UserDAO;
import Model.Account;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@WebServlet(name = "LoadAccount", urlPatterns = {"/LoadAccount"})
public class LoadAccount extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String id = request.getParameter("id");
            UserDAO dao = new UserDAO();
            Account e = dao.getUserByID(id);
            List<String> list = dao.getEmail();
            String[] array = new String[list.size()];
             array = list.toArray(array);
            String currentemail = e.getEmail();
            /* TODO output your page here. You may use following sample code. */
            out.print("<form action=\"UpdateAccount\" method=\"POST\" id=\"updateaccounts\" onsubmit=\"return validateForm()\">\n"
                    + "  <div class=\"row\">\n"
                    + "    <div class=\"form-group col-md-6\">\n"
                    + "      <label class=\"control-label\">ID</label>\n"
                    + "      <input readonly=\"true\" class=\"form-control\" type=\"text\" name=\"id\" value=\"" + e.getId() + "\" >\n"
                    + "    </div>\n"
                    + "    <div class=\"form-group col-md-6\">\n"
                    + "      <label class=\"control-label\">firstname</label>\n"
                    + "      <input class=\"form-control\" type=\"text\" required name=\"firstname\" value=\"" + e.getFirstname()+ "\" >\n"
                    + "    </div>\n"
                    + "    <div class=\"form-group col-md-6\">\n"
                    + "      <label class=\"control-label\">firstname</label>\n"
                    + "      <input class=\"form-control\" type=\"text\" required name=\"lastname\" value=\"" + e.getLastname()+ "\" >\n"
                    + "    </div>\n"
                    + "    <div class=\"form-group col-md-6\">\n"
                    + "      <label class=\"control-label\">address</label>\n"
                    + "      <input class=\"form-control\" type=\"text\" name=\"address\" value=\"" + e.getAddress()+ "\" >\n"
                    + "    </div>\n"
                    + "    <div class=\"form-group col-md-6\">\n"
                    + "      <label class=\"control-label\">birthday</label>\n"
                    + "      <input  class=\"form-control\" type=\"date\" name=\"birthday\" value=\"" + e.getBirthday() + "\" >\n"
                    + "    </div>\n"
                    + "    <div class=\"form-group col-md-6\">\n"
                    + "      <label for=\"exampleSelect1\" class=\"control-label\">gender</label>\n"
                    + "      <select class=\"form-control\" name=\"gender\">\n");
                if (e.getGender()== true) {
                out.println("<option value=\"" + true + "\">" + "Nam" + "</option>");
                out.println("<option value=\"" + false + "\">" + "Nữ" + "</option>");
                 } else {
                out.println("<option value=\"" + false + "\">" + "Nữ" + "</option>");
                out.println("<option value=\"" + true + "\">" + "Nam" + "</option>");
               }
            out.println("      </select>\n");
            out.println();
            out.println(" </div>\n"  
                  
                    + "  <div class=\"form-group col-md-6\">\n"
                      + "<label for=\"exampleSelect1\" class=\"control-label\">Chức vụ</label>\n"
                      + "<select class=\"form-control\" name=\"role\">\n");            
             if (e.getRoleid().getName().equalsIgnoreCase("manager")) {
                 out.println("<option value=\"" + 2 + "\">" + "Manager" + "</option>");
                out.println("<option value=\"" + 3 + "\">" + "staff" + "</option>");
                out.println("<option value=\"" + 1 + "\">" + "admin" + "</option>");
             } else if (e.getRoleid().getName().equalsIgnoreCase("staff")) {
                out.println("<option value=\"" + 3 + "\">" + "staff" + "</option>");
                out.println("<option value=\"" + 2 + "\">" + "manager" + "</option>");
                out.println("<option value=\"" + 1 + "\">" + "admin" + "</option>");
             }else {
                out.println("<option value=\"" + 1 + "\">" + "admin" + "</option>");
                out.println("<option value=\"" + 2 + "\">" + "manager" + "</option>");
                out.println("<option value=\"" + 3 + "\">" + "staff" + "</option>");
            }
            out.println("      </select>\n");
             out.println("    </div>\n"
             + "    <div class=\"form-group col-md-6\">\n"
             + "      <label class=\"control-label\">Email</label>\n"
             + "      <input class=\"form-control\" type=\"text\" name=\"email\" id=\"email\" value=\"" + e.getEmail()+ "\" >\n"
             + "      <span id=\"usernameError\" class=\"error\"></span>"
             + "    </div>\n"
             + "    <div class=\"form-group col-md-6\">\n"
             + "      <label class=\"control-label\">Password </label>\n"
             + "      <input  class=\"form-control\" type=\"text\" name=\"password\" value=\"" + e.getPassword()+ "\" >\n"
             + "    </div>\n"
             + "  </div>\n");
             
           out.print("<button class=\"btn btn-save\" type=\"submit\">save</button>\n"
                    + "  <a class=\"btn btn-cancel\" data-dismiss=\"modal\" href=\"#\">cancel</a>\n"
                    + "  <br>\n"
                    + "</form>\n"
                    + "<script>\n"
                    + "   var currentemail = \"" + currentemail + "\";\n"
                    + "   var array = " + Arrays.toString(array).replace("[", "['").replace(", ", "', '").replace("]", "']") + ";\n"
                    + "   function validateForm() {\n"
                    + "       var email = document.getElementById('email').value;\n"
                    + "       if (email === currentemail) {\n"
                    + "           return true; // No change in email, allow form submission\n"
                    + "       }\n"
                    + "       for (var i = 0; i < array.length; i++) {\n"
                    + "           if (email === array[i]) {\n"
                    + "               document.getElementById('emailError').innerHTML = 'Tên đăng nhập đã tồn tại.';\n"
                    + "               document.getElementById('emailError').style.color = 'red'; // Set the color to red\n"
                    + "               return false; // EmailError is duplicate, prevent form submission\n"
                    + "           }\n"
                    + "       }\n"
                    + "       document.getElementById('emailError').innerHTML = ''; // Clear the error message if no duplicate email\n"
                    + "       return true; // No duplicate username, allow form submission\n"
                    + "   }\n"
                    + "</script>");
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListUserbyID.class.getName()).log(Level.SEVERE, null, ex);
        }
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
   
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListUserbyID.class.getName()).log(Level.SEVERE, null, ex);
        }
       
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
