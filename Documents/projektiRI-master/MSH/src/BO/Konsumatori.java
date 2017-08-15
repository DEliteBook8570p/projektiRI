package BO;
import java.util.Objects;
public class Konsumatori {
    private int konsumatoriId;
    private String emriKonsumatorit;
    private String mbiemriKonsumatorit;
    private String emriBiznesit;
    private String adresa;
    private String qyteti;
    private String shteti;
    private String regjioni;
    private String kodiPostar;
    private String numriTelefonit;
    private String emaili;
    private int llogariaBankare_llogariaBankareId;

    public Konsumatori() {
    }

    public Konsumatori(int konsumatoriId, String emriKonsumatorit, String mbiemriKonsumatorit, String emriBiznesit, String adresa, String qyteti, String shteti, String regjioni, String kodiPostar, String numriTelefonit, String emaili, int llogariaBankare_llogariaBankareId) {
        this.konsumatoriId = konsumatoriId;
        this.emriKonsumatorit = emriKonsumatorit;
        this.mbiemriKonsumatorit = mbiemriKonsumatorit;
        this.emriBiznesit = emriBiznesit;
        this.adresa = adresa;
        this.qyteti = qyteti;
        this.shteti = shteti;
        this.regjioni = regjioni;
        this.kodiPostar = kodiPostar;
        this.numriTelefonit = numriTelefonit;
        this.emaili = emaili;
        this.llogariaBankare_llogariaBankareId = llogariaBankare_llogariaBankareId;
    }

    public int getKonsumatoriId() {
        return konsumatoriId;
    }

    public void setKonsumatoriId(int konsumatoriId) {
        this.konsumatoriId = konsumatoriId;
    }

    public String getEmriKonsumatorit() {
        return emriKonsumatorit;
    }

    public void setEmriKonsumatorit(String emriKonsumatorit) {
        this.emriKonsumatorit = emriKonsumatorit;
    }

    public String getMbiemriKonsumatorit() {
        return mbiemriKonsumatorit;
    }

    public void setMbiemriKonsumatorit(String mbiemriKonsumatorit) {
        this.mbiemriKonsumatorit = mbiemriKonsumatorit;
    }

    public String getEmriBiznesit() {
        return emriBiznesit;
    }

    public void setEmriBiznesit(String emriBiznesit) {
        this.emriBiznesit = emriBiznesit;
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

    public String getShteti() {
        return shteti;
    }

    public void setShteti(String shteti) {
        this.shteti = shteti;
    }

    public String getRegjioni() {
        return regjioni;
    }

    public void setRegjioni(String regjioni) {
        this.regjioni = regjioni;
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

    public int getLlogariaBankare_llogariaBankareId() {
        return llogariaBankare_llogariaBankareId;
    }

    public void setLlogariaBankare_llogariaBankareId(int llogariaBankare_llogariaBankareId) {
        this.llogariaBankare_llogariaBankareId = llogariaBankare_llogariaBankareId;
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
        final Konsumatori other = (Konsumatori) obj;
        if (this.konsumatoriId != other.konsumatoriId) {
            return false;
        }
        if (this.llogariaBankare_llogariaBankareId != other.llogariaBankare_llogariaBankareId) {
            return false;
        }
        if (!Objects.equals(this.emriKonsumatorit, other.emriKonsumatorit)) {
            return false;
        }
        if (!Objects.equals(this.mbiemriKonsumatorit, other.mbiemriKonsumatorit)) {
            return false;
        }
        if (!Objects.equals(this.emriBiznesit, other.emriBiznesit)) {
            return false;
        }
        if (!Objects.equals(this.adresa, other.adresa)) {
            return false;
        }
        if (!Objects.equals(this.qyteti, other.qyteti)) {
            return false;
        }
        if (!Objects.equals(this.shteti, other.shteti)) {
            return false;
        }
        if (!Objects.equals(this.regjioni, other.regjioni)) {
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
        return "Konsumatori{" + "konsumatoriId=" + konsumatoriId + ", emriKonsumatorit=" + emriKonsumatorit + ", mbiemriKonsumatorit=" + mbiemriKonsumatorit + ", emriBiznesit=" + emriBiznesit + ", adresa=" + adresa + ", qyteti=" + qyteti + ", shteti=" + shteti + ", regjioni=" + regjioni + ", kodiPostar=" + kodiPostar + ", numriTelefonit=" + numriTelefonit + ", emaili=" + emaili + ", llogariaBankare_llogariaBankareId=" + llogariaBankare_llogariaBankareId + '}';
    }

        
}
