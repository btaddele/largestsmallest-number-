import java.util.Scanner;

public class Smalllargenumber {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;

        System.out.print("Input the 1st number: ");
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();


        System.out.print("Input the 2nd number: ");
        num2 = input.nextInt();

        System.out.print("Input the 3rd number: ");
        num3 = input.nextInt();


        if (num1 > num2 && num1 > num3) {

            System.out.println("The largest number is " + num1);
            if (num2 > num3) {
                System.out.println("The smallest number is " + num3);
            } else {
                System.out.println("The smallest number is " + num2);
            }
        } else if (num2 > num1 && num2 > num3) {

            System.out.println("The largest number is " + num2);
            if (num1 > num3) {
                System.out.println("The smallest number is " + num3);
            } else {
                System.out.println("The smallest number is " + num1);
            }
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("The largest number is " + num3);
            if (num2 > num1) {
                System.out.println("The smallest number is " + num1);
            } else {
                System.out.println("The smallest number is " + num2);
            }
        }else{
            System.out.println("The numbers are equal");


        }
    }
}