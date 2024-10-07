public abstract class Shape {
    private String color; 
    public abstract double getArea(); 


    public Shape(String c) {
        color = c; 
    }

    public String getColor() {return color;}
}