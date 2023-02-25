package HashMap;

import java.util.HashMap;

public class HashEx {


    public void hashEx(){

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put( 1 , "egg");
        hashMap.put( 2, "bread");

//        hashMap.remove(2, "bread");

        System.out.println(hashMap);
    }



    public static void main(String[] args) {
        HashEx hs = new HashEx();
        hs.hashEx();
    }
}
