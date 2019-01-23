package andynag.tw.dice18

import org.junit.Test

class DiceCompareTest {

    @Test
    fun test_dices_all_different() {
        val input = "1,2,3,4"
        val dices = DiceConvert.convert(input)

        val diceMap = mutableMapOf<Dice, Int>()

    }
}