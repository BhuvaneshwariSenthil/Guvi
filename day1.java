import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 9 && marks <= 10) {
            System.out.println("Grade: O");
        } 
        else if (marks >= 8) {
            System.out.println("Grade: A");
        } 
        else if (marks >= 7) {
            System.out.println("Grade: B");
        } 
        else if (marks >= 6) {
            System.out.println("Grade: C");
        } 
        else if (marks >= 5) {
            System.out.println("Grade: D");
        } 
        else {
            System.out.println("Grade: F (Fail)");
        }

        sc.close();
    }
}

































