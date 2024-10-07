// File:  Point.java

/*************************************************
* A Point in 2-dimensional Cartesian space.
*
* @author Mike Stein
**************************************************/
public class Point {

	double x;  // x-coordinate of the point
	double y;  // y-coordinate of the point
	static final double EPSILON = 0.00001;   // Maximum diff for equality
	
	/**
	* Create a point at the origin.
	**/
	public Point() {
		x = 0.0;
		y = 0.0;
	}
	
	/**
	* Create a point at a user-specified location on the plane.
	* @param x x-coordinate of the point
	* @param y y-coordinate of the point
	**/
	public Point( double x, double y ) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() { return x; }
	
	public double getY() { return y; }
	
	/**
	* Two points are equal if their x and y coordinatea are equal
	* to within a small distance of each other (EPSILON).
	* @param p The point to compare with this point for equality
	* @return true if the points are the same, false otherwise
	**/
	public boolean equals( Point p ) {
		if ( ( Math.abs( x - p.getX() ) < EPSILON ) && 
		     ( Math.abs( y - p.getY() ) < EPSILON ) ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	* The String that represents the point.
	* @return ( x-coordinate, y-coordinate ), e.g. ( -2.05,   4.00 )
	**/
	@Override
	public String toString() {
		String ret = String.format( "( %6.2f, %6.2f )", x, y );
		return ret;
	}
}