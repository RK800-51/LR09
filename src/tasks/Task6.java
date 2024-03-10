package tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task6 {
    public static void main(String[] args) {
        HashMap<Integer, String> alphabet = new HashMap<>();

        alphabet.put(0, "z");
        alphabet.put(1, "aaaaaaaaaaa");
        alphabet.put(2, "bb");
        alphabet.put(3, "cccc");
        alphabet.put(4, "ddddddddddd");
        alphabet.put(5, "e");
        alphabet.put(6, "f");
        alphabet.put(7, "ggggg");
        alphabet.put(8, "h");
        alphabet.put(9, "kkkkkkkkkkkkkkkkkkkkkkk");
        alphabet.put(10, "lll");

        Set<Integer> keys = alphabet.keySet();
        ArrayList<String> values = new ArrayList<>(alphabet.values());

        for (Integer key: keys) {
            if (key > 5) {
                System.out.println(alphabet.get(key));
            }
            else if (key == 0) {
                String result = String.join(", ", values);
                System.out.println(result);
            }
        }
        int dig = 1;

        for (Map.Entry <Integer, String> entry: alphabet.entrySet()) {
            if (entry.getValue().length() > 5) {
                dig = dig * entry.getKey();
            }
        }
        System.out.println(dig);



    }
}
