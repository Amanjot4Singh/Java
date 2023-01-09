public class MathsClass {
    public static void main(String[] args) {
        //Max & Min
        System.out.println(Math.max(5,6));//Prints max value
        System.out.println(Math.min(5,6));//Prints min value
        //Random
        System.out.println(Math.random());//Prints Random value, by default it is in the form of long
        System.out.println((int)Math.random());//Can be explicitly casted, but prints 0 because it is always smaller than 0 and decimals gets deleted
        System.out.println((int)(Math.random()*100));//Solution
    }
    
}
