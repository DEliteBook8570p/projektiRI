package DAL;
import BO.Artikulli;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class DALArtikulli {
    public static void insert(Artikulli artikulli) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            CallableStatement cs = conn.prepareCall("call insert_artikulli(?,?,?,?,?,?,?,?)");
            cs.setString(1,artikulli.getEmriArtikullit());
            cs.setDate(2, (java.sql.Date) artikulli.getGarancioni());
            cs.setDouble(3,artikulli.getQmimiBlerjes());
            cs.setDouble(4,artikulli.getQmimiShitjes());
            cs.setString(5,artikulli.getImei());
            cs.setInt(6,artikulli.getPorosia_porosiaId());
            cs.setInt(7,artikulli.getFurnitori_furnitoriId());
            cs.setInt(8,artikulli.getBrendi_brenidiId());
            
            cs.execute();
        }catch(SQLException ex){
            throw new Exception("DALArtikulli:insert()"+ ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
   
    public static void update(Artikulli artikulli) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            CallableStatement cs = conn.prepareCall("call update_artikulli(?,?,?,?,?,?,?,?,?)");
            
            cs.setInt(1,artikulli.getArtikulliId());
            cs.setString(2,artikulli.getEmriArtikullit());
            cs.setDate(3, (java.sql.Date) artikulli.getGarancioni());
            cs.setDouble(4,artikulli.getQmimiBlerjes());
            cs.setDouble(5,artikulli.getQmimiShitjes());
            cs.setString(6,artikulli.getImei());
            cs.setInt(7,artikulli.getPorosia_porosiaId());
            cs.setInt(8,artikulli.getFurnitori_furnitoriId());
            cs.setInt(9,artikulli.getBrendi_brenidiId());
            
            
            cs.execute();
        }catch(Exception ex){
            throw new Exception("DALArtikulli:insert()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static void delete(int artikulliId) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call delete_artikulli(?)");
            ps.setInt(1, artikulliId);
            ps.execute();
        }catch(Exception ex){
            throw new Exception("DALArtikulli:delete()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static Artikulli select(int artikulliId) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call select_artikulli(?)");
            ps.setInt(1, artikulliId);
            ResultSet result = ps.executeQuery();
            if(result.next()){
                Artikulli artikulli = new Artikulli();
                artikulli.setArtikulliId(result.getInt("artikulliId"));
                artikulli.setEmriArtikullit(result.getString("emriArtikullit"));
                artikulli.setGarancioni(result.getDate("garancioni"));
                artikulli.setQmimiBlerjes(result.getDouble("qmimiBlerjes"));
                artikulli.setQmimiShitjes(result.getDouble("qmimiShitjes"));
                artikulli.setImei(result.getString("imei"));  
                artikulli.setPorosia_porosiaId(result.getInt("porosia_porosiaId"));  
                artikulli.setFurnitori_furnitoriId(result.getInt("furnitori_furnitoriId;"));  
                artikulli.setBrendi_brenidiId(result.getInt("brenidi_brenidiId"));  
                return artikulli;
            }
            return null;
        }catch(Exception ex){
            throw new Exception("DALArtikulli:select()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static ArrayList<Artikulli> selectAll() throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call selectAll_artikulli");
            ResultSet result = ps.executeQuery();
            ArrayList<Artikulli> artikujtList = new ArrayList<>();
            
            while(result.next()){
                Artikulli artikulli = new Artikulli();
                artikulli.setArtikulliId(result.getInt("artikulliId"));
                artikulli.setEmriArtikullit(result.getString("emriArtikullit"));
                artikulli.setGarancioni(result.getDate("garancioni"));
                artikulli.setQmimiBlerjes(result.getDouble("qmimiBlerjes"));
                artikulli.setQmimiShitjes(result.getDouble("qmimiShitjes"));
                artikulli.setImei(result.getString("imei"));  
                artikulli.setPorosia_porosiaId(result.getInt("porosia_porosiaId"));  
                artikulli.setFurnitori_furnitoriId(result.getInt("furnitori_furnitoriId;"));  
                artikulli.setBrendi_brenidiId(result.getInt("brenidi_brenidiId"));  
                artikujtList.add(artikulli);
            }
            return artikujtList;
        }catch(Exception ex){
            throw new Exception("DALArtikulli:selectAll()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
}