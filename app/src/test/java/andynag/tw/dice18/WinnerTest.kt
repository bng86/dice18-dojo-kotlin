package andynag.tw.dice18

import org.junit.Assert
import org.junit.Test

class WinnerTest {

    @Test
    fun `Who is winner ?`() {

        val winner = "2,2,2,2"
        val loser = "1,1,1,1"
        val winnerName = "Andy"
        val loserName = "Rick"

        val winnerScore = Score.value(DiceConvert.convert(winner))
        val loserScore = Score.value(DiceConvert.convert(loser))

        val expected = "Andy win, because of [2,2,2,2]"
        val result = Score.i18a(winnerName, winner, loserName, loser)
        Assert.assertEquals(expected, result)

    }
}
