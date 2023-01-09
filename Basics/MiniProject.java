import java.util.Scanner;
public class MiniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber;
        do{
            System.out.print(" Guess my number(0-100): ");
            userNumber=sc.nextInt();
            if(userNumber == myNumber) {
                System.out.println("\n **--You guessed it right--**");
                break;
            }
            else if(userNumber>myNumber) System.out.println(" Your number is too large");
            else System.out.println(" Your number is too small");
        }while(userNumber>=0);
        System.out.print(" My number was: ");
        System.out.println(myNumber);
    }
}