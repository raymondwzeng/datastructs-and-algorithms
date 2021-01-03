package Algorithms;

//Selection sort. AKA Baby's first sorting algorithm.
public class SelectionSort {
    //Helper function. This does some basic swaps in place, so there is no additional complexity added for time or space.
    private static void swap(int[] arr, int firstNum, int secondNum)
    {
        int temp = arr[firstNum];
        arr[firstNum] = arr[secondNum];
        arr[secondNum] = temp;
        return;
    }

    public static void Sort(int[] arr) //Sort in place
    {
        for(int i = 0; i < arr.length; i++) //Going through each item in the array
        {
            int lowestIndex = i; //Create a temporary "lowestIndex", set to current index. This makes it so a lowest current number will NOT move. (TROUBLE SPOT: What is it set to?)
            for(int j = i; j < arr.length; j++) //Go through remaining items in array
            {
                if(arr[j] < arr[lowestIndex]) //If lower than current low...
                {
                    lowestIndex = j; //Swap index
                }
            }
            swap(arr, i, lowestIndex); //After, going through and finding the lowest, swap the current value with the lowest value.
            //Repeat for remaining characters.
        }
        return;
    }

    //Time complexity: O(n^2), where n is the size of the array. This is because we need to go through the array for each item, essentially iterating a 2d matrix.
    //Space complexity: O(1), we are sorting in place.

    /*Testing Code
    int[] unsorted = {1,3,2,5,7,4,3,2,5};
        System.out.println("Unsorted:");
        java.util.Arrays.stream(unsorted).forEach(item -> System.out.print(item + " "));
        SelectionSort.Sort(unsorted);
        System.out.println("");
        System.out.println("Sorted:");
        java.util.Arrays.stream(unsorted).forEach(item -> System.out.print(item + " "));
    */
}
