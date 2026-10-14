package control_statements;
import java.util.Scanner;

public class shortlist {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter GD marks: ");
        int gd = sc.nextInt();

        if (gd >= 70) {
            System.out.print("Enter Aptitude marks: ");
            int aptitude = sc.nextInt();

            if (aptitude >= 75) {
                System.out.print("Enter Technical Interview marks: ");
                int tech = sc.nextInt();

                if (tech >= 85) {
                    System.out.print("Enter HR Interview marks: ");
                    int hr = sc.nextInt();

                    if (hr >= 70) {
                        System.out.println("Congratulations! You are selected.");
                    } else {
                        System.out.println("Rejected in HR Interview.");
                    }
                } else {
                    System.out.println("Rejected in Technical Interview.");
                }
            } else {
                System.out.println("Rejected in Aptitude Round.");
            }
        } else {
            System.out.println("Rejected in GD Round.");
        }

	}
}
