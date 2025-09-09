import java.util.Scanner;

public class Practice{

public static float calculateAverage(int[] myArray){
    float average=0;
    float sum=0;
 for (int i = 0; i < myArray.length; i++) {
     sum += myArray[i];
      average= (sum/myArray.length);

 }
return average;
}


    public static void main(String[] args) {

        //Enter 3 numbers from the user & make a function to print their average.

Scanner sc = new Scanner(System.in);
 int[] myArray = new int[3];
for (int i = 0; i <=2; i++) {
    System.out.println("Enter the " + (i +1) +" number ");
    
myArray[i] = sc.nextInt();
}


System.out.println(calculateAverage(myArray));

    }
}