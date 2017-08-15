package BO;
public class Furnitori_Stoqet {
    private int furnitori_furnitoriId;
    private int stoqet_stoqetId;

    public Furnitori_Stoqet() {
    }

    public Furnitori_Stoqet(int furnitori_furnitoriId, int stoqet_stoqetId) {
        this.furnitori_furnitoriId = furnitori_furnitoriId;
        this.stoqet_stoqetId = stoqet_stoqetId;
    }

    public int getFurnitori_furnitoriId() {
        return furnitori_furnitoriId;
    }

    public void setFurnitori_furnitoriId(int furnitori_furnitoriId) {
        this.furnitori_furnitoriId = furnitori_furnitoriId;
    }

    public int getStoqet_stoqetId() {
        return stoqet_stoqetId;
    }

    public void setStoqet_stoqetId(int stoqet_stoqetId) {
        this.stoqet_stoqetId = stoqet_stoqetId;
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
        final Furnitori_Stoqet other = (Furnitori_Stoqet) obj;
        if (this.furnitori_furnitoriId != other.furnitori_furnitoriId) {
            return false;
        }
        if (this.stoqet_stoqetId != other.stoqet_stoqetId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FurnitoriArtikulli{" + "furnitori_furnitoriId=" + furnitori_furnitoriId + ", stoqet_stoqetId=" + stoqet_stoqetId + '}';
    }
    
    
    
    
}
