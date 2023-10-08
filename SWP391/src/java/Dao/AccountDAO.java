/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Account;
import Model.Category;
import Model.Product;
import Model.Role;
import Ultis.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class AccountDAO {
    public Account getAccountByID(String id) {
        String sql = "Select a.*,r.name from Account a left join Role r on a.roleid = r.roleid where a.id = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBContext.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                Account a = new Account();
                a.setId(rs.getInt(1));
                a.setFirstname(rs.getString(2));
                a.setPassword(rs.getString(3));
                a.setEmail(rs.getString(4));
                a.setLastname(rs.getString(5));
                a.setBirthday(rs.getDate(6));
                a.setRoleid(new Role(rs.getInt(7), rs.getString(12)));
                a.setAddress(rs.getString(8));
                a.setIsActive(rs.getBoolean(9));
                a.setGender(rs.getBoolean(10));
                a.setImage(rs.getString(11));
                
                
                 if (!a.getImage().contains("http")) {
                    a.setImage("./img/" + a.getImage());
                }
                return a;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
        }  finally {
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
        return null;
    }
    public static void main(String[] args){
        AccountDAO dao = new AccountDAO();
        Account a = dao.getAccountByID("1");
        System.out.println(a.toString());
        
    }
}


