package ru.job4j;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heightMan = 171;
        double man = Fit.manWeight(heightMan);
        System.out.println("Man 171 is " + man);
        short heightWoman = 162;
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Woman 162 is " + woman);
    }
}