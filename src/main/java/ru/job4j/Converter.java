package ru.job4j;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        euro = Converter.rubleToEuro(210);
        System.out.println("210 rubles are " + euro + " euro.");
        euro = Converter.rubleToEuro(290);
        System.out.println("290 rubles are " + euro + " euro.");

        float dollar = Converter.rubleToDollar(180);
        System.out.println("180 ruble are " + dollar + " dollar.");
        dollar = Converter.rubleToDollar(360);
        System.out.println("360 ruble are " + dollar + " dollar.");
        dollar = Converter.rubleToDollar(410);
        System.out.println("410 ruble are " + dollar + " dollar.");
    }
}