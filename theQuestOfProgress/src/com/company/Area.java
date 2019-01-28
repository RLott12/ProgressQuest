package com.company;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by rlott1 on 3/6/2018.
 */
public class Area{
    String type;
    ArrayList<Enemy> monsterType;
    Random rand;
    int randInt;

    public Area(){
        rand = new Random();
        monsterType = new ArrayList<>();
    }

    public Enemy enemyEncounter(Character character){
        if(character.level<4) {
            randInt = rand.nextInt(3);
        }
        else if(character.level <10&& character.level >4) {
            while(randInt < 3){
                randInt = rand.nextInt(5);
            }
        }
        else if(character.level > 10) {
            while(randInt < 5){
                randInt = rand.nextInt(7);
            }
        }

        Enemy enemy = monsterType.get(randInt);
        return enemy;
    }
}
