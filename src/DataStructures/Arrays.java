package DataStructures;
public class Arrays{
    public static void intro()
    {
        //Arrays are the most FOUNDATIONAL building blocks of Data Structures. They are FIXED (can't be changed) in length, and can hold any data type.
        int[] myIntegerArray = new int[10]; //The number inside defines the size of the array.
        
        myIntegerArray[0] = 3; //Arrays start at 0. You can assign values here...

        int[] aDifferentArray = {1, 2, 3, 4, 5, 6}; //Or inside curly braces!

        System.out.println(myIntegerArray[0]); //Array values can be accessed with square brackets, followed by the index. Note going over/under will error.

        int[][] myTwoDimensionalArray = new int[5][5]; //You can create 2D arrays using another set of square brackets. Height and width can be different!

    }

    /**
     * Copying Arrays (integers)
     */
    public static int[] copyArray(int[] source, int[] destination) //This method takes an integer array, and copies it over to another array of the same time.
    {
        for(int i = 0; i < source.length; i++) //Iterating through all elements in source array. NOTE: < source.length, not equal to, and length is a field, not method.
        {
            if(i < destination.length) //Check to make sure that destination[i] is a legal place to write to.
            {
                destination[i] = source[i];
            }
        }
        return destination;
    }
    //Complexity: O(s) -> s is the length of the source array. If destination is shorter, it'll terminate earlier. If destination is longer, then remaining will be default.
    //Note: There is a default method - System.arraycopy - with a bit of a longer signature. Alternatively, use Arrays.copyOfRange(source, start, end) for easier time.

    /*public static void main(String[] args) {
        int[] sampleArray = {1, 3, 5, 7, 9};
        int[] myNewArray = new int[sampleArray.length];
        myNewArray = copyArray(sampleArray, myNewArray);
        
        java.util.Arrays.stream(sampleArray).forEach(System.out::println); //Functional programming!
        intro();
        //Had to do a hacky fix because filename was "Arrays"
    }*/
}