package ru.job4j.loop;

public class Factorial {
	/**
	 * вычисляет Факториал числа n.
	 */
	public int calc(int n) {
		int result = 1;
		for (int i = result; i <= n; i++) {
			System.out.println("i: " + i);
			result = result * i;
			System.out.println("result: " + result);
		}
		System.out.println("факториал числа " + n + ": " + result);
		return (result);
	}
}