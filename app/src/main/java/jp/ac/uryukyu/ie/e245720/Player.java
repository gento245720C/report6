package jp.ac.uryukyu.ie.e245720;
import java.util.Scanner;

public class Player {
    private Scanner scanner = new Scanner(System.in);
    
    public int PlayerHand(){
        System.out.println("0: グー\n1: チョキ\n2:パー");
        while(true){
            try{
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 0 && choice <= 2) {
                    return choice;
            }
            System.out.println(" 0, 1, 2の中から選んで！");
        } catch (NumberFormatException e){
            System.out.println("変なことをしないで！");
        }
        }
    }

    public int PlayerDirection(){
        System.out.println("0: 上\n1: 下\n2: 右\n3: 左");
        while(true){
            try{
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 0 && choice <= 3){
                    return choice;
                }
                System.out.println(" 0, 1, 2, 3の中から選んで！");
            } catch (NumberFormatException e) {
                System.out.println("変なことをしないで！");
            }
        } 
    }
}
