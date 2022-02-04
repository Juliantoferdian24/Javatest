public class BinaryGap {

    public static int solution(int N) {
        String biner = Integer.toBinaryString(N);
        int b = 0;
        int maxb = 0;
        for (int i = 0; i < biner.length(); i++) {
            int a = biner.charAt(i);
            if (a == '0') {
                b = b + 1;
            } else if (a == '1') {
                maxb = Math.max(b, maxb);
                b = 0;
            }
        }
        return maxb;
    }

    public static void main(String[] args) {
        System.out.println(solution(529));
    }

}