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
}
