package com.ing.zoo;

import com.ing.zoo.dieren.*;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {

        Lion henk = new Lion();
        henk.setName("henk");
        Hippo elsa = new Hippo();
        elsa.setName("elsa");
        Pig dora = new Pig();
        dora.setName("dora");
        Tiger wally = new Tiger();
        wally.setName("wally");
        Zebra marty = new Zebra();
        marty.setName("marty");
        Giraffe melman = new Giraffe();
        melman.setName("melman");
        Cheetah dumbo = new Cheetah();
        dumbo.setName("dumbo");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine();

        if ("hello".equals(input)) {
            System.out.print("Voer de naam van het dier in (of druk op Enter om alle dieren te zien): ");
            String nameInput = scanner.nextLine();
            if (nameInput.isEmpty()) {
                // Begroetingen van alle dieren
                henk.sayHello();
                elsa.sayHello();
                dora.sayHello();
                wally.sayHello();
                marty.sayHello();
                melman.sayHello();
                dumbo.sayHello();
                //specifieke namen
            } else if (nameInput.equals(henk.getName())) {
                henk.sayHello();
            } else if (nameInput.equals(elsa.getName())) {
                elsa.sayHello();
            } else if (nameInput.equals(dora.getName())) {
                dora.sayHello();
            } else if (nameInput.equals(wally.getName())) {
                wally.sayHello();
            } else if (nameInput.equals(marty.getName())) {
                marty.sayHello();
            } else if (nameInput.equals(melman.getName())) {
                melman.sayHello();
            } else if (nameInput.equals(dumbo.getName())) {
                dumbo.sayHello();
            } else {
                System.out.println("Unknown animal: " + nameInput);
            }
        } else if ("give leaves".equals(input)) {
            elsa.eatLeaves();
            dora.eatLeaves();
            marty.eatLeaves();
            melman.eatLeaves();
        } else if ("give meat".equals(input)) {
            henk.eatMeat();
            wally.eatMeat();
            dora.eatMeat();
            dumbo.eatMeat();
        } else if ("perform trick".equals(input)) {
            wally.performTrick();
            dora.performTrick();
            dumbo.performTrick();
        } else {
            System.out.println("Unknown command: " + input);
        }


    }
}

