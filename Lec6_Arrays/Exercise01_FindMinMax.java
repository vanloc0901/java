public class Exercise01_FindMinMax {
    public static void main(String[] args) {
        int[] numbers = {12, 49, -2, 26, 5};
        int min = numbers[0], max = numbers[0];
        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }
}
