package Algorithms;

public class BinarySearch {
    public static int Search(int[] arr, int value)
    {
        int left = 0; //First index.
        int right = arr.length - 1; //Last index.
        while(left <= right) //While we don't have overlap, because if they do then we've gone past the search and we haven't found it. (TROUBLE SPOT: Are we sure it's <= and not <?)
        {
            int midpoint = (left + right)/2; //Get midpoint (left midpoint if even)
            if (arr[midpoint] < value) //Midpoint value is less than what we want
            {
                System.out.println(arr[midpoint] + " is less than value!");
                left = midpoint + 1; //Move left side over, +1 because we don't need to search current. (TROUBLE SPOT: Are we changing left or right?)
            } else if (arr[midpoint] > value) //Midpoint value is greater than what we want.
            {
                System.out.println(arr[midpoint] + " is greater than value!");
                right = midpoint - 1; //Move right side over, -1 because we don't need to search current. (TROUBLE SPOT: Are we changing left or right?)
            } else {
                return arr[midpoint];
            }
        }
        return -1; //If nothing is found, return -1.
    }
}

//Time complexity: O(log(n)), where n -> size of array. This is because we cut the search by half every time.
//Space complexity: O(1), because we aren't using any additional space. We could consider a recursive solution, which would take more space but could be implemented easier.

/*
Test Code:
      System.out.println("Hello world!");
      int[] testingInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      System.out.println(BinarySearch.Search(testingInt, 10));
*/