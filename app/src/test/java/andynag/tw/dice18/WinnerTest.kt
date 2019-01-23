package andynag.tw.dice18

import org.junit.Assert
import org.junit.Test

class WinnerTest {

    @Test
    fun `Who is winner ?`() {

        val winner = "2,2,2,2"
        val loser = "1,1,1,1"


        val winnerScore = Score.value(DiceConvert.convert(winner))
        val loserScore = Score.value(DiceConvert.convert(loser))

        Assert.assertTrue(winnerScore > loserScore)

    }
}
