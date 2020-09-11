package ru.mirea.Humanoid;

import java.util.Arrays;

public class Human {
    Leg[] legs = {new Leg("левая нога"),new Leg("правая  нога")};
    Head head = new Head();
    Hand[] hands = {new Hand("левая рука"),new Hand("правая  рука")};

    @Override
    public String toString() {
        return "Human{" +
                "legs=" + Arrays.toString(legs) +
                ", head=" + head +
                ", hands=" + Arrays.toString(hands) +
                '}';
    }
    public void print(){
        System.out.println(this);
    }
}
