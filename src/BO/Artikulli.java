package BO;
import java.util.Date;
import java.util.Objects;
public class Artikulli {
    private int artikulliId;
    private String emriArtikullit;
    private Date garancioni;
    private double qmimiBlerjes;
    private double qmimiShitjes;
    private String imei;
    private int porosia_porosiaId;
    private int furnitori_furnitoriId;
    private int brendi_brenidiId;
    

    public Artikulli() {
    }

    public Artikulli(int artikulliId, String emriArtikullit, Date garancioni, double qmimiBlerjes, double qmimiShitjes, String imei, int porosia_porosiaId, int furnitori_furnitoriId, int brendi_brenidiId) {
        this.artikulliId = artikulliId;
        this.emriArtikullit = emriArtikullit;
        this.garancioni = garancioni;
        this.qmimiBlerjes = qmimiBlerjes;
        this.qmimiShitjes = qmimiShitjes;
        this.imei = imei;
        this.porosia_porosiaId = porosia_porosiaId;
        this.furnitori_furnitoriId = furnitori_furnitoriId;
        this.brendi_brenidiId = brendi_brenidiId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public String toString() {
        return "Artikulli{" + "artikulliId=" + artikulliId + ", emriArtikullit=" + emriArtikullit + ", garancioni=" + garancioni + ", qmimiBlerjes=" + qmimiBlerjes + ", qmimiShitjes=" + qmimiShitjes + ", imei=" + imei + ", porosia_porosiaId=" + porosia_porosiaId + ", furnitori_furnitoriId=" + furnitori_furnitoriId + ", brendi_brenidiId=" + brendi_brenidiId + '}';
    }
   
    
    public double getQmimiShitjes() {
        return qmimiShitjes;
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
        final Artikulli other = (Artikulli) obj;
        if (this.artikulliId != other.artikulliId) {
            return false;
        }
        if (Double.doubleToLongBits(this.qmimiBlerjes) != Double.doubleToLongBits(other.qmimiBlerjes)) {
            return false;
        }
        if (Double.doubleToLongBits(this.qmimiShitjes) != Double.doubleToLongBits(other.qmimiShitjes)) {
            return false;
        }
        if (this.porosia_porosiaId != other.porosia_porosiaId) {
            return false;
        }
        if (this.furnitori_furnitoriId != other.furnitori_furnitoriId) {
            return false;
        }
        if (this.brendi_brenidiId != other.brendi_brenidiId) {
            return false;
        }
        if (!Objects.equals(this.emriArtikullit, other.emriArtikullit)) {
            return false;
        }
        if (!Objects.equals(this.imei, other.imei)) {
            return false;
        }
        if (!Objects.equals(this.garancioni, other.garancioni)) {
            return false;
        }
        return true;
    }

    public void setQmimiShitjes(double qmimiShitjes) {
        this.qmimiShitjes = qmimiShitjes;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getPorosia_porosiaId() {
        return porosia_porosiaId;
    }

    public void setPorosia_porosiaId(int porosia_porosiaId) {
        this.porosia_porosiaId = porosia_porosiaId;
    }

    public int getFurnitori_furnitoriId() {
        return furnitori_furnitoriId;
    }

    public void setFurnitori_furnitoriId(int furnitori_furnitoriId) {
        this.furnitori_furnitoriId = furnitori_furnitoriId;
    }

    public int getBrendi_brenidiId() {
        return brendi_brenidiId;
    }

    public void setBrendi_brenidiId(int brendi_brenidiId) {
        this.brendi_brenidiId = brendi_brenidiId;
    }
    


    public void setArtikulliId(int artikulliId) {
        this.artikulliId = artikulliId;
    }

    public int getArtikulliId() {
        return artikulliId;
    }

    public String getEmriArtikullit() {
        return emriArtikullit;
    }

    public void setEmriArtikullit(String emriArtikullit) {
        this.emriArtikullit = emriArtikullit;
    }

    public Date getGarancioni() {
        return garancioni;
    }

    public void setGarancioni(Date garancioni) {
        this.garancioni = garancioni;
    }

    public double getQmimiBlerjes() {
        return qmimiBlerjes;
    }

    public void setQmimiBlerjes(double qmimiBlerjes) {
        this.qmimiBlerjes = qmimiBlerjes;
    }

}

