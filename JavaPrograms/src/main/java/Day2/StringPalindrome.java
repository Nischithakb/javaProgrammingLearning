package Day2;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args){
        Scanner SC= new Scanner(System.in);
        System.out.println("Enter your String input");
        String UserInput=SC.nextLine();
        UserInput=UserInput.toLowerCase();
        String ReverseString="";
        for(int i=UserInput.length()-1;i>=0;i--){
            ReverseString=ReverseString+UserInput.charAt(i);

        }
        System.out.println(ReverseString);
        if(ReverseString.equals(UserInput)){
            System.out.println("String is a Palindrome");
        }
        else{
            System.out.println("String is not a Palindrome");
        }
        SC.close();

    }
}
