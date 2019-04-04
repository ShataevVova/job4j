package ru.job4j.converter;

/**
 * Корвертор валюты.
 */
public class Converter {
    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
	 
    public int rubleToEuro(int value) {
		//int res1 = value*70;
		return (value / 70);
	}
    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
		//int res2 = value*60;
		return (value / 60); 
    }
		/**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return Рубли.
     */
    public int euroToRuble(int value) {
		//int res3 = value*70;
		return (value * 70);
    }
		/**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return Рубли.
     */
    public int dollarToRuble(int value) {
		//int res4 = value*60;
		return (value * 60);
    }
}

