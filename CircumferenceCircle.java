import java.util.Scanner;



public class CircumferenceCircle {



    public static float calculateCircumference(float radius){

        return (float) ((2*3.14)*radius);
    }

    public static void main(String[] args) {
        
// Write a function that takes in the radius as input and returns the circumference of a circle.
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Radius of circle");
 float radius = sc.nextFloat();

System.out.println( calculateCircumference(radius));;




    }
}