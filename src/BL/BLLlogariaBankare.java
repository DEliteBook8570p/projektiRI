package BL;

import java.util.ArrayList;
import BO.LlogariaBankare;
import DAL.DALLlogariaBankare;
public class BLLlogariaBankare {

    public static void insert(LlogariaBankare llogariaBankare) throws Exception {
        DALLlogariaBankare.insert(llogariaBankare);
    }

    public static void update(LlogariaBankare llogariaBankare) throws Exception {
        DALLlogariaBankare.update(llogariaBankare);
    }

    public static void delete(int idLlogariaBankare) throws Exception {
        DALLlogariaBankare.delete(idLlogariaBankare);
    }

    public static ArrayList<LlogariaBankare> selectAll() throws Exception {
        return DALLlogariaBankare.selectAll();
    }

    public static LlogariaBankare select(int idLlogariaBankare) throws Exception {
        return DALLlogariaBankare.select(idLlogariaBankare);
    }

    public static boolean llogariaBankareExist(int id)throws Exception {
        try {
            LlogariaBankare a = select(id);
            return a != null;
        } catch (Exception ex) {
            throw new Exception("BLLlogariaBankare,llogariaBankareExist()"+ex);
        }
    }
}