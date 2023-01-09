public class Casting {//Converting from one type to other
    public static void main(String[] args) {
        double price=100.00;
        double finalPrice=price+18;//here '18' automatically gets changed into a double as'18.00'
        
        System.out.println(finalPrice);
        
        /* int p=100;
        int fp = p + 18.0; this here give error as '18.0' a doble doesn't get converted into int
        Double cannot change to int but ont can change into double*/
        int p=100;
        int fp = p + (int)18.99;//explicit casting, here and digits after .99 gets deleted
        System.out.println(fp);
        int age=30;
        age=31;
        age=32;//variable keeps on changing
        System.out.println(age);//just for the annoying error
        final float PI=3.14F;//this cannot be changed
        System.out.println(PI);//just for the annoying error
    }
}
