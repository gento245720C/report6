package jp.ac.uryukyu.ie.e245720;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

class JankenTest {
    @Test
    void testPlayJanken() {
        Random fixedRandom = new Random() {
            @Override
            public int nextInt(int bound) {
                return 1; // いつも「チョキ」を出す
            }
        };

        Janken janken = new Janken(fixedRandom);

        assertEquals("勝ち", janken.playJanken(0));
        assertEquals("あいこ！もう一回！", janken.playJanken(1));
        assertEquals("負け", janken.playJanken(2));
    }
}

class AttimuitehoiTest{
    @Test
    void testIsMatch() {
        Attimuitehoi attimuitehoi = new Attimuitehoi();

        assertTrue(attimuitehoi.isMatch(0, 0)); // 同じ方向ならtrue
        assertFalse(attimuitehoi.isMatch(0, 1)); // 違う方向ならfalse
        assertFalse(attimuitehoi.isMatch(2, 3)); // 違う方向ならfalse
    }
}