import java.util.Scanner;
public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cash=sc.nextInt();
        //say a pen =10 and copy = 40
        if(cash<10) {
            System.out.println(" Cannot buy anything");
            System.out.println(" get more cash");
        }
        else if(cash>10 && cash<50) System.out.println(" can get one thing");
        else System.out.println(" can get both");
    }
}