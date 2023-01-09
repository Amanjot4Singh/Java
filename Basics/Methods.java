public class Methods {
    public static void printJava(){//Function is made
        System.out.println(" Hello Java");
    }
    public static void printName(String name) {
        System.out.println(name);
    }
public static void printSum(int a, int b) {
    int sum=a+b;
    System.out.println(sum);
}    public static void main(String[] args) {
        printJava();//Function is called
        printJava();//can be called as many times as needed
        printJava();
        printName(" Aman");
        printName(" Akku");
        int a,b;
        printSum(a=1, b=6);   
    }
}
