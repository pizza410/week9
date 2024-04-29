package solutions;

import java.util.HashSet;

public class p6 {
    public static void main(String[] args) {
        HashSet<Integer> numbers=new HashSet<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        for(int i:numbers){
            if(i>1 && i<10){
                System.out.println(i+" is between 1 and 10.");
            }
            else{
                System.out.println(i+" is out of bound.");
            }
        }
    }
}
