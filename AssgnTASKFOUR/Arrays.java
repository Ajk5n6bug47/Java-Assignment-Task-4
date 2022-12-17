
package arrays;


public class Arrays   //java public class
{
    public static int findIndex(int[] my_array, int k)    //static method of variable type integer
    {
        if (my_array == null) return -1;            //assigning input to a variable type 
        int len = my_array.length;
        int i = 0;
        while (i < len)
        {
            if (my_array[i] == k) return i;
            else i = i + 1;
        }
        return -1;
    }
    public static void main(String[]args)        // main method in the block of code
    {
        int[] my_array = {20, 34, 67, 54, 37, 79, 13, 42, 25, 85, 44, 61, 11, 19, 63};          // function to locate input in the array
        System.out.println("Index position of 37 is:" + findIndex(my_array, 37));         //display code output of array index position
        System.out.println("Index position of 85 is:" + findIndex(my_array, 85));          //display code output of array index position
              
    }
}
