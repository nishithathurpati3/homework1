import java.util.Scanner;

public class palindrome{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        String name= scan.nextLine();
        String reverse="";
        for(int i=name.length()-1;i>=0;i--){
            reverse= reverse+name.charAt(i);
        }
        System.out.println(reverse);
        if(reverse.equalsIgnoreCase(name)){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }

    }
}