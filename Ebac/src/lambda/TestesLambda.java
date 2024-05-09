package lambda;

import java.util.function.IntBinaryOperator;

public class TestesLambda {
    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (int a, int b) -> {
            return a + b;
        };
        int result1 = intBinaryOperator.applyAsInt(5, 15);
        System.out.println(result1);

    }

}
