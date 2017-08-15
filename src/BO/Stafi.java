    package BO;
import java.util.Date;
import java.util.Objects;
public class Stafi {
    private int stafiId;
    private String emriPerdoruesit;
    private String mbiemriPerdoruesit;
    private String pozita;
    private Date dataLindjes;
    private Date dataPunsimit;
    private String adresa;
    private String qyteti;
    private String numriTelefonit;
    private String emaili;

    public Stafi(int stafiId, String emriPerdoruesit, String mbiemriPerdoruesit, String pozita, Date dataLindjes, Date dataPunsimit, String adresa, String qyteti, String numriTelefonit, String emaili) {
        this.stafiId = stafiId;
        this.emriPerdoruesit = emriPerdoruesit;
        this.mbiemriPerdoruesit = mbiemriPerdoruesit;
        this.pozita = pozita;
        this.dataLindjes = dataLindjes;
        this.dataPunsimit = dataPunsimit;
        this.adresa = adresa;
        this.qyteti = qyteti;
        this.numriTelefonit = numriTelefonit;
        this.emaili = emaili;
    }

    public Stafi() {
    }

    public void setStafiId(int stafiId) {
        this.stafiId = stafiId;
    }

    public String getEmaili() {
        return emaili;
    }

    public void setEmaili(String emaili) {
        this.emaili = emaili;
    }

    

    public int getStafiId() {
        return stafiId;
    }

    public String getEmriPerdoruesit() {
        return emriPerdoruesit;
    }

    public void setEmriPerdoruesit(String emriPerdoruesit) {
        this.emriPerdoruesit = emriPerdoruesit;
    }

    public String getMbiemriPerdoruesit() {
        return mbiemriPerdoruesit;
    }

    public void setMbiemriPerdoruesit(String mbiemriPerdoruesit) {
        this.mbiemriPerdoruesit = mbiemriPerdoruesit;
    }

    public String getPozita() {
        return pozita;
    }

    public void setPozita(String pozita) {
        this.pozita = pozita;
    }

    public Date getDataLindjes() {
        return dataLindjes;
    }

    public void setDataLindjes(Date dataLindjes) {
        this.dataLindjes = dataLindjes;
    }

    public Date getDataPunsimit() {
        return dataPunsimit;
    }

    public void setDataPunsimit(Date dataPunsimit) {
        this.dataPunsimit = dataPunsimit;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getQyteti() {
        return qyteti;
    }

    public void setQyteti(String qyteti) {
        this.qyteti = qyteti;
    }

    public String getNumriTelefonit() {
        return numriTelefonit;
    }

    public void setNumriTelefonit(String numriTelefonit) {
        this.numriTelefonit = numriTelefonit;
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
        final Stafi other = (Stafi) obj;
        if (this.stafiId != other.stafiId) {
            return false;
        }
        if (!Objects.equals(this.emriPerdoruesit, other.emriPerdoruesit)) {
            return false;
        }
        if (!Objects.equals(this.mbiemriPerdoruesit, other.mbiemriPerdoruesit)) {
            return false;
        }
        if (!Objects.equals(this.pozita, other.pozita)) {
            return false;
        }
        if (!Objects.equals(this.adresa, other.adresa)) {
            return false;
        }
        if (!Objects.equals(this.qyteti, other.qyteti)) {
            return false;
        }
        if (!Objects.equals(this.numriTelefonit, other.numriTelefonit)) {
            return false;
        }
        if (!Objects.equals(this.dataLindjes, other.dataLindjes)) {
            return false;
        }
        if (!Objects.equals(this.dataPunsimit, other.dataPunsimit)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stafi{" + "stafiId=" + stafiId + ", emriPerdoruesit=" + emriPerdoruesit + ", mbiemriPerdoruesit=" + mbiemriPerdoruesit + ", pozita=" + pozita + ", dataLindjes=" + dataLindjes + ", dataPunsimit=" + dataPunsimit + ", adresa=" + adresa + ", qyteti=" + qyteti + ", numriTelefonit=" + numriTelefonit + '}';
    }
    
}
