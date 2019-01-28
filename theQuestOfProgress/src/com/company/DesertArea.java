package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by rlott1 on 3/6/2018.
 */
public class DesertArea extends Area {

    public DesertArea (){
        type = "Desert";
        rand = new Random();
        monsterType = new ArrayList<>();
        monsterType.add (new Enemy(210, 336, 270,"Cactus"));
        monsterType.add (new Enemy(210, 335, 265,"Snek"));
        monsterType.add (new Enemy(210, 334, 273,"Snek in a Boot"));
        monsterType.add (new Enemy(630, 570, 403,"Scary Snek"));
        monsterType.add (new Enemy(590, 585, 372,"Spiky Cactus"));
        monsterType.add (new Enemy(950, 750, 683,"Extra Scary Snek"));
        monsterType.add (new Enemy(900, 730, 693,"Spoopy Cactus"));
    }
}
