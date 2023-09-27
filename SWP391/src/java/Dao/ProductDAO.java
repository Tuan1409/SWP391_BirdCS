/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DTO.CategoryDTO;
import DTO.ProductDTO;

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

public class ProductDAO {

    public List<ProductDTO> getAllwithstatus(boolean status, String search) {
        List<ProductDTO> list = new ArrayList<>();
        String sql = "Select p.*,c.CategoryName from Product p left join Categorie c on p.CategoryID = c.CategoryID where "
                + "ProductStatus = ? ";
        if (search != null && !search.trim().isEmpty()) {
            sql += " and ProductName like ?";
        }
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBContext.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setBoolean(1, status);
            if (search != null && !search.trim().isEmpty()) {
                ps.setString(2, "%" + search + "%");
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                ProductDTO p = new ProductDTO();
                p.setProductID(rs.getInt(1));
                p.setProductLink(rs.getString(2));
                p.setProductName(rs.getString(3));
                p.setProductPrice(rs.getDouble(4));
                p.setDiscount(rs.getDouble(5));
                p.setCategory(new Category(rs.getInt(8), rs.getString(10)));
                p.setQuantity(rs.getInt(7));
                p.setStatus(rs.getBoolean(6));
                if (!p.getProductLink().contains("http")) {
                    p.setProductLink("./img/" + p.getProductLink());
                }
                list.add(p);
            }
            return list;
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
        return list;
    }

    public List<ProductDTO> getAll() {
        List<ProductDTO> list = new ArrayList<>();
        String sql = "Select p.*,c.categoryName from Product p left join Category c on p.category = c.id";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBContext.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ProductDTO p = new ProductDTO();
                p.setProductID(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setCode(rs.getString(3));
                p.setMaterial(rs.getInt(4));
                p.setSize(rs.getString(5));
                p.setPrice(rs.getInt(6));
                p.setDiscount(rs.getFloat(7));
                p.setCategory(new CategoryDTO(rs.getInt(8), rs.getString(15)));
                p.setStock(rs.getInt(9));
                p.setIsAvailable(rs.getInt(10));
                p.setQuantitySold(rs.getInt(11));
                p.setRate_sum(rs.getDouble(12));
                p.setRate_count(rs.getDouble(13));
                p.setImage(rs.getString(14));
               
//                if (!p.getProductLink().contains("http")) {
//                    p.setProductLink("./img/" + p.getProductLink());
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

    public ProductDTO getProductByID(String id) {
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
                ProductDTO p = new ProductDTO();
                p.setProductID(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setCode(rs.getString(3));
                p.setMaterial(rs.getInt(4));
                p.setSize(rs.getString(5));
                p.setPrice(rs.getInt(6));
                p.setDiscount(rs.getFloat(7));
                p.setCategory(new CategoryDTO(rs.getInt(8), rs.getString(15)));
                p.setStock(rs.getInt(9));
                p.setIsAvailable(rs.getInt(10));
                p.setQuantitySold(rs.getInt(11));
                p.setRate_sum(rs.getDouble(12));
                p.setRate_count(rs.getDouble(13));
                p.setImage(rs.getString(15));
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
    public void insert(String name, String code, String material, String size, String price, String discount, String cateID, String quantity, String productLink) {
        String sql = "insert into Product(name, code, material, size, price, discount, category, stock, image, isAvailable, quantitySold) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBContext.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, code);
            ps.setInt(3, Integer.parseInt(material));
            ps.setInt(4, Integer.parseInt(size));
            ps.setInt(5, Integer.parseInt(price));            
            ps.setDouble(6, Float.parseFloat(discount));
            ps.setInt(7, Integer.parseInt(cateID));
            ps.setInt(8, Integer.parseInt(quantity));         
            ps.setString(9, productLink);
            if(Integer.parseInt(quantity) > 0){
                ps.setInt(10, 1);
            }else ps.setInt(10, 0);
            ps.setInt(11, 0);
            ps.executeUpdate();
            return;
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
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
    }

    public List<Product> search(String id, String name, String quantity, String status, String price, String cateID) {
        List<Product> list = new ArrayList<>();
        StringBuilder sql = new StringBuilder("Select p.*,c.CategoryName from Product p left join Categorie c on p.CategoryID = c.CategoryID where "
                + "ProductStatus = 1");
        List<Object> listParams = new ArrayList<>();
        if (id != null && !id.isEmpty()) {
            sql.append(" and ProductID = ?");
            listParams.add(Integer.parseInt(id));
        }
        if (name != null && !name.isEmpty()) {
            sql.append(" and ProductName like ?");
            listParams.add("%" + name + "%");
        }
        if (quantity != null && !quantity.isEmpty()) {
            sql.append(" and Quatity = ?");
            listParams.add(Integer.parseInt(quantity));
        }
        if (price != null && !price.isEmpty()) {
            sql.append(" and ProductPrice = ?");
            listParams.add(Double.parseDouble(price));
        }
        if (cateID != null && !cateID.isEmpty()) {
            sql.append(" and p.CategoryID = ?");
            listParams.add(Integer.parseInt(cateID));
        }
        if (status != null && !status.isEmpty()) {
            if (status.equals("1")) {
                sql.append(" and Quatity > 0");
            } else {
                sql.append(" and Quatity = 0");
            }
        }
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBContext.getConnection();
            ps = conn.prepareStatement(sql.toString());
            Ultis.setParams(ps, listParams);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setProductID(rs.getInt(1));
                p.setProductLink(rs.getString(2));
                p.setProductName(rs.getString(3));
                p.setProductPrice(rs.getDouble(4));
                p.setDiscount(rs.getDouble(5));
                p.setCategory(new Category(rs.getInt(8), rs.getString(10)));
                p.setQuantity(rs.getInt(7));
                p.setStatus(rs.getBoolean(6));
                if (!p.getProductLink().contains("http")) {
                    p.setProductLink("./img/" + p.getProductLink());
                }
                list.add(p);
            }
            return list;
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
        return list;
    }

    public int getTotal() {
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

    public List<Product> getListOutStock() {
        List<Product> list = new ArrayList<>();
        String sql = "Select p.*,c.CategoryName from Product p left join Categorie c on p.CategoryID = c.CategoryID where Quatity = 0";
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
                p.setProductLink(rs.getString(2));
                p.setProductName(rs.getString(3));
                p.setProductPrice(rs.getDouble(4));
                p.setDiscount(rs.getDouble(5));
                p.setCategory(new Category(rs.getInt(8), rs.getString(10)));
                p.setQuantity(rs.getInt(7));
                p.setStatus(rs.getBoolean(6));
                if (!p.getProductLink().contains("http")) {
                    p.setProductLink("./img/" + p.getProductLink());
                }
                list.add(p);
            }
            return list;
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
        return list;
    }

    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();
        List<Product> pro = dao.getAll();
        System.out.println(pro.toString());
    }
}
