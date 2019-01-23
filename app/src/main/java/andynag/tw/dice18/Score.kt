package andynag.tw.dice18

class Score {

    companion object {
        // 林北17拉
        const val DICE_17 = 18

        fun value(dices: List<Dice>): Int {

                return when(dices.distinct().size) {
                    1 -> return dices[0].number + DICE_17
                    2 -> {
                        if(dices.groupBy { it.number }.any{ it.value.size == 3}){
                            return 0
                        }else if(dices.contains(Dice(6))) {
                            return DICE_17
                        } else {
                            return -1
                        }

                    }
                    3 -> {
                        var value: Int = 0
                        dices.groupBy { it.number }.forEach {
                            if (it.value.size != 2) {
                                value += it.value[0].number
                            }
                        }
                        return value
                    }
                    4 -> return 0
                    else -> return -1

                }



            // TODO please finish this

        }



        private fun getDistinct(dices: List<Dice>) = dices.distinct()
    }
}
