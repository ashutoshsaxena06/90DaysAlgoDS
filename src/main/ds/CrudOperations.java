package main.ds;

import java.util.Collection;

public interface CrudOperations {

    <T> boolean insertAtStart(T data);

    <T> boolean insertAtEnd(T data);

    <T> T search(T data); // read

//    <T> boolean update(T data);

    boolean removeFromStart();

    boolean removeFromEnd();

    <T> void printCollection(Collection<T> collections);

    void test();

}
