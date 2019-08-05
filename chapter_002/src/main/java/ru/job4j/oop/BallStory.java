package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.song("Я Колобок");
        Hare hare = new Hare();
        hare.tryEat(ball);
        ball.answer("ЗАЯЦ");
        ball.song("Я");
        Wolf wolf = new Wolf();
        wolf.tryEat(ball);
        ball.answer("ВОЛК");
        Fox fox = new Fox();
        fox.tryEat(ball);
        ball.answer("ЛИСА");
        ball.song("Я");
        fox.eat(ball);


    }
}
