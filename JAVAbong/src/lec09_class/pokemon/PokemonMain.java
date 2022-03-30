package lec09_class.pokemon;

import java.util.ArrayList;
import java.util.Scanner;

import lec09_class.Constants;

public class PokemonMain {

	public static void main(String[] args) {
		ArrayList<Pokemon> pokemonPool = new ArrayList<Pokemon>();
		
		pokemonPool.add(new Pokemon("피카츄", "백만볼트", 50, 200, Constants.TYPE_THUNDER, 200));
		pokemonPool.add(new Pokemon("라이츄", "츄츄츄츄", 30, 250, Constants.TYPE_THUNDER, 140));
		pokemonPool.add(new Pokemon("파이리", "파파파파", 10, 180, Constants.TYPE_FIRE, 120));
		pokemonPool.add(new Pokemon("꼬부기", "꺼북꺼북", 40, 250, Constants.TYPE_WATER, 290));
		pokemonPool.add(new Pokemon("버터풀", "버터버터", 25, 300, Constants.TYPE_PLANT, 350));
		pokemonPool.add(new Pokemon("야도란", "도란도란", 60, 400, Constants.TYPE_PLANT, 570));
		pokemonPool.add(new Pokemon("피존투", "조오온투", 90, 500, Constants.TYPE_FIRE, 800));
		pokemonPool.add(new Pokemon("또가스", "도도가스", 35, 700, Constants.TYPE_PLANT, 100));
		
		Trainer minwoo = new Trainer("민우", 1000);
		Trainer jihye = new Trainer("지혜", 1000);
		
		Scanner sc = new Scanner(System.in);            
  
		// 경매 6번 진
		for(int i=0; i < 6; i++) {
			// 0 부터 pool 사이즈의 -1 까지 중 랜덤하게 나옵니다.
			int randInt = (int)(Math.random()*pokemonPool.size());
			System.out.println((i+1)+ "번째 포켓몬 경매 ====================");
			System.out.println(pokemonPool.get(randInt));
			System.out.println("==============================");
			
			int bet = 0 ;
			while(true) {
				// 민우 
				System.out.println("보유현황 -------------------");
				minwoo.showPokemonList();
				jihye.showPokemonList();
				System.out.println("------------------------------");
				System.out.println("현재 입찰 금액 : " + bet);
				System.out.println(minwoo.getName() + "님, 소지금(" + minwoo.getMoney() + ")");
				System.out.println("입찰 가격 입력 : ");
				int inputBet = Integer.parseInt(sc.nextLine());
				minwoo.setBet(inputBet);
				
				// 입찰 포기시 -1 입력
				if(inputBet != -1 ) {
					bet = minwoo.getBet();
				}else {
					break;
				}
				// 지혜 
				System.out.println("현재 입찰 금액 : " + bet);
				System.out.println(jihye.getName() + "님, 소지금(" + jihye.getMoney() + ")");
				System.out.println("입찰 가격 입력 : ");
				inputBet = Integer.parseInt(sc.nextLine());
				jihye.setBet(inputBet);
				
				// 입찰 포기시 -1 입력
				if(inputBet != -1 ) {
					bet = jihye.getBet();
				}else {
					break;
				}
			}
			if(minwoo.getBet() != -1) {
				System.out.println(minwoo.getName() + "님이" + pokemonPool.get(randInt).getName() + "을(를) " + minwoo.getBet() + "원에 구매하셨습니다.");
				minwoo.buyPokemon(pokemonPool.get(randInt));
			}
			if(jihye.getBet() != -1) {
				System.out.println(jihye.getName() + "님이" + pokemonPool.get(randInt).getName() + "을(를) " + jihye.getBet() + "원에 구매하셨습니다.");
				jihye.buyPokemon(pokemonPool.get(randInt));
			}
		}
		
		while(true) {
			minwoo.showPokemonList();
			jihye.showPokemonList();
			
			for(int i=0; i < 3; i++) {
				Pokemon one = minwoo.getPokemonList().get(i);
				Pokemon two = jihye.getPokemonList().get(i);
				
				one.attack(two);
				two.attack(one);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(minwoo.checkPokemon() >=2 && minwoo.checkPokemon() >= 2) {
				System.out.println("무승부");
				break;
			}else if(minwoo.checkPokemon() >=2) {
				System.out.println(jihye.getName() + "승리");
				break;
			}else if(jihye.checkPokemon() >=2) {
				System.out.println(minwoo.getName() + "승리");
				break;
			}
		}
	}
}
