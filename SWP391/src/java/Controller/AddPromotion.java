/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.PromotionDAO;
import Model.Account;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name = "AddPromotion", urlPatterns = {"/AddPromotion"})
public class AddPromotion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    private final PromotionDAO objectDao = new PromotionDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddPromotionServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddPromotionServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        Account user = (Account) session.getAttribute("userlogin");
        request.setAttribute("user", user);
        request.getRequestDispatcher("addPromotion.jsp").forward(request, response);
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
        request.setCharacterEncoding("UTF-8");
        String promotionName = request.getParameter("promotionName");
        Date dateStart = Date.valueOf(request.getParameter("dateStart"));
        Date dateEnd = Date.valueOf(request.getParameter("dateEnd"));
        boolean promotionStatus = Boolean.valueOf(request.getParameter("promotionStatus"));
        
        int value = Integer.parseInt(request.getParameter("value"));
        int accID = Integer.parseInt(request.getParameter("accountID"));
        Date currentDate = Date.valueOf(LocalDate.now());
        if (dateStart.after(dateEnd)) {
            request.setAttribute("messAddPromotion", "Tạo promotion thất bại! Vui lòng kiểm tra lại 'Ngày bắt đầu' và 'Ngày kết thúc'.");
            request.getRequestDispatcher("PromotionServlet").forward(request, response);
//        }else if (condition < 0 && quantity <= 0){
//            request.setAttribute("messAddPromotion", "Tạo promotion thất bại! Vui lòng kiểm tra lại 'Điều kiện' và 'Số lượng'.");
//            request.getRequestDispatcher("PromotionServlet").forward(request, response);
//        }else if (condition < 0){
//            request.setAttribute("messAddPromotion", "Tạo promotion thất bại! Vui lòng kiểm tra lại 'Điều kiện'.");
//            request.getRequestDispatcher("PromotionServlet").forward(request, response);
//        }else if (quantity <= 0){
//            request.setAttribute("messAddPromotion", "Tạo promotion thất bại! Vui lòng kiểm tra lại 'Số lượng'.");
//            request.getRequestDispatcher("PromotionServlet").forward(request, response);
        } else if (value < 0){
            request.setAttribute("messAddPromotion", "Tạo promotion thất bại! Vui lòng kiểm tra lại 'Giá trị'.");
            request.getRequestDispatcher("PromotionServlet").forward(request, response);
        } else if (dateEnd.compareTo(currentDate) < 0){
            request.setAttribute("messAddPromotion", "Tạo promotion thất bại! Vui lòng kiểm tra lại 'Ngày kết thúc'.");
            request.getRequestDispatcher("PromotionServlet").forward(request, response);
        } else {
            objectDao.addPromotion(promotionName, dateStart, dateEnd, promotionStatus, value, accID);
            request.setAttribute("messAddPromotion", "Tạo promotion thành công!");
            request.getRequestDispatcher("promotion").forward(request, response);
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
