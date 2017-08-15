package BO;
import java.util.Objects;
public class Brendi {
    private int brendiId;
    private String emriBrendit;
    private String Origjina;
    private String Modeli;

    public Brendi(int brendiId, String emriBrendit, String Origjina, String Modeli) {
        this.brendiId = brendiId;
        this.emriBrendit = emriBrendit;
        this.Origjina = Origjina;
        this.Modeli = Modeli;
    }

    public Brendi() {
    }

    public void setBrendiId(int brendiId) {
        this.brendiId = brendiId;
    }
    

    public int getBrendiId() {
        return brendiId;
    }

    public String getEmriBrendit() {
        return emriBrendit;
    }

    public void setEmriBrendit(String emriBrendit) {
        this.emriBrendit = emriBrendit;
    }

    public String getOrigjina() {
        return Origjina;
    }

    public void setOrigjina(String Origjina) {
        this.Origjina = Origjina;
    }

    public String getModeli() {
        return Modeli;
    }

    public void setModeli(String Modeli) {
        this.Modeli = Modeli;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Brendi other = (Brendi) obj;
        if (this.brendiId != other.brendiId) {
            return false;
        }
        if (!Objects.equals(this.emriBrendit, other.emriBrendit)) {
            return false;
        }
        if (!Objects.equals(this.Origjina, other.Origjina)) {
            return false;
        }
        if (!Objects.equals(this.Modeli, other.Modeli)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Brendi{" + "brendiId=" + brendiId + ", emriBrendit=" + emriBrendit + ", Origjina=" + Origjina + ", Modeli=" + Modeli + '}';
    }
    
}
