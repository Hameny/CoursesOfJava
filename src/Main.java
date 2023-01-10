public class Main {
    public static void main(String[] args) {
        int[] arrayInt = {-1,-3,-12,-14,-54,-23,-12,-45};
        int length = arrayInt.length;
        System.out.println("Длинна массива " + length);
        int sumOfAllElements = 0;
        for (int i = 0; i <= length-1; i++) {
            sumOfAllElements = arrayInt[i] + sumOfAllElements;
        }
        System.out.println((double)sumOfAllElements / length);
    }
}