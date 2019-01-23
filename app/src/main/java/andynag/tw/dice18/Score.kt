package andynag.tw.dice18

class Score {

    companion object {
        const val DICE_18 = 18

        fun value(dices: List<Dice>): Int {
            val isOneColor = (dices.distinct().size == 1 )
            if(isOneColor){
                return dices[0].number + DICE_18
            }

            // TODO please finish this
            println(dices.groupBy {
                it.number
            })
            return 0
        }
    }
}
