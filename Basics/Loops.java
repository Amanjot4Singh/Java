public class Loops {
    public static void main(String[] args) {
        System.out.println(" 1");
        System.out.println(" 2");
        System.out.println(" 3");//Now to go from 1 to 100
        
        //for loop
        for(int i=1; i<=100; i++) System.out.println(i);/*this prints 1 to 100
        first one is for the variable, this variable is only usable in the for loop
        second one is the statements until it stays true the loop occurs
        third one is for updation of the variable
        for goint from 100 to one*/
        for(int i=100; i>=1; i--) System.out.println(i);

        //while loop
        int j=100;//variable declaration
        while(j>=1) {//condtion to keep true
            System.out.println(j);
            j--;//updation of variable
        }

        //do-while loop
        int k=100;//variable declaration
        do {
            System.out.println(k);
            k--;//variable updataion
        } while(k>=1);//statement to keept true
    }
}
