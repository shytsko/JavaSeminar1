package by.Seminar2;

public class Task2 {
    public static void main(String[] args) {
        String testString = "aaaaaabbbcdddddddde";
        System.out.println(RLEEncoder(testString));
    }

    public static String RLEEncoder(String sourceSrting) {
        StringBuilder result = new StringBuilder();
        char[] symbols = sourceSrting.toCharArray();
        int count = 0;
        char currentSymbol = symbols[0];
        for (char c: symbols ) {
            if(c==currentSymbol)
                count++;
            else {
                result.append(String.format("%c%d", currentSymbol, count));
                currentSymbol = c;
                count = 1;
            }
        }
        result.append(String.format("%c%d", currentSymbol, count));
        return result.toString();
    }
}
