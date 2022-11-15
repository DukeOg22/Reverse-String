import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner reverse = new Scanner(System.in);
        String rs;
        rs = reverse.nextLine();
        System.out.println(Stringreversal(rs));
    }

    public static String Stringreversal(String string){

        StringBuilder reversal=new StringBuilder(string);
        reversal.reverse();
        return reversal.toString();
    }  



}

