package com.Roger.rpg;

public class Adventurer {
    private int hp=100;
    private int attack=20;
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
		System.out.println("大家好，我是一名正在冒险的年轻人，目前还没有选择我的职业，我的血有："+this.getHp()+"我的攻击力有："+this.getAttack());
	}
	
	public int attack() {
		System.out.println("冒险家还剩"+this.getHp()+"血，他大喊一声：吃我一拳！造成了"+this.getAttack()+"点伤害");
		return attack;
	}
   
}
