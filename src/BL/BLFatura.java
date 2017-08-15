package BL;

import java.util.ArrayList;
import BO.Fatura;
import DAL.DALFatura;
public class BLFatura {

    public static void insert(Fatura fatura) throws Exception {
        DALFatura.insert(fatura);
    }

    public static void update(Fatura fatura) throws Exception {
        DALFatura.update(fatura);
    }

    public static void delete(int idFatura) throws Exception {
        DALFatura.delete(idFatura);
    }

    public static ArrayList<Fatura> selectAll() throws Exception {
        return DALFatura.selectAll();
    }

    public static Fatura select(int idFatura) throws Exception {
        return DALFatura.select(idFatura);
    }

    public static boolean faturaExist(int id)throws Exception {
        try {
            Fatura a = select(id);
            return a != null;
        } catch (Exception ex) {
            throw new Exception("BLFatura,faturaExist()"+ex);
        }
    }
}
