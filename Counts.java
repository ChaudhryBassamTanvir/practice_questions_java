import java.util.ArrayList;
import java.util.Scanner;

public class Counts {
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);

// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

System.out.println("Enter the amount till where you want to enter numbers ");

int n = sc.nextInt();

int[] numberarray= new int[n];

    for (int i = 0; i <n; i++) {

   numberarray[i]= sc.nextInt();
        
    }



    int positiveInteger= 0;
    int negativeInteger=0;
    int countZero=0;


    for (int i = 0; i < numberarray.length ; i++) {
        if (numberarray[i]> 0) {
            positiveInteger++;
        } else if (numberarray[i] < 0) {
           negativeInteger++;
        } else{
              countZero++;
        }
 


    }

System.out.println("The number of positive Integers is " + positiveInteger);
System.out.println("The number of negative Integers is " + negativeInteger);
System.out.println("The number of Zero Integers is " + countZero);




    }
}
