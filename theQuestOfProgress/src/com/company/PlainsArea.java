package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by rlott1 on 3/6/2018.
 */
public class PlainsArea extends Area {

    public PlainsArea(){
        type = "Plains";
        rand = new Random();
        monsterType = new ArrayList<>();
        monsterType.add(new Enemy(190, 400, 270, "Cow"));
        monsterType.add(new Enemy(220, 500, 250,"Bad Tree Boy"));
        monsterType.add(new Enemy(190, 400, 270,"Moss Rock"));
        monsterType.add (new Enemy(593, 570, 413,"Big Ol Cow"));
        monsterType.add (new Enemy(626, 581, 422,"Rude Tree Boy"));
        monsterType.add (new Enemy(850, 736, 682,"Moss Monster"));
        monsterType.add (new Enemy(880, 700, 679,"Rabid Cow"));
    }
}
