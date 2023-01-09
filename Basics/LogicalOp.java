public class LogicalOp {
    public static void main(String[] args) {
        int a = 60;
        int b = 40;
        if (a < 50 && b < 50)
            System.out.println(" Both are less than 50");// nothing prints as condition is false
        if (a > 50 || b > 50)
            System.out.println(" at least one less than 50");
        // '&&' both statements should be met,'||' any one statement should be met
        boolean isAdult = true;
        if (!isAdult == true)
            System.out.println("is adult");// if here '==true' is not written it takes it automatically to be true
        // it is checking for it to be not true
        else
            System.out.println(" not adult");
    }
}