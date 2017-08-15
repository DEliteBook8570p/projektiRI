package BO;
import java.util.Date;
import java.util.Objects;
public class Porosia {
    private int porosiaId;
    private Date dataPorosis;
    private Date dataDorzimit;
    private String menyraPageses;
    private int artikulli_artikulliId;
    private int konsumatori_konsumatoriId;
    private int stafi_stafiId;

    public Porosia() {
    }

    public Porosia(int porosiaId, Date dataPorosis, Date dataDorzimit, String menyraPageses, int artikulli_artikulliId, int konsumatori_konsumatoriId, int stafi_stafiId) {
        this.porosiaId = porosiaId;
        this.dataPorosis = dataPorosis;
        this.dataDorzimit = dataDorzimit;
        this.menyraPageses = menyraPageses;
        this.artikulli_artikulliId = artikulli_artikulliId;
        this.konsumatori_konsumatoriId = konsumatori_konsumatoriId;
        this.stafi_stafiId = stafi_stafiId;
    }
    

    

    public void setPorosiaId(int porosiaId) {
        this.porosiaId = porosiaId;
    }

    public void setKonsumatori_konsumatoriId(int konsumatori_konsumatoriId) {
        this.konsumatori_konsumatoriId = konsumatori_konsumatoriId;
    }

    public void setStafi_stafiId(int stafi_stafiId) {
        this.stafi_stafiId = stafi_stafiId;
    }

    public void setArtikulli_artikulliId(int artikulli_artikulliId) {
        this.artikulli_artikulliId = artikulli_artikulliId;
    }

    public int getPorosiaId() {
        return porosiaId;
    }

    public Date getDataPorosis() {
        return dataPorosis;
    }

    public void setDataPorosis(Date dataPorosis) {
        this.dataPorosis = dataPorosis;
    }

    public Date getDataDorzimit() {
        return dataDorzimit;
    }

    public void setDataDorzimit(Date dataDorzimit) {
        this.dataDorzimit = dataDorzimit;
    }

    public String getMenyraPageses() {
        return menyraPageses;
    }

    public void setMenyraPageses(String menyraPageses) {
        this.menyraPageses = menyraPageses;
    }

    public int getKonsumatori_konsumatoriId() {
        return konsumatori_konsumatoriId;
    }

    public int getStafi_stafiId() {
        return stafi_stafiId;
    }

    public int getArtikulli_artikulliId() {
        return artikulli_artikulliId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Porosia other = (Porosia) obj;
        if (this.porosiaId != other.porosiaId) {
            return false;
        }
        if (this.konsumatori_konsumatoriId != other.konsumatori_konsumatoriId) {
            return false;
        }
        if (this.stafi_stafiId != other.stafi_stafiId) {
            return false;
        }
        if (this.artikulli_artikulliId != other.artikulli_artikulliId) {
            return false;
        }
        if (!Objects.equals(this.menyraPageses, other.menyraPageses)) {
            return false;
        }
        if (!Objects.equals(this.dataPorosis, other.dataPorosis)) {
            return false;
        }
        if (!Objects.equals(this.dataDorzimit, other.dataDorzimit)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Porosia{" + "porosiaId=" + porosiaId + ", dataPorosis=" + dataPorosis + ", dataDorzimit=" + dataDorzimit + ", menyraPageses=" + menyraPageses + ", konsumatori_konsumatoriId=" + konsumatori_konsumatoriId + ", stafi_stafiId=" + stafi_stafiId + ", artikulli_artikulliId=" + artikulli_artikulliId + '}';
    }
    
}
