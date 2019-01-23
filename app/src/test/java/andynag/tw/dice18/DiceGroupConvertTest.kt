package andynag.tw.dice18

import org.junit.Assert
import org.junit.Test

class DiceGroupConvertTest {

    @Test
    fun test_dice_group_convert_to_dice_list() {
        val input = "1,2,3,4"
        val actual = DiceConvert.convert(input)
        val expected = listOf(
            Dice(1),
            Dice(2),
            Dice(3),
            Dice(4)
        )

        Assert.assertEquals(expected, actual)
    }

}