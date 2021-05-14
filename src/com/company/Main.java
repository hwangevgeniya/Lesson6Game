package com.company;

public class Main {







    public static void main(String[] args) {
        // write your code here

        Weapon boss1Weapon = new Weapon("Холодное оружие", "Меч");

        Boss boss1 = new Boss(700,50, boss1Weapon);

        System.out.println("Здоровье босса = " + boss1.getHealth() + " /Урон босса = " + boss1.getDamage()
                + " /Оружие босса = " + boss1Weapon.getWeaponType() + " - " + boss1Weapon.getWeaponName());

        /*Weapon boss1Weapon = new Weapon("Холодное оружие", "Меч");

        Boss boss1 = new Boss(700,50, boss1Weapon);

        System.out.println(boss1.printInfo());*/



    }




}
