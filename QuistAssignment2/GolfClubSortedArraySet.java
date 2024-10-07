public class GolfClubSortedArraySet {
    private golfClub[] gArry;
    private int max; 
    private int size; 


    public GolfClubSortedArraySet(int m) {
        max = m; 
        gArry = new golfClub[max]; 
        size = 0;
    }

    /**
     * getGolfClubs()
     * @return gArrys, allows access in driver file. 
     */
    public golfClub[] getGolfClubs() {
        return gArry; 
    }

    /**
     * insert() - checks for duplicates and inserts g into GolfClubSortedArray in the correct order.
     * @param g golfClub object to insert into GolfClubSortedArray. 
     */
    public void insert(golfClub g) {
        for (int i = 0; i < size; i++) {
            if (gArry[i].equals(g)) {
                return; // found duplicate 
            }
        }

        // index to insert
        int index = 0;
        while (index < size && gArry[index].compareTo(g) < 0) {
            index++; 
        }
        // make sure there is space 
        if (size < max) {
            // shifting 
            for (int i = size; i > index; i--) {
                gArry[i] = gArry[i - 1];
            }
            // insert 
            gArry[index] = g;
            size++; 
        }
    }

    /**
     * size()
     * @return returns the current size of the array. 
     */
    public int size() {
        return size; 
    }

    /**
     * toString()
     * @return returns all golfClub objects in the GolfClubSortedArray in a tabular format. 
     */
    public String toString() {
        String out = ""; 
        for (int i = 0; i < size; i++) {
            out += gArry[i].toString() + "\n"; 
        }
        return out; 
    }

    /**
     * indexOf()
     * @param g golfClub object to get the index of. 
     * @return returns index of golfClub object passed.
     */
    public int indexOf(golfClub g) {
        for (int i = 0; i < size; i++) {
            if (gArry[i].equals(g)) {
                return i; 
            }
        }
        return -1; 
    }

    /**
     * remove - removes golfClub object from GolfClubSortedArray
     * @param g golfClub to remove
     * @return true if successful false if not found.
     */
    public boolean remove(golfClub g) {
        int dex = indexOf(g);

        if (dex == -1) {
            return false; // not found
        }

        // shift 
        for (int i = dex; i < size - 1; i++) {
            gArry[i] = gArry[i + 1];
        }
        size--; 
        return true; //removed
    }

    /**
     * grab() - gets golfClub object at this index. 
     * @param index of where we are returning the golfClub object. 
     * @return golfClub object at index
     */
    public golfClub grab(int index) {
        return gArry[index]; 
    }

    /**
     * categorySet() 
     * @param type the type of golfClub object
     * @return GolfClubSortedArraySet of type that was passed in type. 
     */
    public GolfClubSortedArraySet categorySet(int type) {
        GolfClubSortedArraySet result = new GolfClubSortedArraySet(max);
        for (int i = 0; i < size; i++) {
            // check for types 
            if (
                (type == 1 && gArry[i] instanceof Degree) ||
                (type == 2 && gArry[i] instanceof isTaylorMade) ||
                (type == 3 && !(gArry[i] instanceof Degree) && !(gArry[i] instanceof isTaylorMade))
            ) {
                result.insert(gArry[i]); // insert
            }
        }
        return result; 
    }
}
