import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        double num1 = scanner.nextInt();
        System.out.println("Enter your second number: ");
        double num2 = scanner.nextInt();

        System.out.println("Select your operation");
        System.out.println("1-Addition");
        System.out.println("2-Subtraction");
        System.out.println("3-Multiplication");
        System.out.println("4-Division");
        System.out.println("What is your selection: ");

        int selection = scanner.nextInt();
        if(selection ==1){
            System.out.println("Result: "+(num1+num2));
        }
        else if(selection==2){
            System.out.println("Result: "+(num1 - num2));
        }
        else if(selection==3){
            System.out.println("Result: "+(num1*num2));
        }
        else if (selection==4){
            System.out.println("Result: "+(float)num1/num2);
        }
        else{
            System.out.println("Process is invalid. Please check your selection. ");
        }
    }
}
