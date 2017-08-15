package BL;

import java.util.ArrayList;
import BO.Konsumatori;
import DAL.DALKonsumatori;

public class BLKonsumatori {

    public static void insert(Konsumatori konsumatori) throws Exception {
        DALKonsumatori.insert(konsumatori);
    }

    public static void update(Konsumatori konsumatori) throws Exception {
        DALKonsumatori.update(konsumatori);
    }

    public static void delete(int idKonsumatori) throws Exception {
        DALKonsumatori.delete(idKonsumatori);
    }

    public static ArrayList<Konsumatori> selectAll() throws Exception {
        return DALKonsumatori.selectAll();
    }

    public static Konsumatori select(int idKonsumatori) throws Exception {
        return DALKonsumatori.select(idKonsumatori);
    }

    public static boolean konsumatoriExist(Konsumatori f) throws Exception {
        try {
            ArrayList<Konsumatori> a = selectAll();
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i).equals(f)) {
                    return true;
                }
            }
            return false;
        } catch (Exception ex) {
            throw new Exception("BLKonsumatori.konsumatoriExist()" + ex);
        }
    }
}
