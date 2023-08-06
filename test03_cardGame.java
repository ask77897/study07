import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class test03_cardGame {
    Scanner sc = new Scanner(System.in);
    LinkedHashSet<String> cardSet = new LinkedHashSet<>();
    ArrayList<String> cardArr = new ArrayList<>();
    String [] card = {"거지","시민","귀족","왕"};
    int cardDraw = 4;
    
    String pickRandomCard(){
        if(card.length == 0) {
            throw new IllegalArgumentException("더 이상 카드가 없습니다.");
        }
        Random random = new Random();
        int RandomIndex = random.nextInt(card.length);
        String pickCard = card[RandomIndex];

        String[] newCardArray = new String[card.length-1];
        int a = 0;
        for(int i=0; i<card.length;i++) {
            if(i != RandomIndex) {
                newCardArray[a++] = card[i];
            }
        }
        card = newCardArray;

        return pickCard;

    }

    void playGame() {
		for (int i = 0; i < cardDraw; i++) {
			String randomCard = pickRandomCard();
			cardArr.add(randomCard);
		}
		System.out.println(cardArr);
		
	}

	void playGame2() {
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;

		HashSet<Integer> setInt = new HashSet<Integer>();
		while (cnt < 4) {
			System.out.print("1:거지 2:시민 3:귀족 4:왕 / 카드 순서를 입력해주세요. : ");
			int a = sc.nextInt();

			if (setInt.contains(a)) {
				System.out.println("이미 선택한 카드입니다. 다른 카드를 선택해주세요.");
			} else if (a > 4) {
				System.out.println("없는 카드입니다. 1~4 중에서 입력해주세요.");
			} else {
				if (a == 1) {
					cardSet.add("거지");
					setInt.add(a);
					cnt++;
				} else if (a == 2) {
					cardSet.add("시민");
					setInt.add(a);
					cnt++;
				} else if (a == 3) {
					cardSet.add("귀족");
					setInt.add(a);
					cnt++;
				} else if (a == 4) {
					cardSet.add("왕");
					setInt.add(a);
					cnt++;
				}
			}
		}
		System.out.println(cardSet);
		ArrayList<String> arr = new ArrayList<>(cardSet);
		cardArr = arr;
	}

    // void result1(ArrayList<String> othercardArr){
    //     for(int i = 0; i<cardArr.size(); i++){
    //         if(this.cardArr.get(i).equals(othercardArr.get(i))){
    //             System.out.println("무승부");
    //         }else if(!(this.cardArr.get(i).equals(othercardArr.get(i)))){
    //             if(this.cardArr.get(i).equals("왕")&&othercardArr.get(i).equals("거지")){
    //                 System.out.println("player2이 이겼습니다.");
    //             }else if(this.cardArr.get(i).equals("왕")&&!(othercardArr.get(i).equals("거지"))){
    //                 System.out.println("player1이 이겼습니다.");
    //             }else if(this.cardArr.get(i).equals("귀족")&&!(othercardArr.get(i).equals("왕"))){
    //                 System.out.println("player1이 이겼습니다.");
    //             }else if(this.cardArr.get(i).equals("귀족")&&othercardArr.get(i).equals("왕")){
    //                 System.out.println("player2이 이겼습니다.");
    //             }else if(this.cardArr.get(i).equals("시민")&&!(othercardArr.get(i).equals("거지"))){
    //                 System.out.println("player2이 이겼습니다.");
    //             }else if(this.cardArr.get(i).equals("시민")&&othercardArr.get(i).equals("거지")){
    //                 System.out.println("player1이 이겼습니다.");
    //             }else if(this.cardArr.get(i).equals("거지")&&!(othercardArr.get(i).equals("왕"))){
    //                 System.out.println("player2이 이겼습니다.");
    //             }else if(this.cardArr.get(i).equals("거지")&&othercardArr.get(i).equals("왕")){
    //                 System.out.println("player1이 이겼습니다.");
    //             }
    //         }
    //     }    
    // }

    void result(test03_cardGame computer2){
        for (int i = 0; i < cardArr.size(); i++) {
			if (this.cardArr.get(i).equals(computer2.cardArr.get(i))) {
				System.out.println("무승부");
			} else if (!(this.cardArr.get(i).equals(computer2.cardArr.get(i)))) {
				if (this.cardArr.get(i).equals("왕") && computer2.cardArr.get(i).equals("거지")) {
					System.out.println("player2이 이겼습니다.");
				} else if (this.cardArr.get(i).equals("왕") && !(computer2.cardArr.get(i).equals("거지"))) {
					System.out.println("player1이 이겼습니다.");
				} else if (this.cardArr.get(i).equals("귀족") && !(computer2.cardArr.get(i).equals("왕"))) {
					System.out.println("player1이 이겼습니다.");
				} else if (this.cardArr.get(i).equals("귀족") && computer2.cardArr.get(i).equals("왕")) {
					System.out.println("player2이 이겼습니다.");
				} else if (this.cardArr.get(i).equals("시민") && !(computer2.cardArr.get(i).equals("거지"))) {
					System.out.println("player2이 이겼습니다.");
				} else if (this.cardArr.get(i).equals("시민") && computer2.cardArr.get(i).equals("거지")) {
					System.out.println("player1이 이겼습니다.");
				} else if (this.cardArr.get(i).equals("거지") && !(computer2.cardArr.get(i).equals("왕"))) {
					System.out.println("player2이 이겼습니다.");
				} else if (this.cardArr.get(i).equals("거지") && computer2.cardArr.get(i).equals("왕")) {
					System.out.println("player1이 이겼습니다.");
				}
			}
		}    
    }

    
}
