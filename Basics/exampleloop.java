import java.util.Scanner;
public class exampleloop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number;
        do {
            System.out.print(" Input a number: ");
            number = sc.nextInt();
            System.out.print(" This is you number: ");
            System.out.println(number);
        } while(number>=0);
        System.out.println(" THE END");

    }
}
