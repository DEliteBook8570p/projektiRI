package BL;

import java.util.ArrayList;
import BO.Artikulli;
import DAL.DALArtikulli;
public class BLArtikulli {

    public static void insert(Artikulli artikulli) throws Exception {
        DALArtikulli.insert(artikulli);
    }

    public static void update(Artikulli artikulli) throws Exception {
        DALArtikulli.update(artikulli);
    }

    public static void delete(int idArtikulli) throws Exception {
        DALArtikulli.delete(idArtikulli);
    }

    public static ArrayList<Artikulli> selectAll() throws Exception {
        return DALArtikulli.selectAll();
    }

    public static Artikulli select(int idArtikulli) throws Exception {
        return DALArtikulli.select(idArtikulli);
    }

    public static boolean artikulliExist(int id)throws Exception {
        try {
            Artikulli a = select(id);
            return a != null;
        } catch (Exception ex) {
            throw new Exception("BLArtikulli,artikulliExist()"+ex);
        }
    }
}
