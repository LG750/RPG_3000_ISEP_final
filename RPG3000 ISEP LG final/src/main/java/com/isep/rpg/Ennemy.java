package com.isep.rpg;

public abstract class Ennemy extends Combatant {

    public Ennemy(String n, int h, int damagePoints) {
        super(n, h);
        this.damagePoints = damagePoints;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    // Les points de degats sont intégrés aux ennemis (ils n'ont pas d'arme)
    private int damagePoints;
}
