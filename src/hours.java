public class hours {

    public static String solution(int T) {
        int jam = T / 3600;
        int menit = T / 60 - jam * 60; //since both are ints, you get an int
        int detik = T % 60;
        return jam+"h"+menit+"m"+detik+"s";

    }
    public static void main(String[] args) {
        System.out.println(solution(7500));
    }
}
