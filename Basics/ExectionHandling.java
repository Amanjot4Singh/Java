public class ExectionHandling {
    public static void main(String[] args) {
        //Try-Catch
        int[] marks={97,98,95};
        try {
            System.out.println(marks[5]);//won't be able to execute so put in try block
        } catch(Exception exception) {
            //does something after catching exception
        }
        System.out.println(" The name is Aman");//after using try this can be executed
    }
}
