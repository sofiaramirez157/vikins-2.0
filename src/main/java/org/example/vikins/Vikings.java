package org.example.vikins;

import org.example.soldier.Soldier;

public class Vikings extends Soldier {
    public String name = "Harald";
    private String msg;

    //Constructor
    public Vikings(String name, int health, int strength) {
        super(health, strength);
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public void receiveDamage(int damage) {
            if (health > 0) {
                setMsg(name + "has received" + damage + "points of damage");
            } else {
                setMsg(name + "has died in act of combat");
            }
        }

    @Override
    public int attack() {
        return super.attack();
    }

    public String battleCry() {

        return "Odin Owns You All!";
    }
}

