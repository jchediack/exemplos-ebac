package lambda;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class TestesLambda {
    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (int a, int b) -> {
            return a + b;
        };
        int result1 = intBinaryOperator.applyAsInt(5, 15);
        System.out.println(result1);


        BiFunction<Double, Double, String> biFunctionsStr = (Double a, Double b) -> {
            Double re = a + b;
            return String.valueOf(re);
        };
        String result2 = biFunctionsStr.apply(10d,  50d);
        System.out.println(result2);


        Runnable helloWorld = () -> System.out.println("Hello World");

    }

}
