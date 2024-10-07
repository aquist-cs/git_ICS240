public class isTaylorMade extends golfClub {

    boolean isTm; 

    public isTaylorMade(String s, int n, boolean tm) {
        super(s, n);
        this.isTm = tm; 
    }

    public boolean getIsTaylorMade() {
        return this.isTm; 
    }

    public void setIsTaylorMade(boolean isTm) {
        this.isTm = isTm; 
    }

    public String toString() {
        return this.clubType + "\t" + this.clubNumber + "\t" + this.isTm; 
    }

    public boolean equals(isTaylorMade tm) {
        if (super.equals(tm) && this.isTm == tm.isTm) {
            return true; 
        }
        return false; 
    }
}
