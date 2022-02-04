public class Kscript1 {
    public static int foo(int[] x, int a, int b, int i, int j) {
        int k = j;
        int ct = 0;
        while (k > i - 1) {
            if (x[k] <= b && (!(x[k] <= a))) {
                ct = ct + 1;
            }
            k = k - 1;
        }
        return ct;
    }

    public static void main(String[] args) {
        int[] x = new int[]{11, 10, 10, 5, 10, 15, 20, 10, 7, 11};
        System.out.print(foo(x, 8, 18, 3, 6));
        System.out.print(foo(x, 10, 20, 0, 9));
        System.out.print(foo(x, 8, 18, 6, 3));
        System.out.print(foo(x, 20, 10, 0, 9));
        System.out.print(foo(x, 6, 7, 8, 8));

    }
}
