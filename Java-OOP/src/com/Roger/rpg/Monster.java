package com.Roger.rpg;

public class Monster {
	int hp=120;
    int attack=20;
    public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public void selfIntroduction() {
		System.out.println("大家好，我是一只可爱的小怪，我的血有："+this.getHp()+"我的攻击力有："+this.getAttack());
	}
	
	public int attack() {
		System.out.println("小怪还剩"+this.getHp()+"血，他大喊一声：最讨厌你们这些人类了，打你！造成了"+this.getAttack()+"点伤害");
		return attack;
	}
   
}
