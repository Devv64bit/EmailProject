import java.util.Scanner;
import java.security.SecureRandom;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String altEmail;
    private int mailboxCapacity;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created for : " + this.firstName + " " + this.lastName);

        this.department = setDepartment();
        System.out.println("Department is: " + this.department);

        this.password = generatePassword(10);
        System.out.println("Your password is: " + this.password);
    }

    private String setDepartment() {
        System.out.println("Department Codes: ");
        System.out.println("1 for Sales" + "\n2 for Development" + "\n3 for Accounting" + "\n0 for none");
        System.out.println();
        System.out.print("Enter your department: ");
        Scanner read = new Scanner(System.in);
        int DepChoice = read.nextInt();

        if (DepChoice == 1) {
            return "Sales";

        } else if (DepChoice == 2) {
            return "Development";

        } else if (DepChoice == 3) {
            return "Accounting";

        } else {
            return "N/A";
        }
    }

    private String generatePassword(int length) {
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%&*";
        SecureRandom random = new SecureRandom();
        StringBuilder builder = new StringBuilder();

        for (int x = 0; x < length; x++) {
            int randomIndex = random.nextInt(chars.length());
            builder.append(randomIndex);
        }
        return builder.toString();
    }

}