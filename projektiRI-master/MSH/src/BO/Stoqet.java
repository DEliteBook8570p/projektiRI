package BO;
public class Stoqet{
    private int stoqetId;
    private int stokuFillestar;
    private int artikujtShitur;
    private int artikujtMbetur;
    private int brendi_brendiId;

    public Stoqet(int stoqetId, int stokuFillestar, int artikujtShitur, int artikujtMbetur, int brendi_brendiId) {
        this.stoqetId = stoqetId;
        this.stokuFillestar = stokuFillestar;
        this.artikujtShitur = artikujtShitur;
        this.artikujtMbetur = artikujtMbetur;
        this.brendi_brendiId = brendi_brendiId;
    }

    public Stoqet() {
    }

    public int getStoqetId() {
        return stoqetId;
    }

    public void setStoqetId(int stoqetId) {
        this.stoqetId = stoqetId;
    }

    public int getStokuFillestar() {
        return stokuFillestar;
    }

    public void setStokuFillestar(int stokuFillestar) {
        this.stokuFillestar = stokuFillestar;
    }

    public int getArtikujtShitur() {
        return artikujtShitur;
    }

    public void setArtikujtShitur(int artikujtShitur) {
        this.artikujtShitur = artikujtShitur;
    }

    public int getArtikujtMbetur() {
        return artikujtMbetur;
    }

    public void setArtikujtMbetur(int artikujtMbetur) {
        this.artikujtMbetur = artikujtMbetur;
    }

    public int getBrendi_brendiId() {
        return brendi_brendiId;
    }

    public void setBrendi_brendiId(int brendi_brendiId) {
        this.brendi_brendiId = brendi_brendiId;
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
        final Stoqet other = (Stoqet) obj;
        if (this.stoqetId != other.stoqetId) {
            return false;
        }
        if (this.stokuFillestar != other.stokuFillestar) {
            return false;
        }
        if (this.artikujtShitur != other.artikujtShitur) {
            return false;
        }
        if (this.artikujtMbetur != other.artikujtMbetur) {
            return false;
        }
        if (this.brendi_brendiId != other.brendi_brendiId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stoqet{" + "stoqetId=" + stoqetId + ", stokuFillestar=" + stokuFillestar + ", artikujtShitur=" + artikujtShitur + ", artikujtMbetur=" + artikujtMbetur + ", brendi_brendiId=" + brendi_brendiId + '}';
    }
   
}
