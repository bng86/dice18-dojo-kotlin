package andynag.tw.dice18

import org.junit.Assert
import org.junit.Test

class DiceCompareTest {

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
}