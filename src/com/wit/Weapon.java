package com.wit;

public enum Weapon {

    AXE (10, 1.8),
    SWORD (20, 1.5),
    SHOTGUN (40, 2);

    private int damage;
    private double attackSpeed;
    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }
}
