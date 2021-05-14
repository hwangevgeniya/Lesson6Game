package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {







    public static void main(String[] args) {
        // write your code here

        Boss boss1 = new Boss();
        Weapon Weapon1 = new Weapon();
        Weapon Weapon2 = new Weapon();
        Skeleton Skeleton1 = new Skeleton();
        Skeleton Skeleton2 = new Skeleton();

        boss1.setHealth(700);
        boss1.setDamage(50);
        Weapon1.setWeaponType("Холодное оружие");
        Weapon1.setWeaponName("Меч");
        Weapon2.setWeaponType("Холодное оружие");
        Weapon2.setWeaponName("Стрелы");
        boss1.setBossWeapon(Weapon1);

        Skeleton1.setHealth(200);
        Skeleton1.setDamage(20);
        Skeleton1.setBossWeapon(Weapon2);
        Skeleton2.setHealth(250);
        Skeleton2.setDamage(25);
        Skeleton2.setBossWeapon(Weapon2);




        //System.out.println("Здоровье босса = " + boss1.getHealth() + " /Урон босса = " + boss1.getDamage()
        //        + " /Оружие босса = " + boss1Weapon.getWeaponType() + " - " + boss1Weapon.getWeaponName());



        System.out.println(boss1.printInfo());

        System.out.println(Skeleton1.printInfo());
        System.out.println(Skeleton2.printInfo());





    }




}
