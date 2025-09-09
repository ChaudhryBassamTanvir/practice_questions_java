import java.util.Scanner;

public class SumOfOdds {
    public static void main(String[] args) {
        //Write a function to print the sum of all odd numbers from 1 to n.

Scanner sc = new Scanner(System.in);
System.out.println("Enter the range of numbers whose odd sum you want ");
int n = sc.nextInt();
int sum=0;
for (int i = 1; i <=n; i++) {
    if (i%2!=0) {
   sum+=i;
        
    } 
}
System.out.println("The sum of odds number is " + sum);


    }
}
