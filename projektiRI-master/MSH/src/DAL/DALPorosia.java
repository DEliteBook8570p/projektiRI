package DAL;
import BO.Porosia;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class DALPorosia {
    
    
    
    public static void insert(Porosia porosia) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            CallableStatement cs = conn.prepareCall("call insert_porosia(?,?,?,?,?,?)");
            cs.setDate(1, (java.sql.Date) porosia.getDataPorosis());
            cs.setDate(2, (java.sql.Date) porosia.getDataDorzimit());
            cs.setString(3,porosia.getMenyraPageses());
            cs.setInt(4,porosia.getArtikulli_artikulliId());
            cs.setInt(5,porosia.getKonsumatori_konsumatoriId());
            cs.setInt(6,porosia.getStafi_stafiId());
            
            cs.execute();
        }catch(SQLException ex){
            throw new Exception("DALPorosia:insert()"+ ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
   
    public static void update(Porosia porosia) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            CallableStatement cs = conn.prepareCall("call update_porosia(?,?,?,?,?,?,?)");
            
            cs.setInt(1,porosia.getPorosiaId());
            cs.setDate(2, (java.sql.Date) porosia.getDataPorosis());
            cs.setDate(3, (java.sql.Date) porosia.getDataDorzimit());
            cs.setString(4,porosia.getMenyraPageses());
            cs.setInt(5,porosia.getArtikulli_artikulliId());
            cs.setInt(6,porosia.getKonsumatori_konsumatoriId());
            cs.setInt(7,porosia.getStafi_stafiId());
            
            
            cs.execute();
        }catch(Exception ex){
            throw new Exception("DALPorosia:insert()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static void delete(int porosiaId) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call delete_porosia(?)");
            ps.setInt(1, porosiaId);
            ps.execute();
        }catch(Exception ex){
            throw new Exception("DALPorosia:delete()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static Porosia select(int porosiaId) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call select_porosia(?)");
            ps.setInt(1, porosiaId);
            ResultSet result = ps.executeQuery();
            if(result.next()){
                Porosia porosia = new Porosia();
                porosia.setPorosiaId(result.getInt("porosiaId"));
                porosia.setDataPorosis(result.getDate("dataPorosis"));
                porosia.setDataDorzimit(result.getDate("dataDorzimit"));
                porosia.setMenyraPageses(result.getString("menyraPageses")); 
                porosia.setArtikulli_artikulliId(result.getInt("artikulli_artikulliId;"));  
                porosia.setKonsumatori_konsumatoriId(result.getInt("konsumatori_konsumatoriId;"));
                porosia.setStafi_stafiId(result.getInt("stafi_stafiId"));  
                return porosia;
            }
            return null;
        }catch(Exception ex){
            throw new Exception("DALPorosia:select()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static ArrayList<Porosia> selectAll() throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call selectAll_porosia");
            ResultSet result = ps.executeQuery();
            ArrayList<Porosia> artikujtList = new ArrayList<>();
            
            while(result.next()){
                Porosia porosia = new Porosia();
                porosia.setPorosiaId(result.getInt("porosiaId"));
                porosia.setDataPorosis(result.getDate("dataPorosis"));
                porosia.setDataDorzimit(result.getDate("dataDorzimit"));
                porosia.setMenyraPageses(result.getString("menyraPageses")); 
                porosia.setArtikulli_artikulliId(result.getInt("artikulli_artikulliId;"));  
                porosia.setKonsumatori_konsumatoriId(result.getInt("konsumatori_konsumatoriId;"));
                porosia.setStafi_stafiId(result.getInt("stafi_stafiId"));     
                artikujtList.add(porosia);
            }
            return artikujtList;
        }catch(Exception ex){
            throw new Exception("DALPorosia:selectAll()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
}