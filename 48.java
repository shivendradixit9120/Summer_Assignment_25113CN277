public class Main {
    public static boolean isPerfect(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        int n = 28;

        if (isPerfect(n))
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");
    }
}