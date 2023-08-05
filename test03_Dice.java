

public class test03_Dice {
    int dice = (int)(Math.random()*6+1);

    int roll(){
        return dice;
    }


    void VS(int ins){
        if(this.dice==ins){
            System.out.println("비겼습니다.");
        }else if(this.dice<ins){
            System.out.println("computer가 이겼습니다.");
        }else{
            System.out.println("player가 이겼습니다.");
        }
    }


}
