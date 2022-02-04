import java.util.*;  // Import the Scanner class

public class q5 {
    public static void findAndContest(String[][] maps, boolean[][] visited, Set<String> tempFraction, int row, int col, int x, int y) { //Map< String,Integer> fractions
        if (x < 0 || x >= row) {
            return;
        }
        if (y < 0 || y >= col) {
            return;
        }
        if (visited[x][y]) {
            return;
        }
        visited[x][y] = true;
        if (maps[x][y].equals("#")) {
            return;
        }
        if (!maps[x][y].equals(".")) {
            tempFraction.add(maps[x][y]);
        }

        findAndContest(maps, visited, tempFraction, row, col, x, y + 1);
        findAndContest(maps, visited, tempFraction, row, col, x, y - 1);
        findAndContest(maps, visited, tempFraction, row, col, x + 1, y);
        findAndContest(maps, visited, tempFraction, row, col, x - 1, y);
        return;
    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int testCase = input.nextInt();

        for (int i = 1; i <= testCase; i++) {
            int row = input.nextInt();
            int col = input.nextInt();

            String[][] maps = new String[row][col];
            boolean[][] visited = new boolean[row][col];
            Set<String> tempFractions = new HashSet<String>();
            Map<String, Integer> fractions = new TreeMap<String, Integer>();

            for (int j = 0; j < row; j++) {
                String str = input.next();
                char[] ch = str.toCharArray();
                for (int k = 0; k < ch.length; k++) {
                    maps[j][k] = String.valueOf(ch[k]);
                    visited[j][k] = false;
                }
            }
            int Conquer = 0;
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    tempFractions.clear();
                    findAndContest(maps, visited, tempFractions, row, col, j, k);
                    Iterator<String> tempITR = tempFractions.iterator();
                    if (tempFractions.size() > 1) {
                        Conquer++;
                    } else {
                        while (tempITR.hasNext()) {
                            String frac = tempITR.next();
                            if (fractions.get(frac) != (null)) {
                                fractions.put(frac, fractions.get(frac) + 1);
                            } else if (fractions.get(frac) == (null)) {
                                fractions.put(frac, 1);
                            }
                        }
                    }
                }
            }
            System.out.println("Case " + i + ":");
            for (Map.Entry<String, Integer> entry : fractions.entrySet()) {
                String key = entry.getKey();
                Integer val = entry.getValue();

                System.out.println(key + " " + val);
            }
            System.out.println("contested " + Conquer);
        }
    }
}