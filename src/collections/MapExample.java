package collections;

import java.util.HashMap;
import java.util.LinkedList;

public class MapExample {

    public static void main(String args[]){

        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(10, "Anitha");
        map1.put(2, "Matt");
        map1.put(4, "Kevin");
        map1.put(9, "Liona");
        map1.put(13, "Breena");
        map1.put(12, "Fred");

        System.out.println(map1);
        map1.remove(13);
        System.out.println(map1);

        for(Integer key: map1.keySet()){
            System.out.println("Key :" + key);

            System.out.println("Value :" + map1.get(key));

        }



    }
}
