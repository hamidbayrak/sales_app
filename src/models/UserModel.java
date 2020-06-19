package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import useutils.DB;
import useutils.Util;


public class UserModel {
    
    public int userLogin( String userName, String password ) {
        int statu = -1;
        try {
            String query = "select * from user where uusername = ? and upassword = ?";
            String pw = new Util().md5Generator(password);
            DB db = new DB();
            
            PreparedStatement pre = db.fncPre(query);
            pre.setString(1, userName);
            pre.setString(2, pw);
            
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                statu = rs.getInt("ustatu");
                Util.us.setUid(rs.getInt("uid"));
                Util.us.setUname(rs.getString("uname"));
                Util.us.setUstatu(rs.getInt("ustatu"));
                Util.us.setUusername(rs.getString("uusername"));
            }
            db.close();
        } catch (Exception e) {
            System.err.println("userLogin Error: " + e);
        }
        return statu;
    }
    
    public int updateAdmin(int uid, String uname, String uusername, String pw){
        int statu = -1;
        try {
            uid = Util.us.getUid();
            String upassword = new Util().md5Generator(pw);
            DB db = new DB();
            String query = "update user set uname = ?, uusername = ?, upassword = ? where uid = ?";
            PreparedStatement pre = db.fncPre(query);
            pre.setString(1, uname);
            pre.setString(2, uusername);
            pre.setString(3, upassword);
            pre.setInt(4, uid);
            statu = pre.executeUpdate();
            db.close();
        } catch (Exception e) {
            System.err.println("personUpdate Error: " + e);
        }
        return statu;
    }
}
