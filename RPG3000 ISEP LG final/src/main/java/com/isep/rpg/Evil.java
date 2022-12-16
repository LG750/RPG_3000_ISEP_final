package com.isep.rpg;

public class Evil extends Ennemy {

    public Evil(String n) {
        super(n, 6, 3);
    }


    @Override
    public void fight(Combatant combatant) {
        combatant.looseLife( getDamagePoints() );
    }
}

