import java.util.Arrays;

public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(generateRandomArray()));

        int[] arrayNew = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arrayNew.length; i++) {
            sum = sum + arrayNew[i];
        }
            System.out.println("Сумма равна " + sum + " рублей");
        // задача 2
        int[] spending = generateRandomArray();
        int min = spending[0];
        int max = spending[0];
        for (int j : spending){
            if(j > max)
            max = j;
            if(j < min)
            min = j;
        }
        System.out.println("Максимальная сумма трат за день " + max + " рублей");
        System.out.println("Минимальная сумма трат за день " + min + " рублей");

        // задание 3
        int[] mean = generateRandomArray();
        float sum2 = 0f;
        for (int a = 0; a < mean.length; a++) {
            sum2 = sum2 + mean[a];
            //float month = 30f;
        }
        System.out.println("Среднее значение трат за месяц равно " + (sum2/30) + " рублей");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] trueName = new char[reverseFullName.length];
        for (char i = 0; i < reverseFullName.length; i++) {
            trueName[reverseFullName.length - 1 - i] = reverseFullName[i];
        }
        reverseFullName = trueName;
        System.out.println(trueName);
    }
}
