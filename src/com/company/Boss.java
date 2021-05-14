package com.company;



public class Boss extends GameEntity{

    private Weapon bossWeapon;
    private String bossInfo;

    public String printInfo(){

        bossInfo = "Health = "+ getHealth() + " /Damage = " + getDamage()
                + " /Weapon Type = " + bossWeapon.getWeaponType()
        + " /Weapon Name = " + bossWeapon.getWeaponName();

        return bossInfo;


    }

    public Weapon getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }



}
