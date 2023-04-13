import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        System.out.println(question());
    }
    public static String question(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Student Name:");
        String studentName = scan.nextLine();
        System.out.println("Enter Your ID:");
        int studentId = scan.nextInt();
        String result= "Name: " + studentName + " ID: " + studentId;
        return result;
    }
}