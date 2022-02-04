public class CountDiv {
    public static int solution(int A, int B, int K) {
        int countDiv = (B / K) - (A / K);
        if (A % K == 0) {
            countDiv += 1;
        }
        return countDiv;
    }

    public static void main(String[] args) {
        System.out.println(solution(6, 11, 2));
    }
}
