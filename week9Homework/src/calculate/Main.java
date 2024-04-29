package calculate;

import java.util.Scanner;

public class Main {
     static boolean v = true;
    public static void main(String[] args) {
        while (v) {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter first number: ");
            int a = input.nextInt();
            System.out.print("Please enter second number: ");
            int b = input.nextInt();
            System.out.print("Please enter one of symbol +,-,*, /: ");
            char c = input.next().charAt(0);
            input.nextLine();
            Calculator dc = new Calculator();
            dc.calculateResult(a, b, c);
            System.out.println("Would you like to do more calculations? Please enter \"Y\" or \"N\" ");
            String s = input.nextLine().toUpperCase();
            if (s.equals("Y")) {
                v =true;
            }
            else if(s.equals("N")){
                v= false;
            }
        }
    }
}
