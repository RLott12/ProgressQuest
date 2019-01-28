package com.company;

/**
 * Created by rlott1 on 3/6/2018.
 */
public class Character{
    int health;
    int defense;
    int strength;
    int level;

    public Character(int Health, int Defense, int Strength, int Level) {
        health = Health;
        defense = Defense;
        strength = Strength;
        level = Level;
    }

    public void Train(){
        strength += 50;
    }

    public void levelUp(){
        defense = defense + 50;
        strength = strength+ 50;
        health = 1000;

    }

    public void TakeDamage(Enemy enemy) {
        if(enemy.strength <= strength){
            System.out.println("The enemy's strength is too low.");
            try {
                Thread.sleep(2000);
            } catch (Exception variable) {

            }
            enemy.Train();
            System.out.println("The enemy picked up a stick.");
            try {
                Thread.sleep(2000);
            } catch (Exception variable) {

            }
            System.out.println("+40 Strength.");
            try {
                Thread.sleep(2000);
            } catch (Exception variable) {

            }
        }else {
            health -= (enemy.strength - defense);
        }
    }
}
