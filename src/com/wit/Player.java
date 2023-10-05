package com.wit;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    private void checkHealth(int health) {

        if (health > 100) {
            this.healthPercentage = 100;
        } else if (health < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = health;
        }
    }
    public Player(String name, int healthPercentage, Weapon weapon) {

        this.name = name;
        checkHealth(healthPercentage);
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {

        if (this.healthPercentage - damage <= 0) {
            System.out.println(("Player " + this.name + " has been knocked out of game!"));
        }
        checkHealth(this.healthPercentage - damage);
    }
    public int healthRemaining() {

        return this.healthPercentage;
    }

    public void restoreHealth(int healthPotion)
    {

        checkHealth(this.healthPercentage + healthPotion);

    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Health: " + this.healthPercentage+" Weapon: " + (this.weapon.name() + " | Damage: " + this.weapon.getDamage()+ " - Attack Speed: "+ this.weapon.getAttackSpeed()+ " Damage Deal: " + (this.weapon.getDamage()*this.weapon.getAttackSpeed()));}
}
