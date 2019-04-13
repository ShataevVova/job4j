package ru.job4j.loop;

public class Counter {
	/** вычисляет сумму чётных чисел от star до finish.
	*/
    public int add(int start, int finish) {
        int sum;
        int temp = 0;
		for (sum = start; sum <= finish; sum++) {
			if (sum % 2 != 0) {
				continue;
			}
			System.out.println("чётное число: " + sum);
			temp += sum;
		}
		System.out.println("сумма всех чётных чисел в диапазоне от " + start + " до " + finish + ": " + temp);
		 return (temp);
    }
}