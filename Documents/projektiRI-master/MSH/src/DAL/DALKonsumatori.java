package DAL;
import BO.Konsumatori;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author endri
 */
public class DALKonsumatori {
    public static void insert(Konsumatori konsumatori) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            CallableStatement cs = conn.prepareCall("call insert_konsumatori(?,?,?,?,?,?,?,?,?,?,?)");
            cs.setString(1,konsumatori.getEmriKonsumatorit());
            cs.setString(2,konsumatori.getMbiemriKonsumatorit());
            cs.setString(3,konsumatori.getEmriBiznesit());
            cs.setString(4,konsumatori.getAdresa());
            cs.setString(5,konsumatori.getQyteti());
            cs.setString(6,konsumatori.getShteti());
            cs.setString(7,konsumatori.getRegjioni());
            cs.setString(8,konsumatori.getKodiPostar());
            cs.setString(9,konsumatori.getNumriTelefonit());
            cs.setString(10,konsumatori.getEmaili());
            cs.setInt(11,konsumatori.getLlogariaBankare_llogariaBankareId());
            
            
            cs.execute();
        }catch(Exception ex){
            throw new Exception("DALKonsumatori:insert()"+ ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
   
    public static void update(Konsumatori konsumatori) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            CallableStatement cs = conn.prepareCall("call update_konsumatori(?,?,?,?,?,?,?,?,?,?,?)");
            
            cs.setInt(1,konsumatori.getKonsumatoriId());
           cs.setString(2,konsumatori.getEmriKonsumatorit());
            cs.setString(3,konsumatori.getMbiemriKonsumatorit());
            cs.setString(4,konsumatori.getEmriBiznesit());
            cs.setString(5,konsumatori.getAdresa());
            cs.setString(6,konsumatori.getQyteti());
            cs.setString(7,konsumatori.getShteti());
            cs.setString(8,konsumatori.getRegjioni());
            cs.setString(9,konsumatori.getKodiPostar());
            cs.setString(10,konsumatori.getNumriTelefonit());
            cs.setString(11,konsumatori.getEmaili());
            
            
            cs.execute();
        }catch(Exception ex){
            throw new Exception("DALKonsumatori:insert()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static void delete(int konsumatoriId) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call delete_konsumatori(?)");
            ps.setInt(1, konsumatoriId);
            ps.execute();
        }catch(Exception ex){
            throw new Exception("DALKonsumatori:delete()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static Konsumatori select(int konsumatoriId) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call select_konsumatori(?)");
            ps.setInt(1, konsumatoriId);
            ResultSet result = ps.executeQuery();
            if(result.next()){
                Konsumatori konsumatori = new Konsumatori();
                konsumatori.setKonsumatoriId(result.getInt("konsumatoriId"));
                konsumatori.setEmriKonsumatorit(result.getString("emriKonsumatorit"));
                konsumatori.setMbiemriKonsumatorit(result.getString("mbiemriKonsumatorit"));
                konsumatori.setEmriBiznesit(result.getString("emriBiznesit"));
                konsumatori.setAdresa(result.getString("adresa"));
                konsumatori.setQyteti(result.getString("qyteti"));
                konsumatori.setShteti(result.getString("shteti"));
                konsumatori.setRegjioni(result.getString("regjioni"));
                konsumatori.setKodiPostar(result.getString("kodiPostar"));
                konsumatori.setNumriTelefonit(result.getString("numriTelefonit"));
                konsumatori.setEmaili(result.getString("emaili"));
                
                return konsumatori;
            }
            return null;
        }catch(Exception ex){
            throw new Exception("DALKonsumatori:select()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static ArrayList<Konsumatori> selectAll() throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call selectAll_konsumatori");
            ResultSet result = ps.executeQuery();
            ArrayList<Konsumatori> konsumatoretList = new ArrayList<>();
            
            while(result.next()){
                Konsumatori konsumatori = new Konsumatori();
                konsumatori.setKonsumatoriId(result.getInt("konsumatoriId"));
                konsumatori.setEmriKonsumatorit(result.getString("emriKonsumatorit"));
                konsumatori.setMbiemriKonsumatorit(result.getString("mbiemriKonsumatorit"));
                konsumatori.setEmriBiznesit(result.getString("emriBiznesit"));
                konsumatori.setAdresa(result.getString("adresa"));
                konsumatori.setQyteti(result.getString("qyteti"));
                konsumatori.setShteti(result.getString("shteti"));
                konsumatori.setRegjioni(result.getString("regjioni"));
                konsumatori.setKodiPostar(result.getString("kodiPostar"));
                konsumatori.setNumriTelefonit(result.getString("nrTelefonit"));
                konsumatori.setEmaili(result.getString("emaili"));
                konsumatoretList.add(konsumatori);
            }
            return konsumatoretList;
        }catch(Exception ex){
            throw new Exception("DALKonsumatori:selectAll()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
}