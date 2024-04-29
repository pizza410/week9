package solutions;

import java.util.ArrayList;

public class p3 {
    public static void main(String[] args) {
        ArrayList<String> colours=new ArrayList<>();
        colours.add("Black");
        colours.add("Pink");
        colours.add("White");
        colours.add("Orange");
        System.out.print("[");
        for(String s:colours){
            System.out.print(s+" ");
        }
        System.out.print("]");
    }
}
