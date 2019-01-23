package andynag.tw.dice18

import org.junit.Assert
import org.junit.Test

class DiceScoreTest {

    @Test
    fun `1, 2, 3, 4 score should be 0`() {
        val input = "1,2,3,4"
        val dices = DiceConvert.convert(input)
        Assert.assertEquals(0, Score.value(dices))
    }

    @Test
    fun `1, 2, 3, 3 score should be 3`() {
        val input = "1,2,3,3"
        val dices = DiceConvert.convert(input)
        Assert.assertEquals(3, Score.value(dices))
    }

    @Test
    fun `1, 1, 1, 1 should be 19`() {
        val input = listOf(Dice(1),
            Dice(1),
            Dice(1),
            Dice(1))
        val actual = Score.value(input)
        val expect = Score.DICE_18 + 1

        Assert.assertEquals(expect, actual)
    }

    @Test
    fun `2, 2, 2, 2 score should be 20`() {
        val input = listOf(Dice(2),
            Dice(2),
            Dice(2),
            Dice(2))
        val actual = Score.value(input)
        val expect = Score.DICE_18 + 2

        Assert.assertEquals(expect, actual)
    }

    @Test
    fun `3, 3, 3, 3 score should be 21`() {
        val input = listOf(Dice(3),
            Dice(3),
            Dice(3),
            Dice(3))
        val actual = Score.value(input)
        val expect = Score.DICE_18 + 3

        Assert.assertEquals(expect, actual)
    }

    @Test
    fun `4, 4, 4, 4 score should be 22`() {
        val input = listOf(Dice(4),
            Dice(4),
            Dice(4),
            Dice(4))
        val actual = Score.value(input)
        val expect = Score.DICE_18 + 4

        Assert.assertEquals(expect, actual)
    }


    @Test
    fun `6, 6, 1, 1 score should be 12`() {
        val input = listOf(
            Dice(6),
            Dice(6),
            Dice(1),
            Dice(1))
        val actual = Score.value(input)
        val expect = Score.DICE_18
        Assert.assertEquals(expect, actual)
    }

    @Test
    fun `6, 6, 6, 2 score should be 0`() {
        val input = listOf(
            Dice(6),
            Dice(6),
            Dice(6),
            Dice(2))
        val actual = Score.value(input)
        val expect = 0
        Assert.assertEquals(expect, actual)
    }

    @Test
    fun `6, 6, 1, 2 score should be 3`(){
        val input = listOf(
            Dice(6),
            Dice(6),
            Dice(1),
            Dice(2))
        val actual = Score.value(input)
        val expect = 3
        Assert.assertEquals(expect, actual)
    }


}