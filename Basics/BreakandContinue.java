public class BreakandContinue {
    public static void main(String[] args) {
        int i=0;
        while(true) {//condition kept tru tu run infinte loop
            if(i==3) {
                i++;//if not used the value of 'i' stays same and doesn't move on
                continue;//this skips the currents value 
            }
            System.out.println(i);
            i++;//variable updation
            if(i>5) break;//condition to keep true, 'break' keyword breaks the loop and exits it
        }
    }
}
