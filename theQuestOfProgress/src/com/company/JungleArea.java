package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by rlott1 on 3/6/2018.
 */
public class JungleArea extends Area {

    public JungleArea(){
        type = "Jungle";
        rand = new Random();
        monsterType = new ArrayList<>();
        monsterType.add (new Enemy(200, 380, 260, "Lion"));
        monsterType.add (new Enemy(200, 380, 260, "Tiger"));
        monsterType.add (new Enemy (300, 400, 290, "Angry Monkey"));
        monsterType.add (new Enemy(580, 570, 443,"Rabid Tiger"));
        monsterType.add (new Enemy(610, 589, 422,"Big Fat Snek"));
        monsterType.add (new Enemy(850, 750, 683,"Panther"));
        monsterType.add (new Enemy(890, 763, 663,"Liger"));
    }
}
