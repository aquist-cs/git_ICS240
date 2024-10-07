//package QuistAssignment1;

public class golfClub implements Comparable<golfClub> {
   String clubType;
   int clubNumber;

   /**
    * golfBag() Constructor for golfBag class
    * @param s Name of the golf club
    * @param n Number of the golf club
    */
   public golfClub(String s, int n) {
      this.clubType = s;
      this.clubNumber = n;
   }

   /**
    * getClubType()
    * @return the club type of the object. 
    */
   public String getClubType() {
      return this.clubType;
   }

   /**
    * getClubNumber()
    * @return the club number of the object. 
    */
   public int getClubNumber() {
      return this.clubNumber;
   }

   /**
    * setClubType()
    * @param clubType set the club type of the object 
    */
   public void setClubType(String clubType) {
      this.clubType = clubType;
   }

   /**
    * setClubNumber()
    * @param clubNumber sets the club number of the object.
    */
   public void setClubNumber(int clubNumber) {
      this.clubNumber = clubNumber;
   }

   /**
    * toString()
    * @return returns the club type and club number of the object as a String object. 
    */
   public String toString() {
      return this.clubType + "\t" + this.clubNumber;
   }

   /**
    * equals() 
    * @param o golfBag object to check against object the method was called on. 
    * @return boolean true or false if equal or not equal respectively. 
    */
   public boolean equals(golfClub o) {
      if (o instanceof golfClub) {
         return o.clubType.equalsIgnoreCase(this.clubType) && o.clubNumber == this.clubNumber;
      } else {
         return false;
      }
   }


   /**
    * compareto()
    * @param g golfClub object
    * @return 0 if equal, negative if less than, positive if greater than. 
    */
   @Override
   public int compareTo(golfClub g) {
      int compare = this.clubType.compareToIgnoreCase(g.clubType);
      if (compare != 0) {
         return compare;
      }
      else {
         if (this.clubNumber < g.clubNumber) {
            compare = (this.clubNumber - g.clubNumber); 
         }
         else if (this.clubNumber > g.clubNumber) {
            compare = (this.clubNumber - g.clubNumber); 
         }
      }
      return compare; 
   }

   public static void main(String[] args) {

   }
}
