import java.util.Arrays;
public class BubbleSort {
    private static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }
    public static int[] bubbleSort(int[] data) {
        boolean status = true;
        while (status) {
            status = false;
            for (int a = 0; a < data.length-1;a++) {
                if (data[a] > data[a+1]) {
                    int temp = data[a];
                    data[a] = data[a+1];
                    data[a+1] = temp;
                    status = true;
                    printArray(data);
                }          
            }
        }
        return data;
    }
    public static void main(String[] args) {
        int[] testData = {45, 93, 33, 55};
        System.out.println("Sorting.");
        testData = bubbleSort(testData);
        System.out.println("After sorting the array is: ");
        printArray(testData);
    }
}
