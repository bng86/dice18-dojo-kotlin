package andynag.tw.dice18

import org.junit.Assert
import org.junit.Test

class DiceTest {

    @Test
    fun test_dice_number() {
        val dice = Dice(1)
        val expected = 1
        Assert.assertEquals(expected, dice.number)
    }
}