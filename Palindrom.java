import java.util.Scanner;
public  class Palindrom {
    public static void main (String[] args){
        System.out.print("please enter a number");
        Scanner s = new Scanner (System.in);
        int input = s.nextInt();
        if (Palindrom(input)==true){
            System.out.println("Palindrome number");

        }
        else{
            System.out.println("NonPalindrome number");
        }
    }

    public static  boolean Palindrom (int input){
        int palb = 0;//palb is palindrome of b
        int slack = input;//slack variable
        while(input>0) {//generating palindrome of b
            int remaining = input % 10;
            palb = palb * 10 + remaining;
            input = input / 10;
        }
        if (palb==slack){

            boolean output = true;
            return output;


        }
        else {
            boolean output = false;
            return output;


        }

    }




}