package jp.ac.uryukyu.ie.e245720;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Janken janken = new Janken();

        System.out.println("じゃんけんスタート");
        System.out.println("0: グー, 1: チョキ, 2: パー");

        while (true){
            try{
                System.out.print("あなたの選択");
                int playerChoice = scanner.nextInt();
                String result = janken.playRound(playerChoice);
                System.out.println("結果: " + result);

                if (!result.equals("あいこ")){
                    break;
                }
            } catch (Exception e){
                System.out.println("無効な入力です。もう一度お試しください。");
                scanner.next();
            }
        }
        scanner.close();
    }
}
