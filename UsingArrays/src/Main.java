import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
    int[] firstArray = getRandomArray(10);
    System.out.println(Arrays.toString(firstArray));
    Arrays.sort(firstArray);
    System.out.println(Arrays.toString(firstArray));
    int[] secondArray = new int[10];
    System.out.println(Arrays.toString(secondArray));
    Arrays.fill(secondArray, 5);
    System.out.println(Arrays.toString(secondArray));
    }

    public static int[] getRandomArray(int len)
    {
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = new Random().nextInt(100);
        }
        return arr;
    }
}