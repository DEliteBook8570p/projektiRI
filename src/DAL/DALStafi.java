package DAL;
import BO.Stafi;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author endri
 */
public class DALStafi {
    public static void insert(Stafi stafi) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            CallableStatement cs = conn.prepareCall("call insert_stafi(?,?,?,?,?,?,?,?,?)");
            cs.setString(1,stafi.getEmriPerdoruesit());
            cs.setString(2,stafi.getMbiemriPerdoruesit());
            cs.setString(3,stafi.getPozita());
            cs.setDate(4, (Date) stafi.getDataLindjes());
            cs.setDate(5, (Date) stafi.getDataPunsimit());
            cs.setString(6,stafi.getAdresa());
            cs.setString(7,stafi.getQyteti());
            cs.setString(8,stafi.getNumriTelefonit());
            cs.setString(9,stafi.getEmaili());
            
            
            cs.execute();
        }catch(Exception ex){
            throw new Exception("DALStafi:insert()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
   
    public static void update(Stafi stafi) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            CallableStatement cs = conn.prepareCall("call update_stafi(?,?,?,?,?,?,?,?,?,?)");
            
            cs.setInt(1,stafi.getStafiId());
            cs.setString(2,stafi.getEmriPerdoruesit());
            cs.setString(3,stafi.getMbiemriPerdoruesit());
            cs.setString(4,stafi.getPozita());
            cs.setDate(5,(Date) stafi.getDataLindjes());
            cs.setDate(6, (Date) stafi.getDataPunsimit());
            cs.setString(7,stafi.getAdresa());
            cs.setString(8,stafi.getQyteti());
            cs.setString(9,stafi.getNumriTelefonit());
            cs.setString(10,stafi.getEmaili());
            
            
            cs.execute();
        }catch(Exception ex){
            throw new Exception("DALStafi:insert()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static void delete(int stafiId) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call delete_stafi(?)");
            ps.setInt(1, stafiId);
            ps.execute();
        }catch(Exception ex){
            throw new Exception("DALStafi:delete()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static Stafi select(int stafiId) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();//lidhu me databaze
            PreparedStatement ps = conn.prepareStatement("call select_stafi(?)");//thirre per selektim
            ps.setInt(1, stafiId);//anetari i pare eshte id
            ResultSet result = ps.executeQuery();
            if(result.next()){
                Stafi stafi = new Stafi();
                stafi.setStafiId(result.getInt("stafiId"));
                stafi.setEmriPerdoruesit(result.getString("emriPerdoruesit"));
                stafi.setMbiemriPerdoruesit(result.getString("mbiemriPerdoruesit"));
                stafi.setPozita(result.getString("pozita"));
                stafi.setDataLindjes(result.getDate("dataLindjes"));
                stafi.setDataPunsimit(result.getDate("dataPunsimit"));
                stafi.setAdresa(result.getString("adresa"));
                stafi.setQyteti(result.getString("qyteti"));
                stafi.setNumriTelefonit(result.getString("numriTelefonit"));
                stafi.setEmaili(result.getString("emaili"));
                
                return stafi;
            }
            return null;
        }catch(Exception ex){
            throw new Exception("DALStafi:select()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static ArrayList<Stafi> selectAll() throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call selectAll_stafi");
            ResultSet result = ps.executeQuery();
            ArrayList<Stafi> stafiList = new ArrayList<>();
            
            while(result.next()){
                Stafi stafi = new Stafi();
                stafi.setStafiId(result.getInt("stafiId"));
                stafi.setEmriPerdoruesit(result.getString("emriPerdoruesit"));
                stafi.setMbiemriPerdoruesit(result.getString("mbiemriPerdoruesit"));
                stafi.setPozita(result.getString("pozita"));
                stafi.setDataLindjes(result.getDate("dataLindjes"));
                stafi.setDataPunsimit(result.getDate("dataPunesimit"));
                stafi.setAdresa(result.getString("adresa"));
                stafi.setQyteti(result.getString("qyteti"));
                stafi.setNumriTelefonit(result.getString("nrTelefonit"));
                stafi.setEmaili(result.getString("emaili"));
                stafiList.add(stafi);
            }
            return stafiList;
        }catch(Exception ex){
            throw new Exception("DALStafi:selectAll()"+ ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
}