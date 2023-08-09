package project07;

import java.util.ArrayList;

public class test03 {

	public static void main(String[] args) {
		//1. 요식업 - (식당, 카페) - (나라별 가게, )
//		test03_Food food = new test03_Food();
//		test03_Restaurant res = new test03_Restaurant();
//		test03_Korean kor = new test03_Korean("참이슬");
//		test03_Korean kor2 = new test03_Korean("김치찌개", "소주");
//		test03_Korean kor3 = new test03_Korean("한국", "삼겹살", "안동소주");
//		
//		kor.printsoju();
//		
//		
//		System.out.println(kor.nation + kor.menu + kor.soju);
//		System.out.println(kor2.nation + kor2.menu + kor2.soju);
//		System.out.println(kor3.nation + kor3.menu + kor3.soju);
		
		
		
		
		// ArrayList<Restaurant> rest = new ArrayList<>();
		// ArrayList<Koreanfood> kfood = new ArrayList<>();
		// String[] menu1 = {"김밥", "국밥", "비빔밥", "돌솥밥", "백반"};
		// String[] menu2 = {"김밥", "치즈김밥", "소고기김밥", "참치김밥", "야채김밥"};
		// int[] price1 = {2000, 6000, 5000, 8000, 10000};
		// int[] price2 = {1500, 2000, 3000, 2500, 2000};
		// kfood.add(new Koreanfood("식당", "한국", "한식당", 4.5, menu1, price1));
		// kfood.add(new Koreanfood("식당", "한국", "김밥식당", 4.3, menu2, price2));
		// ArrayList<Americanfood> afood = new ArrayList<>();
		// String[] menu3 = {"페퍼로니피자", "하와이안피자", "치즈피자", "시카고피자", "맥시칸피자"};
		// String[] menu4 = {"치즈버거", "비프버거", "더블치즈버거", "더블비프버거", "치킨버거"};
		// int[] price3 = {10000, 11000, 10000, 13000, 12000};
		// int[] price4 = {5000, 6000, 8000, 9000, 6000};
		// afood.add(new Americanfood("식당", "미국", "피자하우스", 3.3, menu3, price3));
		// afood.add(new Americanfood("식당", "미국", "버거하우스", 4.3, menu4, price4));
		// rest.addAll(kfood);
		// rest.addAll(afood);
		
		// for(int i = 0; i<rest.size();i++) {
		// 	rest.get(i).printRes();
		// }
		
		
		
		//2. 주사위 게임하는 사람들 - 객체가 생성되면 랜덤한 주사위값(1~6)을 가지고 있다. 다른 객체와 주사위 값을 가지고 승부한다.
		//	 누가 이겼는지 판단을 하고, 게임을 할 때마다 주사위값이 바뀌어야 한다.
		
		test03_Dice dice1 = new test03_Dice();
		test03_Dice dice2 = new test03_Dice();
		test03_Dice dice3 = new test03_Dice("플레이어1");
		test03_Dice dice4 = new test03_Dice("플레이어2");
		test03_Dice dice5 = new test03_Dice("플레이어3");
//		int player = dice1.roll();
//		int computer = dice2.roll();
//		System.out.println("player : "+player);
//		System.out.println("computer : "+computer);
//		dice1.VS(computer);
		
//		String winner = dice3.play(dice4);
//		while(winner.equals("무승부")) {
//			System.out.println("무승부입니다. 재경기합니다.");
//			winner = dice3.play(dice4);
//		}
//		System.out.println("승자는" + winner + "입니다.");
		
//		winner = dice3.play3(dice4,dice5);
//		System.out.println("세명중 승자는 "+ winner + "입니다.");


		//player -> 속성:주사위, 행동:주사위 굴리기, 대결하기
		
		//3. 카드게임 -> 객체화
		//컴퓨터, 사람을 객체화한다. 컴퓨터 vs 컴퓨터, 컴퓨터 vs 사람, 사람 vs 사람

//		test03_cardGame computer1 = new test03_cardGame();
//		test03_cardGame computer2 = new test03_cardGame();
//		test03_cardGame player1 = new test03_cardGame();
//		test03_cardGame player2 = new test03_cardGame();
//		player1.playGame2();
//		player2.playGame2();
//		computer1.playGame();
//		computer2.playGame();
//		computer1.result(computer2);
//		player1.result(computer1);
//		player1.result(player2);
		
		

		//추가. 2차원 배열문제 시계방향 혹은 반시계 방향 소용돌이로 채우기
		
	}

}
