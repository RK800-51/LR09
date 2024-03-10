package tasks;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        int N = 100000;
        ArrayList<Integer> digits = new ArrayList<>();
        for(int i = 1; i <= N; i++) {
            digits.add(i);
        }
        // System.out.println(digits);
        long arrStart = System.currentTimeMillis();
        while (digits.size() > 1) {
            digits.remove(1);
        }
        long arrStop = System.currentTimeMillis();
        long arrTiming = arrStop - arrStart;
        // System.out.println(digits);

        LinkedList<Integer> ldigits = new LinkedList<Integer>();
        for (int i = 1; i <= N; i++) {
            ldigits.add(i);
        }
        // System.out.println(ldigits);
        long linkedStart = System.currentTimeMillis();
        while (ldigits.size() > 1) {
            ldigits.remove(1);
        }
        long linkedStop = System.currentTimeMillis();

        long linkedTiming = linkedStop - linkedStart;
        // System.out.println(ldigits);

        System.out.println("ArrayList: " + arrTiming);
        System.out.println("LinkedList: " + linkedTiming);

    }

}
// ArrayList значительно медленнее LinkedList при удалении элементов потому что каждый раз когда мы удаляем элемент
// из ArrayList, происходит внутренний сдвиг массива, т.е. сдвиг битов памяти. LinkedList же просто изменяет указатель
// ссылки второго элемента на новый