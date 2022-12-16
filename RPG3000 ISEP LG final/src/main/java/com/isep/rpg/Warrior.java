package com.isep.rpg;

public class Warrior extends Hero {

    public Warrior(String n) {
        // warrior possède 6 points de vie
        super(n, 6);
    }

    @Override
    public void fight(Combatant combatant) {
        combatant.looseLife( weapon.getDamagePoints() );
    }


    @Override
    public void take(Item item) {
        if (item instanceof Weapon) {
            weapon = (Weapon) item;
        } else if (item instanceof  Food) {
            food = (Food) item;
        } else {
            Game.displayMessage("Oups ! " + item.getName() + " est inutile...");
        }
    }

    private Weapon weapon;
    private Food food;

    @Override
    public Weapon getWeapon(){
        return weapon;
    }

    @Override
    public Food getFood(){
        return food;
    }
}
