package com.cg.demo.fun;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionDemo2 {

	public static void main(String[] args) {

		Integer num = 7;

		Predicate<Integer> predicate = (n) -> {
			if (n <= 10)
				return true;
			return false;
		};
		System.out.println(predicate.test(num));

//		if (num % 2 == 0)
//			System.out.println("Even");
//		System.out.println("Odd");

		Consumer<Double> consumer = (salary) -> {
			System.out.println(salary);
		};
		consumer.accept(10000.0);

		Supplier<Integer> supplier = () -> {
			Random random = new Random();
			return random.nextInt();
		};

		System.out.println(supplier.get());

		Function<String, String> function = (input) -> {
			return input + input;
		};
		System.out.println(function.apply("Twice"));
	}
}