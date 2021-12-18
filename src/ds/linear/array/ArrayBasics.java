package ds.linear.array;

public class ArrayBasics {

    /* what is an array
     https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
     array is a container that holds values of single type ( int, string, char etc)
     and has fixed length which is is defined once the array is created.
     */
    public static void main(String[] args) {
        // declaration, instantiation and initialization
        int[] numbers; //declare
        numbers = new int[5]; // 4 bytes (1 int)  * 5 (size of array) = 20 bytes of memory in Heap space allocated
        numbers[0] = 1; // initialize first number

        // arrays of different data type
        byte[] anArrayOfBytes;
        short[] anArrayOfShorts;
        long[] anArrayOfLongs;
        float[] anArrayOfFloats;
        double[] anArrayOfDoubles;
        boolean[] anArrayOfBooleans;
        char[] anArrayOfChars;
        String[] anArrayOfStrings;
        Student[] students; // array of Objects of type student

        //CRUD operations with time complexity
        numbers[1] = 2; // insert
        int[] numbers1 = {3, 5, 7, 10, 29}; // initialize with
    }

}

class Student {

}
