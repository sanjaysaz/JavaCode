
import java.util.*;

public class testting {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(5, "same");
        map.put(4, "cat");
        map.put(100, "fu");
        map.put(0, "oo");
        map.put(6, "ui");
        map.put(9, "ba");
        map.put(3, "gsds");
        // map.put(3, "ka");

        System.out.println(map);

        Set set = map.keySet();

        System.out.println(set);

        Collection col = map.values();
        System.out.println(col);

        Set sm = map.entrySet();

        System.out.println(sm);

        Iterator it = sm.iterator();
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();

            if (me.getKey().equals(3)) {
                me.setValue("abc");

            }
            System.out.println(me);
        }
        Map<Integer, String> mp = new TreeMap<>(map);

        Set st = mp.entrySet();
        Iterator itt = st.iterator();
        while (itt.hasNext()) {
            Map.Entry mee = (Map.Entry) itt.next();
            System.out.println(mee.getKey() + " : " + mee.getValue());

        }

    }

}
