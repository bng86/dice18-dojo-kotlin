package andynag.tw.dice18

class Score {

    companion object {
        // 林北17拉
        const val DICE_18 = 18

        fun value(dices: List<Dice>): Int {

            val diceGroup = dices.groupBy { it.number }

            return when (diceGroup.size) {
                1 -> return dices[0].number + DICE_18
                2 -> {
                    if (diceGroup.any { it.value.size == 3 }) {
                        return 0
                    } else if (dices.contains(Dice(6))) {
                        return DICE_18
                    } else {
                        return (diceGroup.map { it.value }.maxBy { it[0].number }?.get(0)?.number ?: -1) * 2
                    }

                }
                3 -> {
                    var value = 0
                    diceGroup.forEach {
                        if (it.value.size != 2) {
                            value += it.value[0].number
                        }
                    }
                    return value
                }
                4 -> return 0
                else -> throw IllegalArgumentException("You suck!!")
            }
        }

        fun i18a(player1Name: String, player1Dice: String, player2Name: String, player2Dice: String): String {
            val player1Score = Score.value(DiceConvert.convert(player1Dice))
            val player2Score = Score.value(DiceConvert.convert(player2Dice))
            return if (player1Score > player2Score) {
                "$player1Name win, because of [$player1Dice]"
            } else if (player1Score < player2Score) {
                "$player2Name win, because of [$player2Dice]"
            } else {
                "draw"
            }
        }

        private fun getDistinct(dices: List<Dice>) = dices.distinct()
    }
}
