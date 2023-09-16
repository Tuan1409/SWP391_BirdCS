/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author kienb
 */
public class Product {
    private int id;
    private String name;
    private String code;
    private String size;
    private BigDecimal price;
    private double discount;
    private Category category;
    private int stock;
    private boolean isAvailable;
    private int quantitySold;
    private BigDecimal ratesum;
    private BigDecimal ratecount;
    private List<Image> listImage;
    private Material material;
    public Product() {
    }

    public Product(int id, String name, String code, String size, BigDecimal price, double discount, Category category, int stock, boolean isAvailable, int quantitySold, BigDecimal ratesum, BigDecimal ratecount, List<Image> listImage, Material material) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.size = size;
        this.price = price;
        this.discount = discount;
        this.category = category;
        this.stock = stock;
        this.isAvailable = isAvailable;
        this.quantitySold = quantitySold;
        this.ratesum = ratesum;
        this.ratecount = ratecount;
        this.listImage = listImage;
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public BigDecimal getRatesum() {
        return ratesum;
    }

    public void setRatesum(BigDecimal ratesum) {
        this.ratesum = ratesum;
    }

    public BigDecimal getRatecount() {
        return ratecount;
    }

    public void setRatecount(BigDecimal ratecount) {
        this.ratecount = ratecount;
    }

    public List<Image> getListImage() {
        return listImage;
    }

    public void setListImage(List<Image> listImage) {
        this.listImage = listImage;
    }
    
    
}
