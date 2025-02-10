package jp.ac.uryukyu.ie.e245720;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Janken janken = new Janken();
        Attimuitehoi attimuitehoi = new Attimuitehoi();
        Player player = new Player();
        boolean gameOver = false;

        System.out.println("私は橋本環奈！！\n じゃんけんで勝負よ！！");

        while (!gameOver){
            int playerChoice;
            String result;

            while(true){
                playerChoice = player.PlayerHand();
                result = janken.playJanken(playerChoice);
                if (!result.equals( "あいこ！もう一回！")){
                    break;
                }
                System.out.println("もう一回！！！");
 
        }
                boolean playerWonJanken = result.equals("勝ち");

                System.out.println("あっち向いて....");
                int playerDirection = player.PlayerDirection();
                int computerDirection = attimuitehoi.computerDirection();

                System.out.println("あなた" + attimuitehoi.DirectionName(playerDirection));
                System.out.println("橋本環奈" + attimuitehoi.DirectionName(computerDirection));

                if (attimuitehoi.isMatch(playerDirection, computerDirection)) {
                    if (playerWonJanken) {
                        System.out.println("あなたの勝ち！");
                        System.out.println("ひとつだけ言うこと聞いてあげる(^_^)");
                    } else {
                        System.out.println("橋本環奈の勝ち！");
                        System.out.println("可愛さもじゃんけんも私の勝ち〜！");
                    }
                    gameOver = true; // 勝敗が決まったらゲーム終了
                } else {
                    System.out.println("もう一回！！！！！！！！！");
                }
            }
            scanner.close();
        }
    }