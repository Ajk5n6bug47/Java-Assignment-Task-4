
package primenumbers;


public class PrimeNumbers {       // java public class 

   
    public static void main(String[] args) 
    {
       for(int i = 1; i <= 500; i++)       // assigning input to a variable 
       {
           if (isPrime(i))
           {
               System.out.print(i + " ");     // prints code block output on the scereen 
           }
       }
    }
    public static boolean isPrime(int number)     // static method boolean to check if the code block is true or false 
    {
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                return false;    // function to check if the code output is false 
            }
        }
        return true;       // function to check if the code output is true
    }
}
