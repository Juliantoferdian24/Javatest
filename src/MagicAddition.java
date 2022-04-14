import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MagicAddition {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
//        double doubleNumber = 24.04;
//        String doubleAsString = String.valueOf(doubleNumber);
//        int indexOfDecimal = doubleAsString.indexOf(".");
//        System.out.println("Double Number: " + doubleNumber);
//        System.out.println("Integer Part: " + doubleAsString.substring(0, indexOfDecimal));
//        System.out.println("Decimal Part: " + doubleAsString.substring(indexOfDecimal+1));

        double doubleNumber = 24.04;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(doubleNumber));
        int intValue = bigDecimal.intValue();
        System.out.println("Double Number: " + bigDecimal.toPlainString());
        System.out.println("Integer Part: " + intValue);
        System.out.println("Decimal Part: " + bigDecimal.subtract(
                new BigDecimal(intValue)).toPlainString());

    }
}
