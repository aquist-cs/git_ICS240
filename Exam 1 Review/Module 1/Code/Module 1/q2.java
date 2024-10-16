// Q2: 
//      (a) Write a method to compute the average of two numbers.
//              - Will this method require any inputs?
//              - Will it have a return value? 

//      (b) Write a method that prints the current age of a student when given the year of birth.
//              - Will this method require any inputs?
//              - Will it have a return value?

public class q2 {
    public static double avg(double n1, double n2) {
        double ans = n1 / n2; 
        return ans; 
    }

    public static int age(int year, int bYear) {
        int ans = year - bYear;
        return ans; 
    }

    public static void main(String[] args) {
        System.out.println(avg(10, 25)); 

        System.out.println(age(2024, 1994)); 
    }

}
