public class Degree extends golfClub {
    int clubDegree; 

    public Degree (String s, int n1, int n2) {
        super(s, n1); 
        this.clubDegree = n2; 
    }

    /**
     * getClubDegree
     * @return clubDegree
     */
    public int getClubDegree() {
        return clubDegree; 
    }

    /**
     * setClubDegree
     * @param clubDegree degree of the Degree object, 
     */
    public void setClubDegree(int clubDegree) {
        this.clubDegree = clubDegree; 
    }

    public String toString() {
        return this.clubType + "\t" + this.clubNumber + "\t" + this.clubDegree; 
    }

    /**
     * equals()
     * @param d Degree object which we are compaing
     * @return true of equal, false otherwise. 
     */
    public boolean equals(Degree d) {
        if (super.equals(d) && this.clubDegree == d.clubDegree) {
            return true; 
        }
        return false; 
    } 
}
