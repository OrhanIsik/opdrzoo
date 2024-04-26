package com.ing.zoo.dieren;

import java.util.Random;

public class Cheetah {
    private String name;
    private String helloText;
    private String eatText;
    private String trick;

    public Cheetah() {
    }

    public void sayHello() {
        helloText = "chirp";
        System.out.printf("%s: %s\n", name, helloText);
    }

    public void eatMeat() {
        eatText = "hmm thats tasty";
        System.out.printf("%s: %s\n", name, eatText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = name + ": jumps in the air";
        } else {
            trick = name + ": rolls over to right";
        }
        System.out.println(trick);
    }

    public String getName() {
        return name;
    }

    public String getHelloText() {
        return helloText;
    }

    public String getEatText() {
        return eatText;
    }

    public String getTrick() {
        return trick;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHelloText(String helloText) {
        this.helloText = helloText;
    }

    public void setEatText(String eatText) {
        this.eatText = eatText;
    }

    public void setTrick(String trick) {
        this.trick = trick;
    }
}
