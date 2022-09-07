package by.Seminar2;

public class Task1 {
    public static void main(String[] args) {
        int n = 6;
        char c1 = 'x';
        char c2 = 'y';

        System.out.println(GenerateString(n, c1, c2));
    }

    public static String GenerateString(int len, char char1, char char2) {
        return String.format("%c%c", char1, char2).repeat(len / 2);
    }
}
