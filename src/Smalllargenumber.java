import java.util.Scanner;

public class Smalllargenumber {
    public static void main(String[] args) {
        int x;
        int y;
        int z;

        System.out.println("Input the 1st number: ");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();


        System.out.print("Input the 2nd number: ");
        y = input.nextInt();

        System.out.print("Input the 3rd number: ");
        z = input.nextInt();


        if (x > y && x > z) {

            System.out.println("The largest number is " + x);
            if (y > z) {
                System.out.println("The smallest number is " + z);
            } else {
                System.out.println("The smallest number is " + y);
            }
        } else if (y > x && y > z) {

            System.out.println("The largest number is " + y);
            if (x > z) {
                System.out.println("The smallest number is " + x);
            } else {
                System.out.println("The smallest number is " + z);
            }
        } else if (z > x && z > y) {
            System.out.println("The largest number is " + z);
            if (y > x) {
                System.out.println("The smallest number is " + x);
            } else {
                System.out.println("The smallest number is " + y);
            }
        }else{
            System.out.println("The numbers are equal");


        }
    }
}