package com.Roger.rpg;

import java.util.Scanner;

public  class Story {
		
	
  // 
	public 	void start()
	{
		System.out.println("在很久很久以前，魔王复苏了……");
		System.out.println("在平安村上有一位冒险家决定踏上征途，去打败魔王");
		System.out.println("----------------------------------------------------------");
		System.out.println("在校园小树林，冒险家遇见了第一个怪兽，一场激烈的战斗就要开始了！");
		Adventurer adventurer=new Adventurer(); 
		firstBattle(adventurer);
	}
	
	public  void firstBattle(Adventurer adventurer) {

	    Monster monster=new Monster();
		int a=adventurer.getHp();
		int b=adventurer.getAttack();
		int b2=monster.getAttack();
		int a2= monster.getHp();
		adventurer.selfIntroduction();
		monster.selfIntroduction();
		while(a>0&&a2>0) {	
			adventurer.attack();
			a2-=b;
			monster.setHp(a2);
			monster.attack();
			a-=b2;
			
			adventurer.setHp(a);
			monster.setHp(a2);
		}
		if(a<=0) {
		System.out.println("冒险家被打得要死");
		System.out.println("冒险家痛定思痛之后，决定刻苦学习，开始转职");
		fight(adventurer);
		
		}
		else if (a2<=0) {
			System.out.println("冒险家胜利了");
			System.exit(0);
		}
	}
	public  void fight(Adventurer adventurer)
	
	{  
		Scanner sc=new Scanner(System.in);
		System.out.println("请选择职业：1.战士 2.法师");		 
		 int i=sc.nextInt();
		 if(i==1) {
			 adventurer=new Warrior();
			 firstBattle(adventurer);
		 }
		 if(i==2) {
		adventurer=new Magician();
		firstBattle(adventurer);
		
		}
		 else {
			 System.out.println("输入有误");
			 fight(adventurer);
		 }
		 
	
		
	}
}
