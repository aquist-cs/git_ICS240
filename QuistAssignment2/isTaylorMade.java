public class isTaylorMade extends golfClub {

    boolean isTm; 

    public isTaylorMade(String s, int n, boolean tm) {
        super(s, n);
        this.isTm = tm; 
    }

    /**
     * getIsTaylorMade()
     * @return isTm 
     */
    public boolean getIsTaylorMade() {
        return this.isTm; 
    }

    /**
     * setIsTaylorMade()
     * @param isTm sets the value to isTm
     */
    public void setIsTaylorMade(boolean isTm) {
        this.isTm = isTm; 
    }

    public String toString() {
        return this.clubType + "\t" + this.clubNumber + "\t" + this.isTm; 
    }

    /**
     * equals()
     * @param tm isTaylorMade object we are comparing. 
     * @return true if equal, false otherwise. 
     */
    public boolean equals(isTaylorMade tm) {
        if (super.equals(tm) && this.isTm == tm.isTm) {
            return true; 
        }
        return false; 
    }
}
