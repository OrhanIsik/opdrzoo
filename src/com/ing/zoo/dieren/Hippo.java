package com.ing.zoo.dieren;

public class Hippo {
    private String name;
    private String helloText;
    private String eatText;

    public Hippo() {
    }

    public void sayHello() {
        helloText = "splash";
        System.out.printf("%s: %s\n", name, helloText);
    }

    public void eatLeaves() {
        eatText = "munch munch lovely";
        System.out.printf("%s: %s\n", name, eatText);
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

    public void setName(String name) {
        this.name = name;
    }

    public void setHelloText(String helloText) {
        this.helloText = helloText;
    }

    public void setEatText(String eatText) {
        this.eatText = eatText;
    }
}
