package scanner;
import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter your date of birth: ");
        String dob = sc.nextLine();

        System.out.print("Enter your father's name: ");
        String fatherName = sc.nextLine();

        System.out.print("Enter your mother's name: ");
        String motherName = sc.nextLine();

        System.out.print("Enter your address: ");
        String address = sc.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = sc.nextLine();

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        System.out.print("Enter your qualification: ");
        String qualification = sc.nextLine();

        System.out.print("Enter your college name: ");
        String college = sc.nextLine();

        System.out.print("Enter your nationality: ");
        String nationality = sc.nextLine();

        System.out.println("\n----- BIODATA -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Father's Name: " + fatherName);
        System.out.println("Mother's Name: " + motherName);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Qualification: " + qualification);
        System.out.println("College: " + college);
        System.out.println("Nationality: " + nationality);

        
    }
}
