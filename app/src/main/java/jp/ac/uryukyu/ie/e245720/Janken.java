import java.util.Random;
import java.util.Scanner;

public class Janken {
    public static void main(String[] args) {
        String[] options = {"グー", "チョキ", "パー"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("じゃんけんを始めます！");
        System.out.println("0: グー, 1: チョキ, 2: パー");

        while (true) {
            try {
                System.out.print("あなたの選択: ");
                int playerChoice = scanner.nextInt();

                if (playerChoice < 0 || playerChoice > 2) {
                    System.out.println("0, 1, 2の中から選んでください。");
                    continue;
                }

                int computerChoice = random.nextInt(3);

                System.out.println("あなたの手: " + options[playerChoice]);
                System.out.println("コンピュータの手: " + options[computerChoice]);

                if (playerChoice == computerChoice) {
                    System.out.println("あいこです！もう一度。\n");
                } else if ((playerChoice - computerChoice + 3) % 3 == 1) {
                    System.out.println("あなたの勝ちです！");
                    break;
                } else {
                    System.out.println("あなたの負けです。");
                    break;
                }
            } catch (Exception e) {
                System.out.println("数字を入力してください。");
                scanner.next(); // 入力のリセット
            }
        }

        scanner.close();
    }
}
