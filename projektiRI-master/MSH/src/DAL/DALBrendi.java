package DAL;
import BO.Brendi;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author endri
 */
public class DALBrendi {
    public static void insert(Brendi brendi) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            CallableStatement cs = conn.prepareCall("call insert_brendi(?,?,?)");
            cs.setString(1,brendi.getEmriBrendit());
            cs.setString(2,brendi.getOrigjina());
            cs.setString(3,brendi.getModeli());
            
            cs.execute();
        }catch(Exception ex){
            throw new Exception("DALBrendi:insert()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
   
    public static void update(Brendi brendi) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            CallableStatement cs = conn.prepareCall("call update_brendi(?,?,?,?)");
            
            cs.setInt(1,brendi.getBrendiId());
           cs.setString(2,brendi.getEmriBrendit());
            cs.setString(3,brendi.getOrigjina());
            cs.setString(4,brendi.getModeli());
            
            cs.execute();
        }catch(Exception ex){
            throw new Exception("DALBrendi:insert()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static void delete(int brendiId) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call delete_brendi(?)");
            ps.setInt(1, brendiId);
            ps.execute();
        }catch(Exception ex){
            throw new Exception("DALBrendi:delete()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static Brendi select(int brendiId) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call select_brendi(?)");
            ps.setInt(1, brendiId);
            ResultSet result = ps.executeQuery();
            if(result.next()){
                Brendi brendi = new Brendi();
                brendi.setBrendiId(result.getInt("brendiId"));
                brendi.setEmriBrendit(result.getString("emriBrendit"));
                brendi.setOrigjina(result.getString("origjina"));
                brendi.setModeli(result.getString("modeli"));
                
                return brendi;
            }
            return null;
        }catch(Exception ex){
            throw new Exception("DALBrendi:select()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static ArrayList<Brendi> selectAll() throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call selectAll_brendi");
            ResultSet result = ps.executeQuery();
            ArrayList<Brendi> konsumatoretList = new ArrayList<>();
            
            while(result.next()){
                Brendi brendi = new Brendi();
                brendi.setBrendiId(result.getInt("brendiId"));
                brendi.setEmriBrendit(result.getString("emriBrendit"));
                brendi.setOrigjina(result.getString("origjina"));
                brendi.setModeli(result.getString("modeli"));
                konsumatoretList.add(brendi);
            }
            return konsumatoretList;
        }catch(Exception ex){
            throw new Exception("DALBrendi:selectAll()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
}