package com.Roger.rpg;

public class Warrior extends Adventurer{
	public Warrior() {
	     this.setHp(240);
	     this.setAttack(25);
	     }
     public void selfIntroduction() {
 		System.out.println("大家好，我是一名正在冒险的年轻人，我已经是一名战士了，我的血有："+this.getHp()+"我的攻击力有："+this.getAttack());
 	}
 	
 	public int attack() {
 		System.out.println("冒险家还剩"+this.getHp()+"血，他大喊一声：十字斩！造成了"+this.getAttack()+"点伤害");
 		return this.getAttack();
 	}
    
}
