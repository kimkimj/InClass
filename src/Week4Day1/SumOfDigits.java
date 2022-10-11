package Week4Day1;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(solution(15));
    }

    public static int solution(int N){
        int sum = 0;
        while (N > 0) {
            int digit = N % 10;
            sum += digit;
            N /= 10;
        }
        return sum;
    }
}
