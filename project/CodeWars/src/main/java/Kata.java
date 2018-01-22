public class Kata {
    public static int sum(int[] numbers) {
        int sum = 0;
        int sum2 = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum2 = sum - max - min;
        }
        return sum2;
    }
}