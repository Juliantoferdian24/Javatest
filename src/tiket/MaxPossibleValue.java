package tiket;

public class MaxPossibleValue {

    public static void main(String[] args) {
        System.out.println(firstfunction(15958));
        System.out.println(firstfunction(-5859));
    }

    public static int firstfunction(int N) {
        int maxValue = Integer.MIN_VALUE;
        String stringValue = Integer.toString(N);
        for (int i = 0; i < stringValue.length(); i++) {
            if(stringValue.charAt(i)=='5') {
                String stringToCheck = stringValue.substring(0, i) + stringValue.substring(i + 1);
                int intToCheck = Integer.parseInt(stringToCheck);
                maxValue = Math.max(intToCheck, maxValue);
            }
        }
        return maxValue;
    }
}
