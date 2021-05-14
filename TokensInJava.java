import java.util.Scanner;

public class tokenshk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();

        String[] sa = s.split("[A-Za-z !,?._'@]+");
        System.out.println(sa.length);
        for (int i = 0; i < sa.length; i++) {

            System.out.println(sa[i]);

        }

    }
}
