package com.isep.rpg;

public class BigEnnemy extends Ennemy{

    public BigEnnemy(String n) {
        super(n, 12, 8);
    }

    @Override
    public void fight(Combatant combatant) {
        combatant.looseLife( getDamagePoints() );
    }
}


