public class ShapeTest {
    
    public static void main(String[] args) {
        Shape s5 = new Circle("red", 10);
        ((Rectangle)s5).getWidth(); 

    }

    public static Shape findLargestShape(Shape[] s) {
        Shape largeShape = s[0];
        for (Shape i : s) {
            if (i != null && (i.getArea() > largeShape.getArea())) {
                largeShape = i; 
            }  
        }
        return largeShape; 
    }
}
