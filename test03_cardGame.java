import java.util.ArrayList;
import java.util.Random;

public class test03_cardGame {
    ArrayList<String> cardArr = new ArrayList<>();
    String [] card = {"거지","시민","귀족","왕"};
    int cardDraw = 4;

    public String pickRandomCard(){
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
        for(int i=0; i<cardDraw; i++) {
            String randomCard = pickRandomCard();
            cardArr.add(randomCard);
        }
        System.out.println(cardArr);
        System.out.println();
    }

    void result(ArrayList<String> othercardArr){
        for(int i = 0; i<cardArr.size(); i++){
            if(this.cardArr.get(i).equals(othercardArr.get(i))){
                System.out.println("무승부");
            }else if(!(this.cardArr.get(i).equals(othercardArr.get(i)))){
                if(this.cardArr.get(i).equals("왕")&&othercardArr.get(i).equals("거지")){
                    System.out.println("player2이 이겼습니다.");
                }else if(this.cardArr.get(i).equals("왕")&&!(othercardArr.get(i).equals("거지"))){
                    System.out.println("player1이 이겼습니다.");
                }else if(this.cardArr.get(i).equals("귀족")&&!(othercardArr.get(i).equals("왕"))){
                    System.out.println("player1이 이겼습니다.");
                }else if(this.cardArr.get(i).equals("귀족")&&othercardArr.get(i).equals("왕")){
                    System.out.println("player2이 이겼습니다.");
                }else if(this.cardArr.get(i).equals("시민")&&!(othercardArr.get(i).equals("거지"))){
                    System.out.println("player2이 이겼습니다.");
                }else if(this.cardArr.get(i).equals("시민")&&othercardArr.get(i).equals("거지")){
                    System.out.println("player1이 이겼습니다.");
                }else if(this.cardArr.get(i).equals("거지")&&!(othercardArr.get(i).equals("왕"))){
                    System.out.println("player2이 이겼습니다.");
                }else if(this.cardArr.get(i).equals("거지")&&othercardArr.get(i).equals("왕")){
                    System.out.println("player1이 이겼습니다.");
                }
            }
        }    
    }

    

}
