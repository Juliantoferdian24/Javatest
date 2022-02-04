public class Kscript3 {
    public static String g(String str) {
        int i = 0;
        StringBuilder new_str = new StringBuilder();
        while (i < str.length() - 1) {
            new_str.append(str.charAt(i + 1));
            i = i + 1;
        }
        return new_str.toString();
    }

    public static String f(String str) {
        if (str.length() == 0) {
            return "";
        } else if (str.length() == 1) {
            return str;
        } else {
            return f(g(str)) + str.charAt(0);
        }
    }

    public static String h(int n, String str) {
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            str = f(str);
        }
        return str;
    }

    public static int pow(int x, long y) {
        if(y==0){
            return 1;
        } else{
            return x*pow(x,y-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(h(1, "fruits"));
        System.out.println(h(2, "fruits"));
        System.out.println(h(5, "fruits"));
    }
}
