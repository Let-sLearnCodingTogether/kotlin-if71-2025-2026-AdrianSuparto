data public class GameItem(val id: Int, val name: String, val value: Int, val rarity: String)

fun main() {
    val listGameItem = listOf<GameItem>(
        GameItem(1, "Pedang Besi", 100, "Common"),
        GameItem(2, "Ramuan Kesehatan", 50,"Common"),
        GameItem(3,"Jubah Bayangan", 500, "Epic")
    )

    val curesSword = listGameItem[0].copy(name="Pedang Besi Terkutuk", value =  250)
    println(listGameItem[0])
    println(curesSword)
}