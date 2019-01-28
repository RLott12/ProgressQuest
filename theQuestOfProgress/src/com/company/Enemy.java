package com.company;

/**
 * Created by rlott1 on 3/6/2018.
 */
public class Enemy {
    int health;
    int strength;
    int defense;
    String name;


    public Enemy(int Health, int Strength, int Defense, String Name) {
        health = Health;
        defense = Defense;
        strength = Strength;
        name = Name;

    }

    public void Train(){
        strength = strength + 40;
    }
    public void TakeDamage(Character character){
        if (character.strength <= defense){
            System.out.println("Your strength is too low to deal damage!");
            try {
                Thread.sleep(2000);
            } catch (Exception variable) {

            }
            character.Train();
            System.out.println("You decide to train");
            try {
                Thread.sleep(2000);
            } catch (Exception variable) {

            }
            System.out.println("+50 Strength.");
            try {
                Thread.sleep(2000);
            } catch (Exception variable) {

            }
        }
        health -= (character.strength - defense);
    }

}
