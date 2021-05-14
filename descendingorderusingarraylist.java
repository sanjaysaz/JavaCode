import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class descendingorderusingarraylist {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(90);
        al.add(10);
        al.add(100);
        al.add(2);
        al.add(55);

        Collections.sort(al, Collections.reverseOrder());

        // System.out.println(al);

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));

        }

    }
}
