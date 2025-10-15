import java.util.Scanner;

public class Homework4 {
    static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        if (m < n) {
            return gcd(m, n % m);
        }else {
            return gcd(n, m % n);
        }
    }

    static int gcdLoop(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int gcd = gcd(m, n);
        System.out.printf("두 수의 최대공약수는 %d입니다.\n", gcd);

        int gcd2 = gcdLoop(m, n);
        System.out.println("**반복문 결과: " + gcd2);
    }
}
