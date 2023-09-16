/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DTO.UserDTO;
import Ultis.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class UserDAO {
    public UserDTO checkLogin(String email, String password) throws SQLException{
        ResultSet rs = null;
        UserDTO result = null;
        Connection conn= null;
        PreparedStatement stm = null; 
        try{
              conn= DBContext.getConnection();
               String sql = "SELECT e.email ,r.name FROM Account e JOIN Role r ON e.roleId = r.roleId WHERE email =? "+" and password = ?";
            if(conn !=null){
                stm= conn.prepareStatement(sql);
                stm.setString(1, email);
                stm.setString(2, password);
                rs = stm.executeQuery();
                 if(rs.next()){
                    
                    String name  = rs.getString("name");
        
                   
                    result = new UserDTO(email,password,name);
                }
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(rs!= null) rs.close();
            if(stm!= null) stm.close();
            if(conn!= null) conn.close();
        
        }
        return result;
    }
    
}
