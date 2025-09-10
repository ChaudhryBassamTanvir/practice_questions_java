import java.util.Scanner;

public class GreaterCommonDivisor {

public static int calculateGCD(int a, int b){
if(b==0){
return Math.abs(a);

}
return calculateGCD(b,a% b);


}


    public static void main(String[] args) {
//    Write a function that calculates the Greatest Common Divisor of 2 numbers.      

Scanner sc = new Scanner(System.in);

System.out.println("Enter the First number");
int a = sc.nextInt();
System.out.println("Enter the second number");
int b = sc.nextInt();

System.out.println("The GCD of " + a +" "+ b + " is " + calculateGCD( a,b));;



    }
}
