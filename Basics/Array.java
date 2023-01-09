import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        //Array '[]' then name then new and form like 'int' then no of spaces
        int[] marks = new int[3];
        marks[0]=97;
        marks[1]=98;
        marks[2]=95;
        System.out.println(marks);//prints a random value of some meaning
        System.out.println(marks[2]);//this prints 3rd position
        
        int[] a = new int[2];//An array with no values or with no initialization
        System.out.println(a[1]);//Gives out null or '0'
        
        boolean[] b = new boolean[2];
        System.out.println(b[1]);//This also gives out null or '0' thai means false

        System.out.println(marks.length);//Print lenght of array
        //sort
        System.out.println(marks[0]);//Before sorting
        Arrays.sort(marks);//Called the function arrays(have to import java.util.Arrays) for array 'marks'
        System.out.println(marks[0]);//After sorting
    }
}