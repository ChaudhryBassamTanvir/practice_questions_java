import java.util.Scanner;

public class PowerQ {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.


System.out.println("Enter the value of x ");
int x = sc.nextInt();
System.out.println("Enter the value of n ");
    int n = sc.nextInt();
System.out.println(" The x raised to the power n is " + Math.pow(x, n));

}
}
