package by.Seminar2;

public class Task3 {
    public static void main(String[] args) {
        String str = "aои5иоa";
        if(IsPalindrome(str))
            System.out.println(String.format("Сторка %s является палиндромом", str));
        else
            System.out.println(String.format("Сторка %s не является палиндромом", str));
    }

    public static boolean IsPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++)
            if (str.charAt(i) != str.charAt(str.length()-1-i))
                return false;
        return true;
    }
}
