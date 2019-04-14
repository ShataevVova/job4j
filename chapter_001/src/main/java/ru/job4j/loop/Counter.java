package ru.job4j.loop;

public class Counter {
	/**
	 * вычисляет сумму чётных чисел от star до finish.
	 */
	public int add(int start, int finish) {
		int sum = 0;
		if (start < finish) {
			for (int index = start; index <= finish; index++) {
			if (index % 2 != 0) {
				continue;
			}
			System.out.println("положительное чётное число: " + index);
			sum += index;
		}
			System.out.println("сумма всех чётных чисел в диапазоне от " + start + " до " + finish + ": " + sum);
		} 	else {
			for (int index = start; index >= finish; index--) {
				if (index % 2 != 0) {
					continue;
				}
				System.out.println("отрицательное чётное число: " + index);
				sum += index;
			}
			System.out.println("сумма всех чётных чисел в диапазоне от " + start + " до " + finish + ": " + sum);
		}
		return sum;
	}
}
