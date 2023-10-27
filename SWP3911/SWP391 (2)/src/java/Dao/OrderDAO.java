/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Category;
import Model.Material;
import Model.Order;
import Model.Order1;

import Model.Product;
import Model.Request;
import Ultis.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class OrderDAO {
    
    public List<Order1> getAll() {
        List<Order1> list = new ArrayList<>();
 String sql = "SELECT O.[id], A.[lastname], O.[paymentID], P.[Name] AS PromotionName, OD.totalItems, OD.totalPrice, OS.[orderDate], OS.[orderStatus] " +
               "FROM [Order] O " +
               "JOIN ( " +
                   "SELECT [orderID], SUM([quantity]) AS totalItems, SUM([quantity] * [price]) AS totalPrice " +
                   "FROM [OrderDetail] " +
                   "GROUP BY [orderID] " +
               ") OD ON O.[id] = OD.[orderID] " +
               "JOIN [Account] A ON O.[customerID] = A.[id] " +
               "JOIN [OrderStatus] OS ON O.[id] = OS.[orderID] " +
               "JOIN [Promotion] P ON O.[PromotionID] = P.[ID]";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBContext.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Order1 o = new Order1();
                o.setId(rs.getInt(1));
                o.setLastname(rs.getString(2));
                o.setPaymentID(rs.getString(3));
                o.setPromotionname(rs.getString(4));
                o.setTotalItems(rs.getString(5));   
                o.setTotalPrice(rs.getString(6));
                o.setOrderDate(rs.getTimestamp(7).toLocalDateTime());
                o.setOrderStatus(rs.getString(8));
             
                list.add(o);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return list;
    }


    public Integer getLastId() {

        String sql = "SELECT top 1 [id]\n"
                + "      ,[customerID]\n"
                + "      ,[staffID]\n"
                + "      ,[paymentID]\n"
                + "  FROM [dbo].[Order] order by id desc";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBContext.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }

    public Integer insert(int id,Integer proID) {
        String sql = "INSERT INTO [dbo].[Order]\n"
                + "           ([customerID]\n"
                + "           ,[PromotionID])\n"
                + "     VALUES\n"
                + "           (?,?)";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBContext.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, proID);
            ps.executeUpdate();
            return getLastId();
        } catch (Exception ex) {

        }
        return null;
    }

    public void insertOderDetail(HashMap<Product, Integer> maps, int orderID) {
        String sql = "INSERT INTO [dbo].[OrderDetail]\n"
                + "           ([orderID]\n"
                + "           ,[productID]\n"
                + "           ,[quantity]\n"
                + "           ,[price])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBContext.getConnection();
            for (Product i : maps.keySet()) {
                ps = conn.prepareStatement(sql);
                ps.setInt(1, orderID);
                ps.setInt(2, i.getProductID());
                ps.setInt(3, maps.get(i));
                ps.setInt(4, i.getPrice());
                ps.executeUpdate();
            }
        } catch (Exception ex) {

        }
    }
    

    public void insertOderStatus(int orderID) {
        String sql = "INSERT INTO [dbo].[OrderStatus]\n"
                + "           ([orderDate]\n"
                + "           ,[orderStatus]\n"
                + "           ,[orderID])\n"
                + "     VALUES\n"
                + "           (GETDATE()\n"
                + "           ,'processing'\n"
                + "           ,?)";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBContext.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, orderID);
            ps.executeUpdate();
        } catch (Exception ex) {

        }
    }
}
