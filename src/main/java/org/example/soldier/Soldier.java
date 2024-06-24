package org.example.soldier;

public class Soldier {
    public int health;
    public int strength;

    //Constructor
    public Soldier(int health, int strength) {
        this.health = 300;
        this.strength = 150;
    }

    public void receiveDamage(int damage) {
        health = health - damage;
    }

    //Metodo attack ()
    public int attack() {
        return this.strength;
    }
}





