class Player(val name: String) {
    var health: Int = 100
    var level: Int = 1

    fun takeDamage(damage: Int) {
        if (health > 0) {
            health -= damage
        } else if (health <= 0) {
            println("You Die")
        }
    }

    fun levelUp() {
        level += 1
        health = 100
    }

    fun showStatus() {
        println("Nama: [$name], Level:[$level], Health:[$health]")
    }
}

fun main() {
    var player = Player("Adrian")
    player.showStatus()
    player.takeDamage(30)
    player.showStatus()
    player.levelUp()
    player.showStatus()
}