package ru.mirea.Humanoid;

public class Leg {
    String legOrienttion;

    public Leg(String legOrienttion) {
        this.legOrienttion = legOrienttion;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "legOrienttion='" + legOrienttion + '\'' +
                '}';
    }
}
