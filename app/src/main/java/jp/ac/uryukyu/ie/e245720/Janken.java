package jp.ac.uryukyu.ie.e245720;
import java.util.Random;

public class  Janken {
        private String[] options = {"グー", "チョキ", "パー"};
        private String[] directions = {"上", "下", "右", "左"};
        private String Jankenresult;

        public String playJanken(int playerChoice){
            if (playerChoice < 0 || playerChoice > 2){
                throw new IllegalArgumentException("選択は0から2の間でなければなりません。");
            }

            Random random = new Random();
                int computerChoice = random.nextInt(3);
                System.out.println("あなた:" + options[playerChoice]);
                System.out.println("橋本環奈:" + options[computerChoice]);

                if (playerChoice == computerChoice){
                    Jankenresult = "あいこ！もう一回！";
                } else if ((playerChoice - computerChoice + 3) % 3 == 1){
                    Jankenresult = "勝ち";
                } else{
                    Jankenresult = "負け";
                }
            
        System.out.println("じゃんけんの結果: " + Jankenresult);
        return Jankenresult;
            
        
        }

        public boolean playAttimuiteHoi(boolean playerWonJanken, int playerDirection) {
            Random random = new Random();
            int computerDirection = random.nextInt(4);

            System.out.println("ホイ！！！！！！！！");
            System.out.println("あなた: " + directions[playerDirection]);
            System.out.println("橋本環奈: " + directions[computerDirection]);
    
            if (playerDirection == computerDirection) {
                if (playerWonJanken) {
                    System.out.println("あなたの勝ち");
                    System.out.println("ひとつだけ言うこときいてあげる(^_^)");
                } else {
                    System.out.println("橋本環奈の勝ち");
                    System.out.println("可愛さもじゃんけんも私の勝ち〜！");
                }
                return true; // 勝敗確定
            } else {
                System.out.println("もう一回！！！！！！！！！");
                return false; 
            }
        }
    }