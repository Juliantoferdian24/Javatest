public class Crop {
    public static String solution(String message, int K) {
        String output = "";
        if (message.length() <= K) {
            output = message;
        } else {
            String test = message.substring(0, K);
            String[] input1 = message.split(" ");
            String[] input2 = test.split(" ");
            for (int i = 0; i < input2.length; i++) {
                if (input1[i].equals(input2[i]) && i == input2.length - 1) {
                    output = output + input1[i];
                } else if (input1[i].equals(input2[i]) && i < input2.length - 1) {
                    output = output + input1[i] + " ";
                }
            }
            output.substring(0, output.length() - 2);
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(solution("Codility We test coders", 14));
        System.out.println(solution("The quick brown fox jumps over the lazy dog", 39));
        System.out.println(solution("Why not", 100));
        System.out.println(solution("To crop or not to crop", 21));
    }
}
