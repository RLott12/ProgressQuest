package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by rlott1 on 3/6/2018.
 */
public class FrostArea extends Area {

    public FrostArea(){
        type = "Frost";
        rand = new Random();
        monsterType = new ArrayList<>();
        monsterType.add (new Enemy(270, 352, 270, "Icicle"));
        monsterType.add (new Enemy(270, 343, 280, "Pingu"));
        monsterType.add (new Enemy(360, 350, 275, "Frosty Boy"));
        monsterType.add (new Enemy(589, 560, 443,"Sharp Icicle"));
        monsterType.add (new Enemy(610, 559, 432,"Fat Pingu"));
        monsterType.add (new Enemy(850, 753, 681,"Bad Frosty Boy"));
        monsterType.add (new Enemy(880, 770, 689,"Haunted Snowman"));

    }
}
