public class Main {
    public static void main(String[] args) {
            task1();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        int summa = 0;
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int e : arr) {
            summa += e;
        }
        System.out.println(summa);

    }
}
