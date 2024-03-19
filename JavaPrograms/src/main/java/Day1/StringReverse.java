package Day1;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args){
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter your String input");

        String userInput= SC.nextLine();
        String ReverseOutput="";
        SC.close();

        for(int i=userInput.length()-1;i>=0;i--){
            ReverseOutput=ReverseOutput+userInput.charAt(i);
        }
        System.out.println(ReverseOutput);
    }

}

