import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;


public class PreprocessingDates {
    public static List<String> reformatDate(List<String> dates) {
        // Write your code here
        List<String> outputDate = new ArrayList<>();

        try {
            for (String tempStr : dates) {
                tempStr = tempStr.replace("st", "").replace("nd", "").replace("rd", "").replace("th", "");
                Date tempDate = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH).parse(tempStr);
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                Calendar tempC = Calendar.getInstance();
                tempC.setTime(tempDate);
                int year = tempC.get(Calendar.YEAR);
                if (year >= 1900 && year <= 2100) {
                    String dateStr = df.format(tempDate).toString();
                    outputDate.add(dateStr);
                } else {
                    System.out.println("Year out of range");
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return outputDate;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int datesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> dates = IntStream.range(0, datesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

        List<String> result = PreprocessingDates.reformatDate(dates);

        System.out.println(result);
//        bufferedWriter.write(
//                result.stream()
//                        .collect(joining("\n"))
//                        + "\n"
//        );

        bufferedReader.close();
//        bufferedWriter.close();
    }
}