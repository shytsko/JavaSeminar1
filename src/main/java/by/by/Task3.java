package by.by;

public class Task3 {
    public static void main(String[] args) {
        String str = "fdgd dsfsd yuj fdgsd gfbbf dsset ghnjhg";
        System.out.println(String.format("Исходная строка: %s", str));
        System.out.println(String.format("Строка с реверсом слов: %s", ReversWords(str)));
    }

    public static final String ReversWords(String source) {
        String[] words = source.split(" ");
        String[] reversWords = new String[words.length];
        for (int i = 0; i < words.length ; i++) {
            reversWords[words.length-1-i] = words[i];
        }
        return String.join(" ", reversWords);
    }
}
