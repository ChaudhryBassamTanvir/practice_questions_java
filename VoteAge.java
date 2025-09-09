import java.util.Scanner;

public class VoteAge {

//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.


    public static void vote(int age){
        if (age>=18) {
            System.out.println("This person is eligible for Voting");
            
        }else{

            System.out.println("This person is not eligible for the vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int age = sc.nextInt();

       vote(age);
    }
}
