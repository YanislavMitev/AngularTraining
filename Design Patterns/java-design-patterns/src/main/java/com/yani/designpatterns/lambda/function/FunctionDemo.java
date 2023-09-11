package com.yani.designpatterns.lambda.function;

/**
 * When chaining functions, you first apply the first function and then the second.
 * When composing functions, you apply the first function to the result of the function passed as a parameter.
 */
public class FunctionDemo {
    public static void main(String[] args) {
        Meteo meteo = new Meteo(20);

        Function<Meteo, Integer> readCelsius = m -> m.getTemperature();
        Function<Integer, Double> celsiusToFahrenheit = t -> t*9d/5d + 32d;

        // chaining
        Function<Meteo, Double> readFahrenheit = readCelsius.andThen(celsiusToFahrenheit);
        System.out.println("Meteo is F " + readFahrenheit.apply(meteo));

        // composing
        Function<Meteo, Double> readFahrenheitComposition = celsiusToFahrenheit.compose(readCelsius);
        System.out.println("Meteo is F " + readFahrenheitComposition.apply(meteo));
    }
}
