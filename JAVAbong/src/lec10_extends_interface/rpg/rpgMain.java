package lec10_extends_interface.rpg;

import java.util.ArrayList;
import java.util.Scanner;

import lec10_extends_interface.rpg.Warrior.Jobs;

public class rpgMain {

	public static void main(String[] args) {
		Warrior minwoo = new Warrior("민우", 100, 200, Jobs.BERSERKER);
		Creep chanung = new Creep("찬웅", 10, 300);
		
		Magician AAA = new Magician("우어어ㅓㅇ", 100, 100, Magician.Jobs.FIRE);
		
		
		ArrayList<Character> party = new ArrayList<Character>();
		party.add(minwoo);
		party.add(AAA);
		
		Creep creep = new Creep("잡몹", 30, 200);
		Boss boss = new Boss("데블몬", 100, 1000);
		
		// 모든 클래스들은 기본적으로 Object라는 클래스를 상속받고 있다.
		// 다만 생략되어서 extends에 보이지 않음.
		
		// Warrior -> Character -> Object
		ArrayList<Object> battleGround = new ArrayList<Object>();
		
		battleGround.add(minwoo);
		battleGround.add(AAA);
		battleGround.add(creep);
		battleGround.add(boss);
		battleGround.add(chanung);
		
		for(int i=0; i < battleGround.size(); i++) {
			System.out.println(battleGround.get(i));
		}
		
		System.out.println(battleGround.get(0).getClass());
		
		minwoo.battle = new Battle() {
			@Override
			public void outOfBattle() {
				battleGround.remove(minwoo);
			}
		};
		
		AAA.battle = new Battle() {
			@Override
			public void outOfBattle() {
				battleGround.remove(AAA);
			}
		};
		
		creep.battle = new Battle() {
			@Override
			public void outOfBattle() {
				battleGround.remove(creep);
			}
		};
		
		boss.battle = new Battle() {
			@Override
			public void outOfBattle() {
				battleGround.remove(boss);
			}
		};
		
		chanung.battle = new Battle() {
			@Override
			public void outOfBattle() {
				battleGround.remove(chanung);
			}
		};
		
		AAA.skill(creep);
		AAA.skill(creep);
		for(int i=0; i < battleGround.size(); i++) {
			System.out.println(battleGround.get(i));
		}
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			for(int i=0; i < battleGround.size(); i++) {
				// 각각의 battleGround.get(i) 요소들은 Object로 형변환 된 상태
				// instanceof 로 캐릭터인지 체크 후에 행동을 입력 받는다.
				if(battleGround.get(i) instanceof Character) {
					// 해당 객체를 캐릭터로 Character로 변환
					Character player = (Character)battleGround.get(i);
					System.out.println(player.getName() + "의 턴입니다. 행동을 선택해주세요");
					System.out.println("1.공격 | 2.스킬");
					System.out.print(">>> ");
					
					int select = Integer.parseInt(sc.nextLine());
					
					if(select == 1) {
						player.attack(boss);
					}else if(select == 2) {
						player.skill(boss);
					}
				}
			}
			if(!battleGround.contains(boss)) {
				System.out.println("전투에서 승리하였습니다.");
				break;
			}
			if(battleGround.contains(minwoo) && battleGround.contains(AAA)) {
				System.out.println("전투에서 패배하였습니다");
				break;
			}
		}
	}
}
