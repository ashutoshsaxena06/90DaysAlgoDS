package main.revisit.concepts.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {

    /*
    What are streams ?
     streams are wrappers around a data source, allowing us to operate with that data source and making bulk processing convenient and fast.

    A stream does not store data and, in that sense, is not a data structure. It also never modifies the underlying data source.
    */

   /* Stream operations are either intermediate or terminal.

    The terminal operations return a result of a certain type and intermediate operations return the stream itself so we can chain multiple methods in a row to perform the operation in multiple steps.
    */

    /*
    Based on the above points, a stream is :

    - Not a data structure
    - Designed for lambdas
    - Do not support indexed access
    - Can easily be aggregated as arrays or lists
    - Lazy access supported
    - Parallelizable
      */

    // how to create streams
    public static void main(String[] args) {
        // #1 by using Stream.ofs - int primitive
        Stream<Integer> numberStream_1 = Stream.of(9,10,11,12,13,14);
        numberStream_1.forEach(System.out::println);
        // #2 by using Stream.ofs - int primitive
        Stream<Integer> numberStream_2 = Stream.of(new Integer[]{9,10,11,12,13,14});
        numberStream_2.forEach(System.out::println);
        //  #3 List.stream
        List<Integer> li = Arrays.asList(9,10,11,12,13,14,15);
        li.stream();
        // #4 stream.generate
        Stream<Integer> integerStream = Stream.generate(() -> new Random().nextInt());
        // #5 Stream of from string chars or tokens
        IntStream ins = "1234566789_abcdef".chars();
        ins.forEach(System.out::println);
        Stream<String> stringStream = Stream.of("A$B$C$".split("\\$"));
        stringStream.forEach(System.out::println);



    }

}
