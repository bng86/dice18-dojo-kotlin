package andynag.tw.dice18
import org.junit.Assert
import org.junit.Test

class WinnerTest {

    @Test
    fun `Andy is the winner`() {

        val winner = "2,2,2,2"
        val loser = "1,1,1,1"
        val winnerName = "Andy"
        val loserName = "Rick"

        val expected = "Andy win, because of [2,2,2,2]"
        val result = Score.i18a(winnerName, winner, loserName, loser)
        Assert.assertEquals(expected, result)

    }

    @Test
    fun `Rick is the winner`() {
        val winner = "6,6,2,2"
        val loser = "1,1,3,4"
        val winnerName = "Rick"
        val loserName = "Andy"

        val expected = "Rick win, because of [6,6,2,2]"
        val result = Score.i18a(winnerName, winner, loserName, loser)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun `Same score`() {
        val winner = "6,6,2,2"
        val loser = "6,6,3,3"
        val winnerName = "Rick"
        val loserName = "Andy"

        val expected = "draw"
        val result = Score.i18a(winnerName, winner, loserName, loser)
        Assert.assertEquals(expected, result)
    }
}
