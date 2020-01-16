package problemandsolutions;
import java.util.Scanner;
public class ArraySort {
    // By using the bubble sort algorithm, write a Java program to sort an integer array of 10 elements in ascending.

    public static void main(String []args) {
        int num, x, j, temp;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of integers to sort:");
        num = input.nextInt();

        int array[] = new int[num];

        System.out.println("Enter " + num + " integers: ");

        for (x = 0; x < num; x++)
            array[x] = input.nextInt();

        for (x = 0; x < ( num - 1 ); x++) {
            for (j = 0; j < num - x - 1; j++) {
                if (array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted list of integers:");

        for (x = 0; x < num; x++)
            System.out.println(array[x]);
    }
}
