package Algorithms;

public class MergeSort {
    private static void Merge(int[] arr, int left, int midpoint, int right)
    {
      int[] leftArray = new int[midpoint - left + 1]; 
      int[] rightArray = new int[right - midpoint];

      for(int i = 0; i < midpoint - left + 1; i++)
      {
        leftArray[i] = arr[left + i]; //Set leftArray = array + offset (very smart)
      }
      for(int i =0; i < right - midpoint; i++)
      {
          rightArray[i] = arr[midpoint + 1 + i]; //We don't want to copy midpoint twice
      }

      int leftArrPointer = 0, rightArrPointer = 0;
      int arrPointer = left;
      while(leftArrPointer < leftArray.length && rightArrPointer < rightArray.length)
      {
         if(leftArray[leftArrPointer] > rightArray[rightArrPointer])
         {
            arr[arrPointer] = rightArray[rightArrPointer]; //Since left > right, we will put right first.
            rightArrPointer++;
         } else {
             arr[arrPointer] = leftArray[leftArrPointer]; //Since left <= right, we will put left.
             leftArrPointer++;
         }
         arrPointer++;
      }

      //Conjecture: There will NEVER be an instance where the left pointer has LESS values than the right pointer. Therefore we only need to take care of right counter.
      //This was false. :(
      while(rightArrPointer < rightArray.length)
      {
          arr[arrPointer] = rightArray[rightArrPointer];
          arrPointer++;
          rightArrPointer++;
      }

      while(leftArrPointer < leftArray.length)
      {
        arr[arrPointer] = leftArray[leftArrPointer];
        arrPointer++;
        leftArrPointer++;
      }
      return;
    }

    public static void Sort(int[] arr, int left, int right)
    {
        if(left < right) //While we don't have overlap.
        {
            int midpoint = (right + left)/2; //Find the "middle" to split
            Sort(arr, 0, midpoint); //Split the left half
            Sort(arr, midpoint + 1, right);  //Split the right half
            Merge(arr, left, midpoint, right);
        }
        
    }
}
