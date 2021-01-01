import DataStructures.*;
import Algorithms.*;

public class Main {
    public static void main(String[] args) {
        int[] unsorted = {1,3,2,5,7,4,3,2,5};
        System.out.println("Unsorted:");
        java.util.Arrays.stream(unsorted).forEach(item -> System.out.print(item + " "));
        SelectionSort.Sort(unsorted);
        System.out.println("");
        System.out.println("Sorted:");
        java.util.Arrays.stream(unsorted).forEach(item -> System.out.print(item + " "));
    }

  }
