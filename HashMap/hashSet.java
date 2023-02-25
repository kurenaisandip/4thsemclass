package HashMap;

import java.util.HashSet;

public class hashSet {

    static void main(){
        HashSet<String> hs = new HashSet<String>();
        hs.add("a");
        hs.add("b");
        hs.add("c");
        hs.add("d");

        System.out.println(hs);

        hashSet clone;
        clone = (hashSet) hs.clone();
        System.out.println(clone);
    }

    public static void main(String[] args) {
        main();
    }
}
