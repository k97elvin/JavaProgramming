package day53_FunctionalInteface;

import java.util.List;

public class LambdaExpressions {
    public static void main(String[] args) {

        //    ()->{}
        MyThirdFunctionalInterface<String> stringReverse =
                (s) -> {
                    String reverse = new StringBuilder(s).reverse().toString();
                    return reverse;
                };

        String result = stringReverse.method("Wooden Spoon");
        System.out.println(result);
    }
}