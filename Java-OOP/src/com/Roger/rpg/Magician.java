package com.Roger.rpg;
//法师
public class Magician extends Adventurer {
	

	public  Magician() {
     this.setHp(120);
     this.setAttack(40);
     }
     public void selfIntroduction() {
 		System.out.println("大家好，我是一名正在冒险的年轻人，我已经是一名法师了，我的血有："+this.getHp()+"我的攻击力有："+this.getAttack());
 	}
 	
 	public int attack() {
 		System.out.println("冒险家还剩"+this.getHp()+"血，他大喊一声：啊行刚！造成了"+this.getAttack()+"点伤害");
 		return this.attack();
 	}
    
	
}
