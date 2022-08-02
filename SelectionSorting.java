import java.util.Arrays;

public class SelectionSort {
    private static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }
    public static int[] selectionSort(int[] data) {        
        for (int a = 0; a < data.length - 1;a++) {
            int entry = 0;
            int counter = 0;
            int minimum = a;
            for (int b = a+1; b < data.length;b++) {
                if (data[b] < data[minimum]) {  
                    minimum=b;
                    counter=1;  
                }
            }
            if (counter == 0 ) {
                entry=1;
            }
        if (entry == 1) {
        }
        else {
            int temp = data[a];
            data[a] = data[minimum];
            data[minimum] = temp;
            printArray(data);
        }
        }
        return data;
    }
    public static void main(String[] args) {
        int[] testData = {2, 34, 73, 93};
        System.out.println("Sorting.");
        testData = selectionSort(testData);
        System.out.println("After sorting the array is: ");
        printArray(testData);
    }
}
