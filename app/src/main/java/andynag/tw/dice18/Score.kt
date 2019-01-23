package andynag.tw.dice18

class Score {

    companion object {
        fun value(dices: List<Dice>): Int {
            // TODO please finish this
            println(dices.groupBy {
                it.number
            })
            return 0
        }
    }
}
