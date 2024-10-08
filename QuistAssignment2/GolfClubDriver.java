import java.io.FileNotFoundException;
import java.io.File; 
import java.util.Scanner; 

public class GolfClubDriver {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner s = new Scanner(System.in); 
        String fname = ""; 

        System.out.print("Enter file name: ");
        fname = s.nextLine(); 
        File f = new File(fname); 
        
        GolfClubSortedArraySet gca = new GolfClubSortedArraySet(30); 

        Scanner fScanner = new Scanner(f); 
        while (fScanner.hasNext()) {
            int clubType = fScanner.nextInt();
            String clubName = fScanner.next(); 
            int clubNum = fScanner.nextInt(); 
            golfClub temp = null; 
            
            if (clubType == 1) {
                int clubDeg = fScanner.nextInt(); 
                temp = new Degree(clubName, clubNum, clubDeg);
            }
            else if (clubType == 2) {
                boolean isTay = fScanner.nextBoolean(); 
                temp = new isTaylorMade(clubName, clubNum, isTay); 
            }
            else if (clubType == 3) {
                temp = new golfClub(clubName, clubNum); 
            }

            gca.insert(temp); // This is testing insert(). 
        }
        // Print out GolfClubSortedArraySet
        System.out.println("Printing gca:");
        System.out.println(gca.toString()); 
        

        // Testing indexOf
        System.out.println("Testing indexOf:");
        System.out.println(gca.indexOf(new isTaylorMade("PWedge", 49, true))); 
        System.out.println(gca.indexOf(new Degree("Hybrid", 4, 13))); 
        System.out.println();

        // Testing remove 
        System.out.println("Testing remove:");
        System.out.println("Before: ");
        System.out.println(gca.toString()); 
        System.out.println("Removed?"); 
        System.out.println(gca.remove(new isTaylorMade("PWedge", 49, true)));
        System.out.println(gca.remove(new Degree("Hybrid", 4, 13)));
        System.out.println(); 
        System.out.println("After: ");
        System.out.println(gca.toString()); 

        // Testing grab 
        System.out.println("Testing grab:");
        System.out.println(gca.grab(4));
        System.out.println(gca.grab(15));
        System.out.println();

        // Testing categorySet
        System.out.println("Testing categorySet type 1: ");
        System.out.print(gca.categorySet(1)); 
        System.out.println();
        System.out.println("Testing categorySet type 2: ");
        System.out.print(gca.categorySet(2)); 
        System.out.println();
        System.out.println("Testing categorySet type 3: ");
        System.out.println(gca.categorySet(3)); 

        // Testing size()
        System.out.println("Testing size()");
        System.out.println(gca.size()); 
        System.out.println();

        // Testing toString()
        System.out.println("Testing toString()"); 
        System.out.println(gca.toString()); 

        // Closing Scanners
        s.close();
        fScanner.close(); 
    }
}