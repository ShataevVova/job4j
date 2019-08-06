package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int capacity) {
        this.load = capacity;
    }

    public void exchange(Battery another) {
        int cap = this.load; //3000
        this.load = this.load - cap;// another.load; //3000-2100 = 900
        //another.load = (cap - this.load) + another.load; //(3000-900)+2100
        another.load = cap + another.load;
    }
    public static void main(String[] args) {
        Battery first = new Battery(3000);
        Battery second = new Battery(2100);
        System.out.println("First Battary: " + first.load + ". second battery: " + second.load);
        first.exchange(second);
        System.out.println("First Battary: " + first.load + ". second battery: " + second.load);
    }
}
