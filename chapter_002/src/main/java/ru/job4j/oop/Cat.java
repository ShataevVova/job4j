package ru.job4j.oop;

public class Cat {
    private String food;

    private String name;

    public void show() {
        System.out.print(this.name + " eat ");
        System.out.println(this.food);

    }
    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.giveNick("GAV");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.giveNick("BLACK");
        black.eat("fish");
        black.show();
    }
}
