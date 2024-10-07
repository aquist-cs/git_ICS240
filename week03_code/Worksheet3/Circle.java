public class Circle extends Shape {
    private int radius; 
    
    public Circle(String c, int r) {
        super(c); 
        radius = r; 
    }

    public int getRadius() {
        return radius; 
    }

    public double getArea() {
        double a = Math.PI * (Math.pow(getRadius(), 2)); 
        return a; 
    }

    public String toString() {
        String o; 
        o = "Circle, " + "color = " + getColor() + ", radius = " + getRadius();
        return o;
    }

    public static void main(String[] args) {
        Circle t = new Circle("Blue", 7);  
        System.out.print(t.toString()); 
    }
}
