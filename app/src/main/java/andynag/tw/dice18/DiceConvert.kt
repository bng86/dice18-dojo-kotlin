package andynag.tw.dice18

object DiceConvert {
    fun convert(input: String): List<Dice> {
        val dices = mutableListOf<Dice>()
        val array =input.split(',')
        for (number in array){
            val dice = Dice(number.toInt())
            dices.add(dice)
        }
        return dices
    }

}
