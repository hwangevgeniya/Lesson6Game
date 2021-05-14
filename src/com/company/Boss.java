package com.company;



public class Boss extends GameEntity{

    private Weapon bossWeapon;

    public Boss(int health, int damage, Weapon bossWeapon) {
        super(health, damage);
        this.bossWeapon = bossWeapon;
    }

    public Weapon getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }

/*private int health;
    private int damage;
    private String defenceType;

    public Boss(int health, int damage, String defenceType){

        this.health = health;
        this.damage = damage;
        this.defenceType = defenceType;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDefenceType() {
        return defenceType;
    }

    public void setDefenceType(String defenceType) {
        this.defenceType = defenceType;
    }*/
}
