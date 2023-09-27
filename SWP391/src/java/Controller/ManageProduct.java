/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DTO.CategoryDTO;
import DTO.ProductDTO;
import Dao.CategoryDAO;
import Dao.ProductDAO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "ManageProduct", urlPatterns = {"/product"})
public class ManageProduct extends HttpServlet {


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
        ProductDAO pdo = new ProductDAO();
        CategoryDAO cdo = new CategoryDAO();
        List<ProductDTO> productList = pdo.getAll();
        List<CategoryDTO> categoryList = cdo.getAll();
        request.setAttribute("list", productList);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        request.setAttribute("listCate", gson.toJson(categoryList));
        response.setContentType("application/json");
        request.getRequestDispatcher("managerPage.jsp").forward(request, response);
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
        PrintWriter out = response.getWriter();
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String quantity = request.getParameter("quantity");
        String status = request.getParameter("status");
        String price = request.getParameter("price");
        String categoryID = request.getParameter("categoryID");
        ProductDAO pdo = new ProductDAO();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        List<ProductDTO> productDTO = pdo.search(id, name, quantity, status, price, categoryID);
//        out.println(gson.toJson(productDTO));
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
