package Algorithms;

import java.util.Arrays;

public class Quicksort {
    public static void Sort(int[] arr)
    {
        Sort(arr, 0, arr.length - 1);
    }

    private static void Swap(int[] arr, int a, int b)
    {
        System.out.println("Swapping " + a + " and " + b);
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return;
    }

    private static int Partition(int[] arr, int left, int right)
    {
       int pivot = left; //Set our pivot to the left-most index in our "sub"array.
       while(left < right) //While left < right, we don't want overlap.
       {
            while(arr[left] <= arr[pivot]) //Keep moving our left index until we find an out of place item (> pivot)
            {
                if(left == arr.length-1) break; //Safeguard against overflow
                left++;
            }
            while(arr[right] > arr[pivot]) //Keep moving our right index until we find an out of place item (<= pivot)
            {
                if(right == 0) break; //Safeguard against underflow
                right--;
            }
            if(left < right) //Make sure we didn't cross during movement
            {
                Swap(arr, left, right); //Swap the left and right items.
            }
       }
       //We have moved left beyond right.
       Swap(arr, right, pivot);
       return right; //Since we swapped pivot with right, right is now our sorted index.
    }

    public static void Sort(int[] arr, int left, int right)
    {
        if(left >= right || left > arr.length - 1 || right > arr.length - 1) return;
        int sortedIndex = Partition(arr, left, right); //Find the index of our sorted number after we move it in place.
        Sort(arr, left, sortedIndex-1); //Sort the left half, if applicable.
        Sort(arr, sortedIndex+1, right); //Sort the right half, if applicable.
    }
}
