package solutions;

import java.util.HashMap;

public class p7 {
    public static void main(String[] args) {
        HashMap<String,Integer> people=new HashMap<>();
        people.put("Shubham",1);
        people.put("Vidhi",2);
        people.put("Max",3);
        for(int i:people.values()){
            System.out.println(i);
        }
    }
}
