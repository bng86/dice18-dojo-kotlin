package andynag.tw.dice18

import org.junit.Assert
import org.junit.Test

class DiceScoreTest {

    @Test
    fun test_dices_0() {
        val input = "1,2,3,4"
        val dices = DiceConvert.convert(input)
        Assert.assertEquals(0, Score.value(dices))
    }

    @Test
    fun test_dices_score_3() {
        // TODO help me
//        val input = "1,2,3,3"
//        val dices = DiceConvert.convert(input)
//        Assert.assertEquals(3, Score.value(dices))
    }

    @Test
    fun `1,1 ,1, 1 should be 19`() {
        val input = listOf(Dice(1),
            Dice(1),
            Dice(1),
            Dice(1))
        val actual = Score.value(input)
        val expect = 19

        Assert.assertEquals(expect, actual)
    }

    @Test
    fun `2,2,2 ,2,  should be 20`() {
        val input = listOf(Dice(2),
            Dice(2),
            Dice(2),
            Dice(2))
        val actual = Score.value(input)
        val expect = 20

        Assert.assertEquals(expect, actual)
    }


}