package com.isep.rpg;


public abstract class Hero extends Combatant {

    public Hero(String n, int h) {
        super(n, h);
    }


    public abstract void take(Item item);

    public abstract Weapon getWeapon();

    public abstract Food getFood();

    @Override
    public String toString(){
        return this.getName();
    }
}
