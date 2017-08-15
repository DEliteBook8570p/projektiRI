package BO;
import java.util.Date;
import java.util.Objects;
public class Fatura {
    private int faturaId;
    private Date dataFaturimit;
    private int sasia;
    private double qmimiNjesis;
    private int zbritja;
    private double shuma;
    private double totali;
    private int konsumatori_konsumatoriId;
    private int artikulli_artikulliId;
    private int porosia_porosiaId;
    private int stafi_stafiId;

    public Fatura(int faturaId, Date dataFaturimit, int sasia, double qmimiNjesis, int zbritja, double shuma, double totali, int konsumatori_konsumatoriId, int artikulli_artikulliId, int porosia_porosiaId, int stafi_stafiId) {
        this.faturaId = faturaId;
        this.dataFaturimit = dataFaturimit;
        this.sasia = sasia;
        this.qmimiNjesis = qmimiNjesis;
        this.zbritja = zbritja;
        this.shuma = shuma;
        this.totali = totali;
        this.konsumatori_konsumatoriId = konsumatori_konsumatoriId;
        this.artikulli_artikulliId = artikulli_artikulliId;
        this.porosia_porosiaId = porosia_porosiaId;
        this.stafi_stafiId = stafi_stafiId;
    }

    public Fatura() {
    }

    public int getFaturaId() {
        return faturaId;
    }

    public void setFaturaId(int faturaId) {
        this.faturaId = faturaId;
    }

    public Date getDataFaturimit() {
        return dataFaturimit;
    }

    public void setDataFaturimit(Date dataFaturimit) {
        this.dataFaturimit = dataFaturimit;
    }

    public int getSasia() {
        return sasia;
    }

    public void setSasia(int sasia) {
        this.sasia = sasia;
    }

    public double getQmimiNjesis() {
        return qmimiNjesis;
    }

    public void setQmimiNjesis(double qmimiNjesis) {
        this.qmimiNjesis = qmimiNjesis;
    }

    public int getZbritja() {
        return zbritja;
    }

    public void setZbritja(int zbritja) {
        this.zbritja = zbritja;
    }

    public double getShuma() {
        return shuma;
    }

    public void setShuma(double shuma) {
        this.shuma = shuma;
    }

    public double getTotali() {
        return totali;
    }

    public void setTotali(double totali) {
        this.totali = totali;
    }

    public int getKonsumatori_konsumatoriId() {
        return konsumatori_konsumatoriId;
    }

    public void setKonsumatori_konsumatoriId(int konsumatori_konsumatoriId) {
        this.konsumatori_konsumatoriId = konsumatori_konsumatoriId;
    }

    public int getArtikulli_artikulliId() {
        return artikulli_artikulliId;
    }

    public void setArtikulli_artikulliId(int artikulli_artikulliId) {
        this.artikulli_artikulliId = artikulli_artikulliId;
    }

    public int getPorosia_porosiaId() {
        return porosia_porosiaId;
    }

    public void setPorosia_porosiaId(int porosia_porosiaId) {
        this.porosia_porosiaId = porosia_porosiaId;
    }

    public int getStafi_stafiId() {
        return stafi_stafiId;
    }

    public void setStafi_stafiId(int stafi_stafiId) {
        this.stafi_stafiId = stafi_stafiId;
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
        final Fatura other = (Fatura) obj;
        if (this.faturaId != other.faturaId) {
            return false;
        }
        if (this.sasia != other.sasia) {
            return false;
        }
        if (Double.doubleToLongBits(this.qmimiNjesis) != Double.doubleToLongBits(other.qmimiNjesis)) {
            return false;
        }
        if (this.zbritja != other.zbritja) {
            return false;
        }
        if (Double.doubleToLongBits(this.shuma) != Double.doubleToLongBits(other.shuma)) {
            return false;
        }
        if (Double.doubleToLongBits(this.totali) != Double.doubleToLongBits(other.totali)) {
            return false;
        }
        if (this.konsumatori_konsumatoriId != other.konsumatori_konsumatoriId) {
            return false;
        }
        if (this.artikulli_artikulliId != other.artikulli_artikulliId) {
            return false;
        }
        if (this.porosia_porosiaId != other.porosia_porosiaId) {
            return false;
        }
        if (this.stafi_stafiId != other.stafi_stafiId) {
            return false;
        }
        if (!Objects.equals(this.dataFaturimit, other.dataFaturimit)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Fatura{" + "faturaId=" + faturaId + ", dataFaturimit=" + dataFaturimit + ", sasia=" + sasia + ", qmimiNjesis=" + qmimiNjesis + ", zbritja=" + zbritja + ", shuma=" + shuma + ", totali=" + totali + ", konsumatori_konsumatoriId=" + konsumatori_konsumatoriId + ", artikulli_artikulliId=" + artikulli_artikulliId + ", porosia_porosiaId=" + porosia_porosiaId + ", stafi_stafiId=" + stafi_stafiId + '}';
    }
    
    

}