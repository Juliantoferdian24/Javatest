public class CountFactors {
    public static int solution(int N) {
//        int countFactors = 0;
//        for (int i = 1; i <= N; i++) {
//            if (N % i == 0) {
//                countFactors++;
//            }
//        }
//        return countFactors;
        int candidate = 1;
        int result = 0;
        while (candidate * candidate < N) {
            if (N % candidate == 0) {
                result += 2;
            }
            candidate++;
        }
        if (candidate * candidate == N) {
            result += 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(200000000));
    }
}
