public class Rectangle extends Shape{
    private int length; 
    private int width; 

    public Rectangle(String c, int l, int w) {
        super(c);  
        length = l;
        width = w; 
    }

    public int getLength() {
        return length; 
    }

    public int getWidth() {
        return width; 
    }

    public double getArea() {
        double a = getLength() * getWidth(); 
        return a;  
    }

    public String toString() {
        String o; 
        o = "Rectangle, " + "color = " + getColor() + ", length = " + getLength() + " width = " + getWidth();
        return o;
    }

    public static void main(String[] args) {
        Rectangle t = new Rectangle("Green", 2, 4); 
        System.out.print(t.toString()); 
    }
}
