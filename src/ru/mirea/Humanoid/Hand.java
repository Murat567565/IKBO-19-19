package ru.mirea.Humanoid;

public class Hand {
    String HandOrienttion;

    public Hand(String HandOrienttion) {
        this.HandOrienttion = HandOrienttion;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "HandOrienttion='" + HandOrienttion + '\'' +
                '}';
    }
}
