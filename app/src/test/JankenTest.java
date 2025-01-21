package jp.ac.uryukyu.ie.e245720;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JankenTest {

    @Test
    public void testPlayJanken() {
        Janken game = new Janken();

        // プレイヤーがグーを選ぶ 
        String result = game.playJanken(0);
        assertTrue(result.equals("あいこ") || result.equals("勝ち") || result.equals("負け"), "結果が正しい値である必要があります。");
    }

    @Test
    public void testPlayAttimuiteHoi() {
        Janken game = new Janken();
        boolean gameOver = gamee.playAttimuiteHoi(true, 0);
        assertTrue(gameOver == true || gameOver == false);;
    }
}
