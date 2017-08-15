package BO;
import java.util.Objects;
public class Furnitori {
    private int furnitoriId;
    private String emriKompanis;
    private String adresa;
    private String qyteti;
    private String regjioni;
    private String shteti;
    private String kodiPostar;
    private String numriTelefonit;
    private String emaili;
    private int nrFiskal;

    public Furnitori() {
    }

    public Furnitori(int furnitoriId, String emriKompanis, String adresa, String qyteti, String regjioni, String shteti, String kodiPostar, String numriTelefonit, String emaili, int nrFiskal) {
        this.furnitoriId = furnitoriId;
        this.emriKompanis = emriKompanis;
        this.adresa = adresa;
        this.qyteti = qyteti;
        this.regjioni = regjioni;
        this.shteti = shteti;
        this.kodiPostar = kodiPostar;
        this.numriTelefonit = numriTelefonit;
        this.emaili = emaili;
        this.nrFiskal = nrFiskal;
    }

    public int getFurnitoriId() {
        return furnitoriId;
    }

    public void setFurnitoriId(int furnitoriId) {
        this.furnitoriId = furnitoriId;
    }

    public String getEmriKompanis() {
        return emriKompanis;
    }

    public void setEmriKompanis(String emriKompanis) {
        this.emriKompanis = emriKompanis;
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

    public String getRegjioni() {
        return regjioni;
    }

    public void setRegjioni(String regjioni) {
        this.regjioni = regjioni;
    }

    public String getShteti() {
        return shteti;
    }

    public void setShteti(String shteti) {
        this.shteti = shteti;
    }

    public String getKodiPostar() {
        return kodiPostar;
    }

    public void setKodiPostar(String kodiPostar) {
        this.kodiPostar = kodiPostar;
    }

    public String getNumriTelefonit() {
        return numriTelefonit;
    }

    public void setNumriTelefonit(String numriTelefonit) {
        this.numriTelefonit = numriTelefonit;
    }

    public String getEmaili() {
        return emaili;
    }

    public void setEmaili(String emaili) {
        this.emaili = emaili;
    }

    public int getNrFiskal() {
        return nrFiskal;
    }

    public void setNrFiskal(int nrFiskal) {
        this.nrFiskal = nrFiskal;
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
        final Furnitori other = (Furnitori) obj;
        if (this.nrFiskal != other.nrFiskal) {
            return false;
        }
        if (!Objects.equals(this.emriKompanis, other.emriKompanis)) {
            return false;
        }
        if (!Objects.equals(this.adresa, other.adresa)) {
            return false;
        }
        if (!Objects.equals(this.qyteti, other.qyteti)) {
            return false;
        }
        if (!Objects.equals(this.regjioni, other.regjioni)) {
            return false;
        }
        if (!Objects.equals(this.shteti, other.shteti)) {
            return false;
        }
        if (!Objects.equals(this.kodiPostar, other.kodiPostar)) {
            return false;
        }
        if (!Objects.equals(this.numriTelefonit, other.numriTelefonit)) {
            return false;
        }
        if (!Objects.equals(this.emaili, other.emaili)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "Furnitori{" + "furnitoriId=" + furnitoriId + ", emriKompanis=" + emriKompanis + ", adresa=" + adresa + ", qyteti=" + qyteti + ", regjioni=" + regjioni + ", shteti=" + shteti + ", kodiPostar=" + kodiPostar + ", numriTelefonit=" + numriTelefonit + ", emaili=" + emaili + ", nrFiskal=" + nrFiskal + '}';
    }

    
    
    
}
