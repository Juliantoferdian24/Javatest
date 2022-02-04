public class SumsUpToZero {
    public static int[] solution(int N) {

        int[] output = new int[N];
        int indeks = 0;
        int tengah = N / 2;
        while (indeks < N / 2) {
            output[indeks++] = tengah * -1;
            tengah--;
        }
        if (N % 2 != 0) {
            output[indeks++] = 0;
        }
        tengah = N / 2;
        while (indeks < N) {
            output[indeks++] = tengah;
            tengah--;
        }
        return output;
    }

    // Driver code
    public static void main(String[] args) {
        int N = 4;
        System.out.println(solution(N));
    }
}
