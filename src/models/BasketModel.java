package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import props.Basket;
import useutils.DB;
import useutils.Util;

public class BasketModel {
    
    public List<Basket> bls = new ArrayList<>();
    
    public DefaultTableModel basketTable() {
        DefaultTableModel dtm = new DefaultTableModel();
        
        dtm.addColumn("bid");
        dtm.addColumn("prtitle");
        dtm.addColumn("prprice");
        dtm.addColumn("uname");
        dtm.addColumn("bdate");
        for ( Basket item : bls ) {
            Object[] row = { item.getBid(), item.getPrtitle(), item.getPrprice(), item.getUname(), item.getBdate() };
            dtm.addRow(row);
        }
        return dtm;
    }    
    
    public void basketAllResult() {
    bls.clear();
    try {
        DB db = new DB();
        String query = "SELECT b.bid, p.prtitle, p.prprice, u.uname, b.bdate from basket as b inner JOIN product as p on b.bpid = p.prid  INNER JOIN user as u ON b.bprid = u.uid  where b.bstatu = 1 and b.bprid = ?";
        PreparedStatement pre = db.fncPre(query);
        pre.setInt(1, Util.us.getUid());
        ResultSet rs = pre.executeQuery();
        while( rs.next() ) {
            Basket b = new Basket();
            b.setBid(rs.getInt("bid"));
            b.setPrtitle(rs.getString("prtitle"));
            b.setPrprice(rs.getDouble("prprice"));
            b.setUname(rs.getString("uname"));
            b.setBdate(rs.getString("bdate"));
            bls.add(b);
            }
        db.close();
    } catch (Exception e) {
        System.err.println("basketAllResult Error : " + e);
    }
    }
    
    public int basketInsert ( int bpid){
    int statu = -1;
    try {
        DB db = new DB();
        String query = "insert into basket values ( null, ?, 1, ?, now() )";
        PreparedStatement pre = db.fncPre(query);
        pre.setInt(1, bpid);
        pre.setInt(2, Util.us.getUid());
        statu = pre.executeUpdate();
        db.close();
    } catch (Exception e) {
         System.err.println("basketInsert Error: " + e);
    }
                return statu;
    }
    
    public int basketRemove(List<Integer> ids){
        int statu = -1;
        try {
            String q = "(";
            for(int i : ids) {
                q += ""+i+",";
            }
            q += ")";
            q = q.replace(",)", ")");
            
            DB db = new DB();
            String query = "delete from basket where bid in "+q+" ";
            PreparedStatement pre = db.fncPre(query);
            statu = pre.executeUpdate();
            db.close();
        } catch (Exception e) {
            System.err.println("basketRemove Error : " + e);
        }
        return statu;
    }    

    public int completeBasket (){
        int statu = -1;
        try {
            DB db = new DB();
            String query = "update basket set bstatu = 0 where bprid = ?";
            PreparedStatement pre = db.fncPre(query);
            pre.setInt(1, Util.us.getUid());
            statu = pre.executeUpdate();
            db.close();
        } catch (Exception e) {
            System.err.println("closeBasket Error: " + e);
        }
        return statu;
    } 
}
