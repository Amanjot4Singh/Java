public class Operators {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int sum=a+b;//arithematic operators(can be changed with '-','+','*'or'/')
        System.out.println(sum);//If in case the dividing answers comes out inpoints and it is int then decimal numbers are deleted
        //modulo
        double c=5;
        double d=3;
        double modulo=c%d;
        System.out.println(modulo);//this outputs the remainder of the division
        // 5 Arithematic Operators are + - * / %
        //'='is an assignment operator
        //uniary operators
        int numb=1;
        //numb=numb+1; instead of writing this a uniary operator can be used
        //numb++;Adds one number
        System.out.println(numb++);//can be used here also, prints 1 (Increment Operator)
        System.out.println(numb);//prints 2
        int numb0=1;
        System.out.println(++numb0);//prints 2
        System.out.println(numb0);//prints 2
        // a++ first use then increase, whereas ++a first increases then uses
        int numb1=1;
        System.out.println(numb1--);//prints 1 (Decrement Operator)
        System.out.println(numb1);//prints 0
        int numb2=1;
        System.out.println(--numb2);//prints 0
        System.out.println(numb2);//prints 0
        // a-- first use then decrease, whereas --a first decreases then uses
    }
}
