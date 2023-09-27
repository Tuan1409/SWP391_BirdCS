/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DTO.UserDTO;
import Dao.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import utils.CreateError;

/**
 *
 * @author DELL
 */
public class UserServlet extends HttpServlet {
      private UserDAO userDAO;

    @Override
    public void init() {
        userDAO = new UserDAO();
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
        String action = request.getParameter("action");
     try {

            if (action == null) {
                action = "list";
            }
            switch (action) {
                case "showSignupForm":
                    showSignupForm(request, response);
                    break ; 
                case "list2":
                    listUsers2(request, response);
                    break;
                case "showLoginForm":
                    showLoginForm(request, response);
                    break;
                case "ShowStaffPage":
                    ShowStaffPage(request, response);
                    break;
                case "login":
                    login(request, response);
                    break;              
                case "ShowManagerPage":
                    ShowManagerPage(request, response);
                    break;
                }
           
        } catch (SQLException e) {
            log("UserServlet _ SQL _ " + e.getMessage());
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
     private void ShowManagerPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("managerPage.jsp");
//          RequestDispatcher rd = request.getRequestDispatcher("dateTotal.jsp");
        rd.forward(request, response);

    }
     private void ShowStaffPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("staffPage.jsp");
//          RequestDispatcher rd = request.getRequestDispatcher("dateTotal.jsp");
        rd.forward(request, response);

    }
     private void listUsers2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("adminPage.jsp");
//          RequestDispatcher rd = request.getRequestDispatcher("dateTotal.jsp");
        rd.forward(request, response);

    }
    private void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException, SQLException {
        PrintWriter out = response.getWriter();
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String url = "login.jsp";
        boolean foundError = false;
        CreateError errors = new CreateError();
        HttpSession session = request.getSession();
        try {

            if (email.trim().equals("")) {
                foundError = true;
                errors.setUsernameBlankError("Email không được để trống");
            }
            if (password.trim().equals("")) {
                foundError = true;
                errors.setPasswordBlankError("Mật khẩu không được để trống");
            }
            if (foundError) {
                request.setAttribute("CREATE_ERROR", errors);
            } else {
               
                UserDTO result = userDAO.checkLogin(email,password);
                if (result != null) {
                    String  name = result.getName();
                    session.setAttribute("userlogin", result);
                    if ("admin".equals(name)) {
                        url = "UserServlet?action=list2";
                    }else  if ("manager".equals(name)) {
                      url = "UserServlet?action=ShowManagerPage";
                    }
                    else  if ("staff".equals(name)) {
                      url = "UserServlet?action=ShowStaffPage";
                    }
                } else {
                    // Invalid username or password
                    foundError = true;
                    errors.setWrongPasswordError("Email hoặc mật khẩu không hợp lệ");
                    request.setAttribute("CREATE_ERROR", errors);
                }
            }

        } finally {
            RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request, response);
            out.close();
        }

    }

    private void showLoginForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    
    
    private void showSignupForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("signup.jsp").forward(request, response);
    }

}
