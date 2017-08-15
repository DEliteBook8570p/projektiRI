package BO;

import java.util.Objects;

public class LlogariaBankare {
    private int llogariaBankareId;
    private String emriBankes;
    private String llojiKarteles;
    private String nrLlogaris;

    public LlogariaBankare(int llogariaBankareId, String emriBankes, String llojiKarteles, String nrLlogaris) {
        this.llogariaBankareId = llogariaBankareId;
        this.emriBankes = emriBankes;
        this.llojiKarteles = llojiKarteles;
        this.nrLlogaris = nrLlogaris;
    }

    public LlogariaBankare() {
    }

    public int getLlogariaBankareId() {
        return llogariaBankareId;
    }

    public void setLlogariaBankareId(int llogariaBankareId) {
        this.llogariaBankareId = llogariaBankareId;
    }

    public String getEmriBankes() {
        return emriBankes;
    }

    public void setEmriBankes(String emriBankes) {
        this.emriBankes = emriBankes;
    }

    public String getLlojiKarteles() {
        return llojiKarteles;
    }

    public void setLlojiKarteles(String llojiKarteles) {
        this.llojiKarteles = llojiKarteles;
    }

    public String getNrLlogaris() {
        return nrLlogaris;
    }

    public void setNrLlogaris(String nrLlogaris) {
        this.nrLlogaris = nrLlogaris;
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
        final LlogariaBankare other = (LlogariaBankare) obj;
        if (this.llogariaBankareId != other.llogariaBankareId) {
            return false;
        }
        if (!Objects.equals(this.emriBankes, other.emriBankes)) {
            return false;
        }
        if (!Objects.equals(this.llojiKarteles, other.llojiKarteles)) {
            return false;
        }
        if (!Objects.equals(this.nrLlogaris, other.nrLlogaris)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LlogariaBankare{" + "llogariaBankareId=" + llogariaBankareId + ", emriBankes=" + emriBankes + ", llojiKarteles=" + llojiKarteles + ", nrLlogaris=" + nrLlogaris + '}';
    }       
}
