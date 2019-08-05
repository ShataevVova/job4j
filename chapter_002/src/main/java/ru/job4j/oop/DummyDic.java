package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return " " + eng;
    }
    public static void main(String[] args) {
        DummyDic translate = new DummyDic();
        String word = translate.engToRus("СТОЛ");
        System.out.println("Неизвестное слово" + word);
    }
}
