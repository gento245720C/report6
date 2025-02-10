package jp.ac.uryukyu.ie.e245720;
import java.util.Random;

public class  Janken {
    private String[] options = {"グー", "チョキ", "パー"};
    private Random random;

    public Janken() {
        this.random = new Random();
    }

    public Janken(Random random) {
        this.random = random;
    }

    public String playJanken(int playerChoice){
        int computerChoice = random.nextInt(3);

        System.out.println("あなた: " + options[playerChoice]); 
        System.out.println("橋本環奈: " + options[computerChoice]); 
                
        if (playerChoice == computerChoice){
            return "あいこ！もう一回！";
        } else if ((playerChoice - computerChoice + 3) % 3 == 2){
            return "勝ち";
        } else{
            return "負け";
        }
    }
}