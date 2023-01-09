
public class Strings {
    public static void main(String[] args) {
        //Concatenate - joining two strings
        String name1 ="Aman";
        String name2 ="Jack";
        String name3 = name1+" and "+name2;
        System.out.println(name3);//Concatination
        //charAt
        System.out.println(name1.charAt(0));//in java oth positions referes to first one
        //replace
        String name4 = name1.replace('a','b');
        System.out.println(name4); 
        //substring
        System.out.println(name3.substring(5,8));//prints only 'and' as from character from 5th to 8th
    }
}
