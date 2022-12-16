package com.isep.rpg;

public class Wizard extends Ennemy {

    public Wizard(String n) {

        super(n, 10, 6);
    }



    @Override
    public void fight(Combatant combatant) {
        combatant.looseLife( getDamagePoints() );
    }
}
