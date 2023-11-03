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
            List<String> listt = dao.getPhone();
            String[] arrayy = new String[listt.size()];
            arrayy = listt.toArray(arrayy);
             String currentphone = e.getPhone();
            /* TODO output your page here. You may use following sample code. */
            out.print("<form action=\"UpdateAccount\" method=\"POST\" id=\"updateaccounts\" onsubmit=\"return validateForm()\">\n"
                    + "  <div class=\"row\">\n"
                    + "    <div class=\"form-group col-md-6\">\n"
                    + "      <label class=\"control-label\">ID</label>\n"
                    + "      <input readonly=\"true\" class=\"form-control\" type=\"text\" name=\"id\" value=\"" + e.getId() + "\" >\n"
                    + "    </div>\n"
                    + "    <div class=\"form-group col-md-6\">\n"
                    + "      <label class=\"control-label\">tên đầu</label>\n"
                    + "      <input class=\"form-control\" type=\"text\" required name=\"firstname\" value=\"" + e.getFirstname()+ "\" >\n"
                    + "    </div>\n"
                    + "    <div class=\"form-group col-md-6\">\n"
                    + "      <label class=\"control-label\">tên sau</label>\n"
                    + "      <input class=\"form-control\" type=\"text\" required name=\"lastname\" value=\"" + e.getLastname()+ "\" >\n"
                    + "    </div>\n"
                    + "    <div class=\"form-group col-md-6\">\n"
                    + "      <label class=\"control-label\">địa chỉ</label>\n"
                    + "      <input class=\"form-control\" type=\"text\" name=\"address\" value=\"" + e.getAddress()+ "\" >\n"
                    + "    </div>\n"
                    + "    <div class=\"form-group col-md-6\">\n"
                    + "      <label class=\"control-label\">ngày sinh</label>\n"
                    + "      <input  class=\"form-control\" type=\"date\" name=\"birthday\" value=\"" + e.getBirthday() + "\" >\n"
                    + "    </div>\n"
                    + "    <div class=\"form-group col-md-6\">\n"
                    + "      <label for=\"exampleSelect1\" class=\"control-label\">giới tính</label>\n"
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
               
             } else if (e.getRoleid().getName().equalsIgnoreCase("staff")) {
                out.println("<option value=\"" + 3 + "\">" + "staff" + "</option>");
                out.println("<option value=\"" + 2 + "\">" + "manager" + "</option>");
                
            
            }
            out.println("      </select>\n");
             out.println("    </div>\n"
             + "    <div class=\"form-group col-md-6\">\n"
             + "      <label class=\"control-label\">Email</label>\n"
             + "      <input class=\"form-control\" type=\"text\" name=\"email\" id=\"email\" value=\"" + e.getEmail()+ "\" >\n"
             + "      <span id=\"emailError\" class=\"error\"></span>"
             + "    </div>\n"
             + "    <div class=\"form-group col-md-6\">\n"
             + "      <label class=\"control-label\">Password </label>\n"
             + "      <input  class=\"form-control\" type=\"text\" name=\"password\" value=\"" + e.getPassword()+ "\" >\n"
             + "    </div>\n"
             + "    <div class=\"form-group col-md-6\">\n"
             + "      <label class=\"control-label\">số điện thoại</label>\n"
             + "      <input  class=\"form-control\" type=\"text\" name=\"phone\" id=\"phone\" value=\"" + e.getPhone()+ "\" >\n"
             + "      <span id=\"phoneError\" class=\"error\"></span>"   
             + "    <div class=\"form-group col-md-6\">\n"
             + "      <label class=\"control-label\"></label>\n"
            + "     <img  name=\"image\" src=\"" + e.getImage()+ "\" id=\"avatarPreview\" alt=\"User cc\" width=\"100px\">"
             +"     <input type=\"file\" name=\"image\" id=\"newAvatar\" onchange=\"previewImage(this) ;\">"
             + "    </div>\n"    
             + "  </div>\n");
      out.print("<script>\n" +
"function previewImage(input) {\n" +
"    var avatarPreview = document.getElementById('avatarPreview');\n" +
"    if (input.files && input.files[0]) {\n" +
"        var reader = new FileReader();\n" +
"        reader.onload = function (e) {\n" +
"            avatarPreview.src = e.target.result;\n" +
"        };\n" +
"        reader.readAsDataURL(input.files[0]);\n" +
"    }\n" +
"}\n" +
"</script>"); 


out.print("<button class=\"btn btn-save\" type=\"submit\">save</button>\n"
        + "  <a class=\"btn btn-cancel\" data-dismiss=\"modal\" href=\"#\">Hủy bỏ</a>\n"
        + "  <br>\n"
        + "</form>\n"
        + "<script>\n"
        + "   var currentemail = \"" + currentemail + "\";\n"
        + "   var currentphone = \"" + currentphone + "\";\n"
        + "   var emailArray = " + Arrays.toString(array).replace("[", "['").replace(", ", "', '").replace("]", "']") + ";\n"
        + "   var phoneArray = " + Arrays.toString(arrayy).replace("[", "['").replace(", ", "', '").replace("]", "']") + ";\n"
        + "   function validateForm() {\n"
        + "       var email = document.getElementById('email').value;\n"
        + "       var phone = document.getElementById('phone').value;\n"
        + "       var emailErrorElement = document.getElementById('emailError');\n"
        + "       var phoneErrorElement = document.getElementById('phoneError');\n"
        + "       var emailPattern = /^[a-zA-Z0-9._%+-]+@gmail.com$/; // Gmail email pattern\n"
        + "       var phonePattern = /^\\d{10,11}$/; // Phone number should have between 10 and 11 digits\n"
        + "       if (email === currentemail && phone === currentphone) {\n"
        + "           return true; // No change in email and phone, allow form submission\n"
        + "       }\n"
        + "       if (!emailPattern.test(email)) {\n"
        + "           emailErrorElement.innerHTML = 'Invalid Gmail email address.';\n"
        + "           emailErrorElement.style.color = 'red'; // Set the color to red\n"
        + "           return false; // Email is invalid, prevent form submission\n"
        + "       }\n"
        + "       if (emailArray.includes(email)) {\n"
        + "           emailErrorElement.innerHTML = 'Email already exists.';\n"
        + "           emailErrorElement.style.color = 'red'; // Set the color to red\n"
        + "           return false; // Email is a duplicate, prevent form submission\n"
        + "       } else {\n"
        + "           emailErrorElement.innerHTML = ''; // Clear the error message if no duplicate email\n"
        + "       }\n"
        + "       if (!phonePattern.test(phone)) {\n"
        + "           phoneErrorElement.innerHTML = 'Phone number should have between 10 and 11 digits.';\n"
        + "           phoneErrorElement.style.color = 'red'; // Set the color to red\n"
        + "           return false; // Phone number is too short or too long, prevent form submission\n"
        + "       }\n"
        + "       if (phoneArray.includes(phone)) {\n"
        + "           phoneErrorElement.innerHTML = 'Phone already exists.';\n"
        + "           phoneErrorElement.style.color = 'red'; // Set the color to red\n"
        + "           return false; // Phone is a duplicate, prevent form submission\n"
        + "       } else {\n"
        + "           phoneErrorElement.innerHTML = ''; // Clear the error message if no duplicate phone\n"
        + "       }\n"
        + "       return true; // No duplicate email or phone and valid Gmail format, allow form submission\n"
        + "   }\n"
        + "</script>");

        }}
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
