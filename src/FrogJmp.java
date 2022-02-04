public class FrogJmp {
    public static int solution(int X, int Y, int D){
        int distance = Y-X;
        int out = distance/D;
        if(distance % D != 0){
            out ++;
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(solution(10,85, 30));
    }
}
