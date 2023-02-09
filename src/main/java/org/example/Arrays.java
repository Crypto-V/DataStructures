package org.example;
import java.util.Arrays;
import java.util.stream.Stream;

class Arraystry {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        Stream<Integer> streamsInt = Arrays.stream(numbers).boxed();
        int sum = streamsInt.reduce(0,(a,b) -> a+b);
        System.out.println("Sum: "+sum);
    }
}
