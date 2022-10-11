package Week4Day1;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(solution(15));
    }

    public static int solution(int n){
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
}
