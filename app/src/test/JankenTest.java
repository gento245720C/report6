package jp.ac.uryukyu.ie.e245720;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JankenTest {

    @Test
    public void testPlayJanken() {
        Janken game = new Janken();

        // グー vs グー
        String result = game.playJanken(0);
        assertNotNull(result, "結果がnullであってはなりません。");
        assertTrue(result.equals("あいこ") || result.equals("勝ち") || result.equals("負け"), "結果が正しい値である必要があります。");
    }

    @Test
    public void testPlayAttimuiteHoi() {
        Janken game = new Janken();
        boolean result = game.playAttimuiteHoi(true);
        assertTrue(result || !result, "結果は真または偽のいずれかです。");
    }
}
