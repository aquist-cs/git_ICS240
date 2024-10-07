// File Line.java

/*******************************************
* A Line in 2-dimentional Cartesian space.  It is determined by its
* start and end points.
********************************************/
public class Line implements Comparable{

	Point start;  // Start Point of line
	Point end;    // End Point of line
	static final double EPSILON = 0.00001;   // Maximum diff for equality
	
	/**
	* Create a Line from Point start to Point end.  
	* A Line from start to end is NOT the same as a Line from end to start!
	* @param starting Point of the Line
	* @param ending Point of the Line
	**/
	public Line( Point start, Point end ) {
		this.start = start;
		this.end = end;
	}
	
	/**
	* Create a Line from Point (0.0, 0.0) to Point (1.0, 1.0).  
	**/
	public Line() {
		Point p = new Point( 0.0, 0.0 );
		Point q = new Point( 1.0, 1.0 );
		start = p;
		end = q;
	}
	
	public Point getStart() { return start; }
	
	public Point getEnd() { return end; }
	
	/**
	* Two Lines are equal if they start and end at the same point.
	* @param ln The other line to check for equality with this Line.
	* @return true if the lines have the same start and end points, else false.
	**/
	public boolean equals( Line ln ) {
		if ( ( start.equals( ln.getStart() ) && ( end.equals( ln.getEnd() ) ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	* Print a Line by printing the first Point, an arrow, then the second Point.
	* @return The String representing the Line.
	**/
	@Override
	public String toString() {
		String ret =  start.toString() + "-->" + end.toString();
		return ret;
	}

	public double length() {
		double x = end.getX() - start.getX();
		double y = end.getY() - start.getY(); 
		double l = Math.sqrt((x * x) + (y * y));
		return l;
	}

	public int compareTo(Line ln) {
		double l1 = this.length();
		double l2 = ln.length();

		if ((l1 - l2) <= EPSILON) {
			return 0;
		}
		else if (l1 < l2) {
			return -1;
		}
		else {
			return 1;
		}
	}

}
	
	