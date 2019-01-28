package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Character Hero = new Character(1000, 321, 312, 1);
        Random val = new Random();
        int Xp = 0;

        Area Area = new Area();
        ArrayList<String>promptList = new ArrayList<String>();
        promptList.add("You keep walking even though you're really tired. Hopefully there's donuts at the end of your quest.");
        promptList.add("Nearby gnomes wish you luck on your adventures.");
        promptList.add("You take a little break and snack on some leftovers.");
        promptList.add("You look around for anything yummy to scavenge.");
        ArrayList<Area> currentArea = new ArrayList();
        currentArea.add(new DesertArea());
        currentArea.add(new PlainsArea());
        currentArea.add(new JungleArea());
        currentArea.add(new FrostArea());

        while (true) {
            Area = currentArea.get(val.nextInt(4));
            if(Area == currentArea.get(0)){
                int says = val.nextInt(2);
                if(says == 1){
                    System.out.println("You see sand on the horizon and feel the air around you get hotter.");
                }
                else if(says == 0){
                    System.out.println("The ground in front of you becomes more sandy with each step and you begin to sweat.");
                }

                try {
                    Thread.sleep(3000);
                } catch (Exception variable) {

                }
            }
            else if (Area == currentArea.get(1)){
                int says = val.nextInt(2);
                if(says == 1){
                    System.out.println("The path your walking down leads to an open field of grass.");
                }
                else if(says == 0){
                    System.out.println("The way ahead opens up to a vast plain of grass.");
                }

                try {
                    Thread.sleep(3000);
                } catch (Exception variable) {

                }
            }
            else if (Area == currentArea.get(2)){
                int says = val.nextInt(2);
                if(says == 1){
                    System.out.println("As you continue down your path the trees around you grow more plentiful and the air grows wet and heavy.");
                }
                else if(says == 0){
                    System.out.println("Your journey brings you to the edge of a dense jungle.");
                }

                try {
                    Thread.sleep(3000);
                } catch (Exception variable) {

                }
            }
            else if(Area == currentArea.get(3)){
                int says = val.nextInt(2);
                if(says == 1){
                    System.out.println("As you travel farther down the path you start to shiver and you can see your breath.");
                }
                else if(says == 0){
                    System.out.println("You feel the environment around you get significantly colder.");
                }

                try {
                    Thread.sleep(3000);
                } catch (Exception variable) {

                }
            }


            while (true) {
                int value = val.nextInt(4);
                if (value >= 3) {
                    int num = val.nextInt(4);
                    if (num == 1) {
                        System.out.println(promptList.get(0));
                        try {
                            Thread.sleep(3000);
                        } catch (Exception variable) {

                        }
                    } else if (num == 2) {
                        System.out.println(promptList.get(1));
                        try {
                            Thread.sleep(3000);
                        } catch (Exception variable) {

                        }
                    } else if (num == 3) {
                        System.out.println(promptList.get(2));
                        try {
                            Thread.sleep(3000);
                        } catch (Exception variable) {

                        }
                    } else if (num == 4) {
                        System.out.println(promptList.get(2));
                        try {
                            Thread.sleep(3000);
                        } catch (Exception variable) {

                        }
                    }
                }
                if (value < 3) {
                    Enemy myEnemy = Area.enemyEncounter(Hero);
                    System.out.println("You have encountered a(n) " + myEnemy.name + ".");
                    try {
                        Thread.sleep(2000);
                    } catch (Exception variable) {

                    }
                    while (myEnemy.health > 0) {

                        System.out.println("The " + myEnemy.name + " attacked you!");
                        try {
                            Thread.sleep(2000);
                        } catch (Exception variable) {

                        }

                        Hero.TakeDamage(myEnemy);

                        if (Hero.health < 0){
                            System.out.println("Your remaining HP: 0");
                        }
                        else {
                            System.out.println("Your remaining HP: " + Hero.health);
                        }
                        try {
                            Thread.sleep(2000);
                        } catch (Exception variable) {

                        }

                        if (Hero.health <= 0) {
                            int says = val.nextInt(2);
                            if(says == 1){
                                System.out.println("You pull out some leftovers and chow down. Plus 1000 HP.");
                            }
                            else if(says == 0){
                                System.out.println("You cover yourself in bandages. Plus 1000 HP.");
                            }
                            try {
                                Thread.sleep(2000);
                            } catch (Exception variable) {

                            }
                            Hero.health = 1000;
                        }

                        System.out.println("You attack the " + myEnemy.name + ".");
                        try {
                            Thread.sleep(2000);
                        } catch (Exception variable) {

                        }

                        myEnemy.TakeDamage(Hero);

                        if (myEnemy.health < 0){
                            System.out.println("Enemy remaining HP: 0");
                            try {
                                Thread.sleep(2000);
                            } catch (Exception variable) {

                            }
                        }
                        else {
                            System.out.println("Enemy remaining HP: " + myEnemy.health);
                        }
                        try {
                            Thread.sleep(2000);
                        } catch (Exception variable) {
                        }
                    }

                    int points = 0;
                    while(points <3){
                        points = val.nextInt(10);
                    }
                    Xp = Xp + points;

                    System.out.println("You've defeated the " + myEnemy.name + "! You received: " + points + " XP points.");
                    try {
                        Thread.sleep(2000);
                    } catch (Exception variable) {

                    }

                    if (Xp >= (10* Hero.level)) {
                        Hero.level = Hero.level + 1;
                        System.out.println("Congratulations! You've reached level " + Hero.level + ".");
                        Hero.levelUp();
                        Xp = 0;
                        try {
                            Thread.sleep(2000);
                        } catch (Exception variable) {

                        }
                    }
                }
                break;
            }
        }
    }
}
