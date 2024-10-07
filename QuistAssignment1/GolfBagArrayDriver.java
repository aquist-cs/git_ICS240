import java.util.Scanner; 
import java.io.File; 
import java.io.FileNotFoundException; 

public class GolfBagArrayDriver  {

    /**
     * overAvg()
     * @param a golfClub[] an array of golfClub objects
     * @return the average of the integer attributes
     */
    public int overallAvg(golfClub[] a) {
        int cnt = 0; 
        int tot = 0;

        for (golfClub g : a) {
            cnt = cnt + 1; 
            tot = tot + g.clubNumber; 
        }
        return tot/cnt; 
    }

    /**
     * count() 
     * @param a array of golfClub objects
     * @param o golfClub object
     * @return the number of golfClubs in the input array that are equal to the input golfClub Object
     */
    public int count(golfClub[] a, golfClub o) {
        int cnt = 0; 
        for (golfClub g : a) {
            if (g.clubType.equalsIgnoreCase(o.clubType) && g.clubNumber == o.clubNumber) {
                cnt++; 
            }
        }
        return cnt; 
    }

    /**
     * groupAvg()
     * @param a array of golfClub objects
     * @param s string to group by
     * @return the average of club numbers where clubType is equivalent to s.  
     */
    public int groupAvg(golfClub[] a, String s) {
        int cnt = 0; 
        int tot = 0; 
        for (golfClub g : a) {
            if (g.clubType.equalsIgnoreCase(s)) {
                cnt++;
                tot += g.clubNumber; 
            }
        }
        return tot/cnt;
    }

    /**
     * lessThan()
     * @param a array of golfClub objects
     * @param i integer to check golfClub objects against
     * @return an array of golfClub objects where clubNumbers < i
     */
    public golfClub[] lessThan(golfClub[] a, int i) {
        golfClub[] out = new golfClub[20]; 
        int cnt = 0; 
        for (golfClub g : a) {
            if (g.clubNumber < i) {
                out[cnt] = g; 
                cnt++;  
            }
        }
        return out; 
    }

    /**
     * groupEdit()
     * @param a an array of golfCLub objects
     * @param s string to match clubType to
     * @param n integer that is added to club number when clubtype is matched
     */
    public void groupEdit(golfClub[] a, String s, int n) {
        for (golfClub g : a) {
            if (g.clubType.equalsIgnoreCase(s)) {
                g.clubNumber += n;
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        // Declaring objects
        golfClub[] golfBagArr = new golfClub[20]; 
        Scanner scanner = new Scanner(System.in); 

        // Getting user input and saving to variable
        String fname = ""; 
        System.out.println("Please enter file name: ");
        fname = scanner.nextLine(); 

        // Declaring file objects
        File file = new File(fname); 
        Scanner fScanner = new Scanner(file);

        // Reading file line by line and assigning new object to ArrayList
        int counter = 0; 
        while(fScanner.hasNext()) {
            String type = fScanner.next(); 
            int num = fScanner.nextInt(); 
            golfClub newClub = new golfClub(type, num); 
            golfBagArr[counter] = newClub; 
            counter++; 
        }

        for (golfClub g : golfBagArr) {
            System.out.println(g); 
        }
        scanner.close(); 
        fScanner.close(); 
    }
}

