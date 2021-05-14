import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class practicehere {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("name");
        al.add("some");
        al.add("era");
        al.add("ame");

        Collections.sort(al, Collections.reverseOrder());

        // String st = al.toString();

        Object[] objects = al.toArray();

        // System.out.println(st);

        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

    }
}
