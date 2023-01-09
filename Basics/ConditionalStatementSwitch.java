public class ConditionalStatementSwitch {
    public static void main(String[] args) {
        int day = 2;//1 means monday, 2 means tuesday and so on,..
        switch(day) {
            case 1: System.out.println(" Monday");
            break;
            case 2: System.out.println(" Tuesday");
            break;
            default: System.out.println( " Wednesday to Sunday");

        }
    }
}
