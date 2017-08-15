package DAL;
import BO.Stoqet;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class DALStoqet {
    public static void insert(Stoqet stoqet) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            CallableStatement cs = conn.prepareCall("call insert_stoqet(?,?,?,?)");
            cs.setInt(1,stoqet.getStokuFillestar());
            cs.setInt(2,stoqet.getArtikujtShitur());
            cs.setInt(3,stoqet.getArtikujtMbetur());
            cs.setInt(4,stoqet.getBrendi_brendiId());
            
            cs.execute();
        }catch(SQLException ex){
            throw new Exception("DALStoqet:insert()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
   
    public static void update(Stoqet stoqet) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            CallableStatement cs = conn.prepareCall("call update_stoqet(?,?,?,?,?)");
            
            cs.setInt(1,stoqet.getStoqetId());
            cs.setInt(2,stoqet.getStokuFillestar());
            cs.setInt(3,stoqet.getArtikujtShitur());
            cs.setInt(4,stoqet.getArtikujtMbetur());
            cs.setInt(5,stoqet.getBrendi_brendiId());
            
            
            cs.execute();
        }catch(Exception ex){
            throw new Exception("DALStoqet:insert()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static void delete(int stoqetId) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call delete_stoqet(?)");
            ps.setInt(1, stoqetId);
            ps.execute();
        }catch(Exception ex){
            throw new Exception("DALStoqet:delete()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static Stoqet select(int stoqetId) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call select_stoqet(?)");
            ps.setInt(1, stoqetId);
            ResultSet result = ps.executeQuery();
            if(result.next()){
                Stoqet stoqet = new Stoqet();
                stoqet.setStoqetId(result.getInt("stoqetId"));
                stoqet.setStokuFillestar(result.getInt("stokuFillestar")); 
                stoqet.setArtikujtShitur(result.getInt("artikujtShitur")); 
                stoqet.setArtikujtMbetur(result.getInt("artikujtMbetur")); 
                stoqet.setBrendi_brendiId(result.getInt("brendi_brendiId")); 
                return stoqet;
            }
            return null;
        }catch(Exception ex){
            throw new Exception("DALStoqet:select()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static ArrayList<Stoqet> selectAll() throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call selectAll_stoqet");
            ResultSet result = ps.executeQuery();
            ArrayList<Stoqet> StoqetList = new ArrayList<>();
            
            while(result.next()){
                Stoqet stoqet = new Stoqet();
                stoqet.setStoqetId(result.getInt("stoqetId"));
                stoqet.setStokuFillestar(result.getInt("stokuFillestar")); 
                stoqet.setArtikujtShitur(result.getInt("artikujtShitur")); 
                stoqet.setArtikujtMbetur(result.getInt("artikujtMbetur")); 
                stoqet.setBrendi_brendiId(result.getInt("brendi_brendiId"));
                StoqetList.add(stoqet);
            }
            return StoqetList;
        }catch(Exception ex){
            throw new Exception("DALStoqet:selectAll()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
}