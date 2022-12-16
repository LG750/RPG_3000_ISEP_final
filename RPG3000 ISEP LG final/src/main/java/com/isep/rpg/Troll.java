package com.isep.rpg;


public class Troll extends Ennemy {

    public Troll(String n) {
        super(n, 8, 4);
    }

    @Override
    public void fight(Combatant combatant) {
        combatant.looseLife( getDamagePoints() );
    }
}
