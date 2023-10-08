/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.Category;
import Model.Product ;

import Ultis.DBContext;
import Ultis.Ultis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kienb
 */
public class ProductDAO {


     public List<Product> getAll() {
        List<Product> list = new ArrayList<>();
        String sql = "Select p.*,c.categoryName from Product p left join Category c on p.category = c.id";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBContext.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setProductID(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setCode(rs.getString(3));
                p.setMaterial(rs.getInt(4));
                p.setSize(rs.getString(5));
                p.setPrice(rs.getInt(6));
                p.setDiscount(rs.getFloat(7));
                p.setCategory(new Category(rs.getInt(8), rs.getString(15)));
                p.setStock(rs.getInt(9));
                p.setIsAvailable(rs.getInt(10));
                p.setQuantitySold(rs.getInt(11));
                p.setRate_sum(rs.getDouble(12));
                p.setRate_count(rs.getDouble(13));
                p.setImage(rs.getString(14));
               
//               if (!p.getImage().contains("http")) {
//                    p.setImage("./img/" + p.getImage());
//                }
                list.add(p);
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

     public Product getProductByID(String id) {
        String sql = "  Select p.*,c.categoryName from Product p left join Category c on p.category = c.id where p.id = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBContext.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                Product p = new Product();
                p.setProductID(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setCode(rs.getString(3));
                p.setMaterial(rs.getInt(4));
                p.setSize(rs.getString(5));
                p.setPrice(rs.getInt(6));
                p.setDiscount(rs.getFloat(7));
                p.setCategory(new Category(rs.getInt(8), rs.getString(15)));
                p.setStock(rs.getInt(9));
                p.setIsAvailable(rs.getInt(10));
                p.setQuantitySold(rs.getInt(11));
                p.setRate_sum(rs.getDouble(12));
                p.setRate_count(rs.getDouble(13));
                p.setImage(rs.getString(14));
                
                
//                 if (!p.getImage().contains("http")) {
//                    p.setImage("./img/" + p.getImage());
//                }
                return p;
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
     public List<Product> getProductByCategory(String id) {
        String sql = "  Select p.*,c.categoryName from Product p left join Category c on p.category = c.id where c.id = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
         List<Product> list = new ArrayList<>();
        try {
            conn = DBContext.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setProductID(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setCode(rs.getString(3));
                p.setMaterial(rs.getInt(4));
                p.setSize(rs.getString(5));
                p.setPrice(rs.getInt(6));
                p.setDiscount(rs.getFloat(7));
                p.setCategory(new Category(rs.getInt(8), rs.getString(15)));
                p.setStock(rs.getInt(9));
                p.setIsAvailable(rs.getInt(10));
                p.setQuantitySold(rs.getInt(11));
                p.setRate_sum(rs.getDouble(12));
                p.setRate_count(rs.getDouble(13));
                p.setImage(rs.getString(14));
                list.add(p);
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
        return list;
    }

    public void updateSP(String id, String size, String name, String price, String discount, String cateID, String quantity, int isAvailable) {
        String sql = " UPDATE Product SET name = ?, size = ?, price = ?, discount = ?, stock = ?, category = ?, isAvailable = ?\n" +
"	WHERE id = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBContext.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, size);
            ps.setDouble(3, Double.parseDouble(price));
            ps.setDouble(4, Double.parseDouble(discount));
            ps.setInt(5, Integer.parseInt(quantity));
            ps.setInt(6, Integer.parseInt(cateID));
            ps.setInt(7, isAvailable);
            ps.setInt(8, Integer.parseInt(id));
            ps.executeUpdate();
            return;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
        }finally {
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
    }
   

    public void deleteSP(String id) {
        String sql = "DELETE from Product where id = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBContext.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
            return;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
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
    }

   

    public int getTotal() throws ClassNotFoundException {
        String sql = "Select count(*) as total from Product";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBContext.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
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
        return -1;
    }

    public void insert(String name, String code, String material, String size, String price, String discount, String cateID, String quantity, String fileName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    public ArrayList<Product> getAllProducts() throws ClassNotFoundException, SQLException {
//       ArrayList<Product> products = new ArrayList<>();
//       Connection conn = null;
//        PreparedStatement ps = null;
//        ResultSet rs = null;
//        String sql = "select c.id,c.name,c.price,c.image,c.isAvailable from Product c" ; 
//       try{
//            conn = DBContext.getConnection();
//            ps = conn.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                 Product p = new Product();
//                 p.setProductID(rs.getInt("id"));
//                 p.setName(rs.getString("name"));
//                 p.setPrice(rs.getInt("price"));
//                 p.setImage(rs.getString("image"));
//                 p.setIsAvailable(rs.getInt("isAvailable"));
//                   if (!p.getImage().contains("http")) {
//                    p.setImage("./img/" + p.getImage());}
//                 products.add(p);
//                 
//            } 
//       }catch(SQLException ex){
//            ex.printStackTrace();
//       } 
// return products;
////To change body of generated methods, choose Tools | Templates.
//    }

 
}
