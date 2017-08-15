package BL;

import java.util.ArrayList;
import BO.Stoqet;
import DAL.DALStoqet;
public class BLStoqet {

    public static void insert(Stoqet stoqet) throws Exception {
        DALStoqet.insert(stoqet);
    }

    public static void update(Stoqet stoqet) throws Exception {
        DALStoqet.update(stoqet);
    }

    public static void delete(int idStoqet) throws Exception {
        DALStoqet.delete(idStoqet);
    }

    public static ArrayList<Stoqet> selectAll() throws Exception {
        return DALStoqet.selectAll();
    }

    public static Stoqet select(int idStoqet) throws Exception {
        return DALStoqet.select(idStoqet);
    }

    public static boolean stoqetExist(int id)throws Exception {
        try {
            Stoqet a = select(id);
            return a != null;
        } catch (Exception ex) {
            throw new Exception("BLStoqet,stoqetExist()"+ex);
        }
    }
//e shtuar
//    public static boolean stoqetExist(Stoqet s) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public static boolean stoqetExist(Stoqet s) throws Exception {
          try {
            ArrayList <Stoqet> a = selectAll(); //krijo nje array te tipit Furnitori me emrin a qe eshte baraz me rezultatin e metodes selectAll();
            for(int i=0;i<a.size();i++) //kur e kemi rreshtin e pare te furnitori
            {
                if(a.get(i).equals(s))//nese objekti eshte barraz me f qe eshte vlera e f
                    return true; //kthe true,dmth ke gjet diqka
            }//furnitori exist duhet te kthen false sepse nese nuk ka rreshta kthehet false
            return false;//
        }
        catch (Exception ex) {
            throw new Exception("BLStoqet,stoqetExist"+ex); //
        } //To change body of generated methods, choose Tools | Templates.
    }
}
