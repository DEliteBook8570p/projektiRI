package DAL;
import BO.Furnitori;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author endri
 */
public class DALFurnitori {
    public static void insert(Furnitori furnitori) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            CallableStatement cs = conn.prepareCall("call insert_furnitori(?,?,?,?,?,?,?,?,?)");
            cs.setString(1,furnitori.getEmriKompanis());
            cs.setString(2,furnitori.getAdresa());
            cs.setString(3,furnitori.getQyteti());
            cs.setString(4,furnitori.getRegjioni());
            cs.setString(5,furnitori.getShteti());
            cs.setString(6,furnitori.getKodiPostar());
            cs.setString(7,furnitori.getNumriTelefonit());
            cs.setString(8,furnitori.getEmaili());
            cs.setInt(9,furnitori.getNrFiskal());
            
            
            cs.execute();
        }catch(Exception ex){
            throw new Exception("DALFurnitori:insert()"+ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
   
    public static void update(Furnitori furnitori) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            CallableStatement cs = conn.prepareCall("call update_furnitori(?,?,?,?,?,?,?,?,?,?)");
            
            cs.setInt(1,furnitori.getFurnitoriId());
            cs.setString(2,furnitori.getEmriKompanis());
            cs.setString(3,furnitori.getAdresa());
            cs.setString(4,furnitori.getQyteti());
            cs.setString(5,furnitori.getRegjioni());
            cs.setString(6,furnitori.getShteti());
            cs.setString(7,furnitori.getKodiPostar());
            cs.setString(8,furnitori.getNumriTelefonit());
            cs.setString(9,furnitori.getEmaili());
            cs.setInt(10,furnitori.getNrFiskal());
            
            
            cs.execute();
        }catch(Exception ex){
            throw new Exception("DALFurnitori:Update()"+ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static void delete(int furnitoriId) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call delete_furnitori(?)");
            ps.setInt(1, furnitoriId);
            ps.execute();
        }catch(Exception ex){
            throw new Exception("DALFurnitori:delete()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static Furnitori select(int furnitoriId) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call select_furnitori(?)");
            ps.setInt(1, furnitoriId);
            ResultSet result = ps.executeQuery();
            if(result.next()){
                Furnitori furnitori = new Furnitori();
                furnitori.setFurnitoriId(result.getInt("furnitoriId"));
                furnitori.setEmriKompanis(result.getString("emriKompanis"));
                furnitori.setAdresa(result.getString("adresa"));
                furnitori.setQyteti(result.getString("qyteti"));
                furnitori.setRegjioni(result.getString("regjioni"));
                furnitori.setShteti(result.getString("shteti"));
                furnitori.setKodiPostar(result.getString("kodiPostar"));
                furnitori.setNumriTelefonit(result.getString("numriTelefonit"));
                furnitori.setEmaili(result.getString("emaili"));
                furnitori.setNrFiskal(result.getInt("nrFiskal"));
                
                return furnitori;
            }
            return null;
        }catch(Exception ex){
            throw new Exception("DALFurnitori:select()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static ArrayList<Furnitori> selectAll() throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call selectAll_furnitori");
            ResultSet result = ps.executeQuery();
            ArrayList<Furnitori> furnitoretList = new ArrayList<>();
            
            while(result.next()){
                Furnitori furnitori = new Furnitori();
                furnitori.setFurnitoriId(result.getInt("furnitoriId"));
                furnitori.setEmriKompanis(result.getString("emriKompanis"));
                furnitori.setAdresa(result.getString("adresa"));
                furnitori.setQyteti(result.getString("qyteti"));
                furnitori.setRegjioni(result.getString("regjioni"));
                furnitori.setShteti(result.getString("shteti"));
                furnitori.setKodiPostar(result.getString("kodiPostar"));
                furnitori.setNumriTelefonit(result.getString("nrTelefonit"));
                furnitori.setEmaili(result.getString("emaili"));
                furnitori.setNrFiskal(result.getInt("nrFiskal"));
                furnitoretList.add(furnitori);
            }
            return furnitoretList;
        }catch(Exception ex){
            throw new Exception("DALFurnitori:selectAll()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
}