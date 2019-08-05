package ru.job4j.oop;

public class Ball {
    public String song(String hangry) {
        String ballSong = hangry + ", от дедушки ушёл, я от бабушки ушёл... " ;
        System.out.println(ballSong);
        return ballSong + hangry;
    }
    public String answer(String answer) {
        String answerFor = answer + ", не ешь меня, послушай лучше мою песенку?!";
        System.out.println(answerFor);
        return answerFor;
    }
}
