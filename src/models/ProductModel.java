package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import props.Product;
import useutils.DB;

public class ProductModel {
    
    List<Product> prls = new ArrayList<>();
    
    public int productInsert ( int prcid, String prtitle, double prprice, 
            String prbarcode, String prshelf, int prstock, String prnote){
        int statu = -1;
        try {
            DB db = new DB();
            String query = "insert into product values ( null, ?, ?, ?, ?, ?, ?, ?, now() )";
            PreparedStatement pre = db.fncPre(query);
            pre.setInt(1, prcid);
            pre.setString(2, prtitle);
            pre.setDouble(3, prprice);
            pre.setString(4, prbarcode);
            pre.setString(5, prshelf);
            pre.setInt(6, prstock);
            pre.setString(7, prnote);
            statu = pre.executeUpdate();
            db.close();
        } catch (Exception e) {
            System.err.println("insertProduct Error: " + e);
        }
        return statu;
    }
    
    public int deleteProduct (int prid){
        int statu = -1;
        try {
            DB db = new DB();
            String query = "delete from product where prid = ?";
            PreparedStatement pre = db.fncPre(query);
            pre.setInt(1, prid);
            statu = pre.executeUpdate();
            db.close();
        } catch (Exception e) {
            System.err.println("deleteProduct Error: " + e);
        }
        return statu;
    }
    
    public int updateProduct(int prid, int prcid, String prtitle, double prprice,
            String prbarcode, String prshelf, int prstock, String prnote ){
        int statu = -1;
        try {
            DB db = new DB();
            String query = "update product set prcid = ?, prtitle = ?, prprice = ?, prbarcode = ?, prshelf = ?, prstock = ?, prnote = ? where prid = ?";
            PreparedStatement pre = db.fncPre(query);
            pre.setInt(1, prcid);
            pre.setString(2, prtitle);
            pre.setDouble(3, prprice);
            pre.setString(4, prbarcode);
            pre.setString(5, prshelf);
            pre.setInt(6, prstock);
            pre.setString(7, prnote);
            pre.setInt(8, prid);
            statu = pre.executeUpdate();
            db.close();
        } catch (Exception e) {
            System.err.println("updateProduct Error: " + e);
        }
        return statu;
    }
    
    public void productAllResult(String search, int statu){
        prls.clear();
        String query = "";
        String addQueryAll = "";
        String addQuerySearch = "";
        if ( statu == 0 ) {
            addQueryAll = " where prstock > 0";
            addQuerySearch = " and prstock > 0";
        }else {
            addQueryAll = " order by prstock asc";
            addQuerySearch = " order by prstock asc";
        }
        if ( search.equals("") ){
            query = "select * from product" + addQueryAll;
        } else {
            query = "SELECT * FROM product WHERE (prtitle like '%" + search + "%' or prprice like '%" + search + "%' "
                    + "or prbarcode like '%" + search + "%' or prshelf like '%" + search + "%' or prstock like '%" + search + "%' "
                    + "or prnote like '%" + search + "%') " + addQuerySearch;
        }
        try {
            DB db = new DB();
            ResultSet rs = db.fncPre(query).executeQuery();
            while (rs.next()){
                Product prd = new Product();
                prd.setPrid(rs.getInt("prid"));
                prd.setPrcid(rs.getInt("prcid"));
                prd.setPrtitle(rs.getString("prtitle"));
                prd.setPrprice(rs.getDouble("prprice"));
                prd.setPrbarcode(rs.getString("prbarcode"));
                prd.setPrshelf(rs.getString("prshelf"));
                prd.setPrstock(rs.getInt("prstock"));
                prd.setPrnote(rs.getString("prnote"));
                prd.setPrdate(rs.getString("prdate"));
                prls.add(prd);
            }
            db.close();
        } catch (Exception e) {
            System.err.println("productAllResult error: " + e);
        }
    }
    
    public DefaultTableModel productTable(){
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Id");
        dtm.addColumn("Kategori");
        dtm.addColumn("Ürün");
        dtm.addColumn("Fiyat");
        dtm.addColumn("Barkod");
        dtm.addColumn("Raf");
        dtm.addColumn("Stok");
        dtm.addColumn("Açıklama");
        dtm.addColumn("Tarih");
        
        for (Product item : prls) {
            Object [] row = { item.getPrid(), item.getPrcid(), item.getPrtitle(), item.getPrprice(),
                item.getPrbarcode(), item.getPrshelf(), item.getPrstock(), item.getPrnote(), item.getPrdate() };
            dtm.addRow(row);
        }
        return dtm;
    }
    
    public int stockDecrease(int quantity, int prid) {
        int statu = -1;
        int stock = 0;
        try {
            DB db = new DB();
            String query = "select * from product where prid = '" + prid + "' ";
            ResultSet rs = db.fncPre(query).executeQuery();
            while (rs.next()) {
                stock = rs.getInt("prstock");
                stock -= quantity;
            }
            db.close();
        } catch (Exception e) {
            System.err.println("stockDecrease Error : " + e);
        }
        try {
            DB db = new DB();
            String query = " update product set prstock = ? where prid = ? ";
            PreparedStatement pre = db.fncPre(query);
            pre.setInt(1, stock);
            pre.setInt(2, prid);
            statu = pre.executeUpdate();
            db.close();
        } catch (Exception e) {
            System.err.println("stockDecrease Error : " + e);
        }
        return statu;
    }    
}
