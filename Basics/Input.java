import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*System.out.println(" Input your age: ");
        int age = sc.nextInt();//can be changed to float or any other form
        System.out.println(age);
        System.out.println(" Input your name: ");
        String name=sc.next();//next is used to take input as string,only takes input a single word
        System.out.println(name);*/
        //The functionbelow only works if the above are not there forsome reason
        System.out.println(" Briefly describe yourself: ");
        String def=sc.nextLine();//takes the whole line as input
        System.out.println(def);
    }
}