import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {
        ReplaceVowels replaceVowels = new ReplaceVowels();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the String : ");
        String input = scanner.nextLine().toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (replaceVowels.isVowels(input.charAt(i))) {
                result.append(replaceVowels.getSum(replaceVowels.sumPrimeNumber(i * 100)));
            } else {
                result.append(input.charAt(i));
            }
        }
        System.out.println(result);
    }

    private boolean isVowels(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    private int getSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        if (sum >= 10) {
            sum = getSum(sum);
        }
        return sum;
    }

    private int sumPrimeNumber(int n) {
        int i = 0;
        int num = 0;
        int sum = 0;
        for (i = 1; i <= n; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
