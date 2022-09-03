package by.by;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,1,1,0,0,1,1,0};
        System.out.println(String.format("Максимальная длина последовательности 1: %d", GetOneMaxLength(arr)));
    }


    public static int GetOneMaxLength(int[] arr)
    {
        int count = 0;
        int maxCount = 0;
        for (int item: arr) {
            if (item == 1) {
                count++;
                if (count > maxCount)
                    maxCount = count;
            }
            else
                count = 0;
        }
        return maxCount;
    }
}
