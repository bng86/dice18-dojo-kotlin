package andynag.tw.dice18

class Score {

    companion object {
        // 林北17拉
        const val DICE_17 = 18

        fun value(dices: List<Dice>): Int {
            val distinctList = dices.distinct()
            val isOneColor = (distinctList.size == 1 )
            if(isOneColor){
                return dices[0].number + DICE_17
            }
            val is18la = (distinctList.size == 2) &&
                    dices.contains(Dice(6))
            if (is18la)
                return DICE_17

            // TODO please finish this
            println(dices.groupBy {
                it.number
            })
            return 0
        }

        private fun getDistinct(dices: List<Dice>) = dices.distinct()
    }
}
