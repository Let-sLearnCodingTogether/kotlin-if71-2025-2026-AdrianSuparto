package OperatorOverloadingAndConvention

data class Mana(var current: Int, var max: Int) {
    operator fun plus(other: Mana): Mana {
        val newCurrent = current + other.current
        val newMax = maxOf(this.max, other.max)
        return Mana(newCurrent, newMax)
    }

    operator fun inc(): Mana {
        if (current + 10 <= max || current > 0) {
            return Mana(current + 10, max)
        } else return Mana(current, max)
    }

    operator fun minus(other: Int): Mana {
        if (current - other < 0) {
            println("Current tidak bisa  kurang dari nol")
            return Mana(current, max)

        } else {
            return Mana(current - other, max)
        }
    }
}

    fun main() {
        var mana1 = Mana(50, 100)
        var mana2 = Mana(20, 50)

        println(mana1 + mana2)
        mana1++
        println(mana1)
        println(mana1 - 100)
    }