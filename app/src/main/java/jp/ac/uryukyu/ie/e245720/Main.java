package jp.ac.uryukyu.ie.e245720;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Janken janken = new Janken();
        boolean gameOver = false;

        System.out.println("私は橋本環奈！！");
        System.out.println("じゃんけんで勝負よ！！");


        while (!gameOver){
            System.out.println("0: グー");
            System.out.println("1: チョキ");
            System.out.println("2:パー");
            int playerChoice;
            while(true){
            try{
                playerChoice = Integer.parseInt(scanner.nextLine());
                if (playerChoice >= 0 && playerChoice <= 2) break;
                    else System.out.println(" 0, 1, 2の中から選んで！");
                } catch (NumberFormatException e) {
                    System.out.println("変なことをしないで！");
                }
            }


                String result = janken.playJanken(playerChoice);
                if (!result.equals("あいこ")){
                    boolean playerWonJanken = result.equals("勝ち");

                    System.out.println("あっち向いて... ");
                    System.out.println("0: 上");
                    System.out.println("1: 下");
                    System.out.println("2: 右");
                    System.out.println("3: 左");
                    int playerDirection;
                    while(true){
                        try{
                            playerDirection = Integer.parseInt(scanner.nextLine());
                            if (playerDirection >= 0 && playerDirection <= 3) break;
                            else System.out.println("0, 1, 2, 3の中から選んで！");
                        }catch (NumberFormatException e){
                            System.out.println("変なことしないで！");
                    }
                }

            gameOver = janken.playAttimuiteHoi(playerWonJanken, playerDirection);
        }
    }
        scanner.close();
    }
}

