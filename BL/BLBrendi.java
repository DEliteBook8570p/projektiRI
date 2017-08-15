package BL;

import java.util.ArrayList;
import BO.Brendi;
import DAL.DALBrendi;
public class BLBrendi {

    public static void insert(Brendi brendi) throws Exception {
        DALBrendi.insert(brendi);
    }

    public static void update(Brendi brendi) throws Exception {
        DALBrendi.update(brendi);
    }

    public static void delete(int idBrendi) throws Exception {
        DALBrendi.delete(idBrendi);
    }

    public static ArrayList<Brendi> selectAll() throws Exception {
        return DALBrendi.selectAll();
    }

    public static Brendi select(int idBrendi) throws Exception {
        return DALBrendi.select(idBrendi);
    }

    public static boolean brendiExist(int id)throws Exception {
        try {
            Brendi a = select(id);
            return a != null;
        } catch (Exception ex) {
            throw new Exception("BLBrendi,brendiExist()"+ex);
        }
    }
}
