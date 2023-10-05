package com.wit;

public class PlayerMain {
    public static void main (String[ ] args){


        Player p1 = new Player("Gökhan", 1000,Weapon.SHOTGUN );

        System.out.println(p1);
        p1.loseHealth(80);
        System.out.println(p1);
        p1.restoreHealth(40);
        System.out.println(p1);
        p1.loseHealth(80);
        System.out.println(p1);

        Player p2 = new Player("Mahmut", -50,Weapon.AXE);

        System.out.println(p2);
        p2.restoreHealth(25);
        System.out.println(p2);
        p2.loseHealth(50);
        System.out.println(p2);



    }

}
