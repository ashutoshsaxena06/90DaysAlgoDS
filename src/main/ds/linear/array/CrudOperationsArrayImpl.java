package main.ds.linear.array;

import main.ds.CrudOperations;
import org.junit.jupiter.api.Test;

import java.util.Collection;

public class CrudOperationsArrayImpl implements CrudOperations {
    int[] numberArray = new int[]{2, 3, 8, 10, 16, 18};

    public static void printArrays(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    @Override
    public <T> boolean insertAtStart(T data) {
        if (data == null || numberArray.length < 1) {
            return false;
        }

        for (int i = numberArray.length - 2; i >= 0; i--) {
            numberArray[i + 1] = numberArray[i];
        }
//        numberArray[0] = (int) data;
        printArrays(numberArray);
        return true;
    }

    @Override
    public <T> boolean insertAtEnd(T data) {
        if (data == null || numberArray.length < 1) {
            return false;
        }
//        numberArray[numberArray.length - 1] = (int) data;
        return true;
    }

    @Override
    public <T> T search(T data) {
        return (T) "";
    }

    @Override
    public boolean removeFromStart() {
        if (numberArray.length < 1) {
            return false;
        }

        for (int i = numberArray.length - 2; i >= 0; i--) {
            numberArray[i] = numberArray[i+1];
        }
        printArrays(numberArray);
        return true;
    }

    @Override
    public boolean removeFromEnd() {
        return false;
    }

    @Override
    public <T> void printCollection(Collection<T> collection) {
//        collection.forEach(System.out::println);
        throw new UnsupportedOperationException("Arrays are not parrt of collection framework");
    }

    @Override
    @Test
    public void test() {
        insertAtStart(10);
        insertAtEnd(10);
    }

}