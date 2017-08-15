package BL;

import java.util.ArrayList;
import BO.Porosia;
import DAL.DALPorosia;
public class BLPorosia {

    public static void insert(Porosia porosia) throws Exception {
        DALPorosia.insert(porosia);
    }

    public static void update(Porosia porosia) throws Exception {
        DALPorosia.update(porosia);
    }

    public static void delete(int idPorosia) throws Exception {
        DALPorosia.delete(idPorosia);
    }

    public static ArrayList<Porosia> selectAll() throws Exception {
        return DALPorosia.selectAll();
    }

    public static Porosia select(int idPorosia) throws Exception {
        return DALPorosia.select(idPorosia);
    }

    public static boolean porosiaExist(int id)throws Exception {
        try {
            Porosia a = select(id);
            return a != null;
        } catch (Exception ex) {
            throw new Exception("BLPorosia,porosiaExist()"+ex);
        }
    }
}
