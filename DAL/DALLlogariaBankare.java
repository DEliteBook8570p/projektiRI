package DAL;
import BO.LlogariaBankare;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author endri
 */
public class DALLlogariaBankare {
    public static void insert(LlogariaBankare llogariaBankare) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            CallableStatement cs = conn.prepareCall("call insert_llogariaBankare(?,?,?)");
            cs.setString(1,llogariaBankare.getEmriBankes());
            cs.setString(2,llogariaBankare.getLlojiKarteles());
            cs.setString(3,llogariaBankare.getNrLlogaris()); 
            
            cs.execute();
        }catch(Exception ex){
            throw new Exception("DALLlogariaBankare:insert()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
   
    public static void update(LlogariaBankare llogariaBankare) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            CallableStatement cs = conn.prepareCall("call update_llogariaBankare(?,?,?,?)");
            
            cs.setInt(1,llogariaBankare.getLlogariaBankareId());
            cs.setString(2,llogariaBankare.getEmriBankes());
            cs.setString(3,llogariaBankare.getLlojiKarteles());
            cs.setString(4,llogariaBankare.getNrLlogaris()); 
            
            
            cs.execute();
        }catch(Exception ex){
            throw new Exception("DALLlogariaBankare:insert()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static void delete(int llogariaBankareId) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call delete_llogariaBankare(?)");
            ps.setInt(1, llogariaBankareId);
            ps.execute();
        }catch(Exception ex){
            throw new Exception("DALLlogariaBankare:delete()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static LlogariaBankare select(int llogariaBankareId) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call select_llogariaBankare(?)");
            ps.setInt(1, llogariaBankareId);
            ResultSet result = ps.executeQuery();
            if(result.next()){
                LlogariaBankare llogariaBankare = new LlogariaBankare();
                llogariaBankare.setLlogariaBankareId(result.getInt("llogariaBankareId"));
                llogariaBankare.setEmriBankes(result.getString("emriBankes"));
                llogariaBankare.setLlojiKarteles(result.getString("llojiKarteles"));
                llogariaBankare.setNrLlogaris(result.getString("nrLlogaris"));
                
                return llogariaBankare;
            }
            return null;
        }catch(Exception ex){
            throw new Exception("DALLlogariaBankare:select()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static ArrayList<LlogariaBankare> selectAll() throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call selectAll_llogariaBankare");
            ResultSet result = ps.executeQuery();
            ArrayList<LlogariaBankare> konsumatoretList = new ArrayList<>();
            
            while(result.next()){
                LlogariaBankare llogariaBankare = new LlogariaBankare();
                llogariaBankare.setLlogariaBankareId(result.getInt("llogariaBankareId"));
                llogariaBankare.setEmriBankes(result.getString("emriBankes"));
                llogariaBankare.setLlojiKarteles(result.getString("llojiKarteles"));
                llogariaBankare.setNrLlogaris(result.getString("nrLlogaris"));
                konsumatoretList.add(llogariaBankare);
            }
            return konsumatoretList;
        }catch(Exception ex){
            throw new Exception("DALLlogariaBankare:selectAll()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
}