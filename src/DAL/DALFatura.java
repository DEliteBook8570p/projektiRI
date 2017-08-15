package DAL;
import BO.Fatura;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class DALFatura {
    public static void insert(Fatura fatura) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            CallableStatement cs = conn.prepareCall("call insert_fatura(?,?,?,?,?,?,?,?,?,?)");
            cs.setDate(1, (java.sql.Date) fatura.getDataFaturimit());
            cs.setInt(2,fatura.getSasia());
            cs.setDouble(3,fatura.getQmimiNjesis());
            cs.setInt(4,fatura.getZbritja());
            cs.setDouble(5,fatura.getShuma());
            cs.setDouble(6,fatura.getTotali());
            cs.setInt(7,fatura.getKonsumatori_konsumatoriId());
            cs.setInt(8,fatura.getArtikulli_artikulliId());
            cs.setInt(9,fatura.getPorosia_porosiaId());
            cs.setInt(10,fatura.getStafi_stafiId());
            
            cs.execute();
        }catch(SQLException ex){
            throw new Exception("DALFatura:insert()"+ ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
   
    public static void update(Fatura fatura) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            CallableStatement cs = conn.prepareCall("call update_fatura(?,?,?,?,?,?,?,?,?,?,?)");
            
            cs.setInt(1,fatura.getFaturaId());
            cs.setDate(2, (java.sql.Date) fatura.getDataFaturimit());
            cs.setInt(3,fatura.getSasia());
            cs.setDouble(4,fatura.getQmimiNjesis());
            cs.setInt(5,fatura.getZbritja());
            cs.setDouble(6,fatura.getShuma());
            cs.setDouble(7,fatura.getTotali());
            cs.setInt(8,fatura.getKonsumatori_konsumatoriId());
            cs.setInt(9,fatura.getArtikulli_artikulliId());
            cs.setInt(10,fatura.getPorosia_porosiaId());
            cs.setInt(11,fatura.getStafi_stafiId());
            
            
            cs.execute();
        }catch(Exception ex){
            throw new Exception("DALFatura:insert()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static void delete(int faturaId) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call delete_fatura(?)");
            ps.setInt(1, faturaId);
            ps.execute();
        }catch(Exception ex){
            throw new Exception("DALFatura:delete()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static Fatura select(int faturaId) throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call select_fatura(?)");
            ps.setInt(1, faturaId);
            ResultSet result = ps.executeQuery();
            if(result.next()){
                Fatura fatura = new Fatura();
                fatura.setFaturaId(result.getInt("faturaId"));
                fatura.setDataFaturimit(result.getDate("dataFaturimit"));
                fatura.setSasia(result.getInt("sasia"));
                fatura.setQmimiNjesis(result.getDouble("qmimiNjesis"));
                fatura.setZbritja(result.getInt("zbritja"));
                fatura.setShuma(result.getDouble("shuma"));  
                fatura.setTotali(result.getDouble("totali"));  
                fatura.setKonsumatori_konsumatoriId(result.getInt("konsumatori_konsumatoriId;"));  
                fatura.setArtikulli_artikulliId(result.getInt("artikulli_artikulliId;"));  
                fatura.setPorosia_porosiaId(result.getInt("porosia_porosiaId"));
                fatura.setStafi_stafiId(result.getInt("stafi_stafiId"));  
                return fatura;
            }
            return null;
        }catch(Exception ex){
            throw new Exception("DALFatura:select()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
    
    public static ArrayList<Fatura> selectAll() throws Exception{
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("call selectAll_fatura");
            ResultSet result = ps.executeQuery();
            ArrayList<Fatura> artikujtList = new ArrayList<>();
            
            while(result.next()){
                Fatura fatura = new Fatura();
                fatura.setFaturaId(result.getInt("faturaId"));
                fatura.setDataFaturimit(result.getDate("dataFaturimit"));
                fatura.setSasia(result.getInt("sasia"));
                fatura.setQmimiNjesis(result.getDouble("qmimiNjesis"));
                fatura.setZbritja(result.getInt("zbritja"));
                fatura.setShuma(result.getDouble("shuma"));  
                fatura.setTotali(result.getDouble("totali"));  
                fatura.setKonsumatori_konsumatoriId(result.getInt("konsumatori_konsumatoriId;"));  
                fatura.setArtikulli_artikulliId(result.getInt("artikulli_artikulliId;"));  
                fatura.setPorosia_porosiaId(result.getInt("porosia_porosiaId"));
                fatura.setStafi_stafiId(result.getInt("stafi_stafiId"));    
                artikujtList.add(fatura);
            }
            return artikujtList;
        }catch(Exception ex){
            throw new Exception("DALFatura:selectAll()", ex);
        }finally{
            if(conn != null){
                conn.close();
            }
        }
    }
}