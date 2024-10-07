public class Degree extends golfClub {
    int clubDegree; 

    public Degree (String s, int n1, int n2) {
        super(s, n1); 
        this.clubDegree = n2; 
    }

    public int getClubDegree() {
        return clubDegree; 
    }

    public void setClubDegree(int clubDegree) {
        this.clubDegree = clubDegree; 
    }

    public String toString() {
        return this.clubType + "\t" + this.clubNumber + "\t" + this.clubDegree; 
    }

    public boolean equals(Degree d) {
        if (super.equals(d) && this.clubDegree == d.clubDegree) {
            return true; 
        }
        return false; 
    } 
}
