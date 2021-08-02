fun main() {
    val world = "notRussia"
    val playerName = "Alex"
    val playerAge = 30
    var playerLives = 3
    var playerMony = 6.2
    var isSavedGame = true
    var playerRice = "Demons"

    playerLives = checkSavedGame(isSavedGame, playerLives)

    if (playerLives > 2){
        println("Жизней достаточно $playerLives")
    } else {
        println("Жизней мало $playerLives")
    }

    printPlayerRice(playerRice)
    printPlayer(world, playerName, playerAge, playerLives)


}

fun checkSavedGame(isSavedGame: Boolean, playerLives: Int): Int {
    var playerLives1 = playerLives
    if (isSavedGame) {
        println("Loading game...")
        println("Start game")
        playerLives1 = 3

    } else {
        println("Start new game")
    }
    return playerLives1
}

private fun printPlayerRice(playerRice: String) {
    when (playerRice) {
        "Humans" -> println("Расса игрока Люди")
        "Orks" -> println("Расса игрока Орки")
        "Demons" -> println("Расса игрока Демоны")
    }
}

fun printPlayer(
    world: String,
    playerName: String,
    playerAge: Int,
    playerLives: Int
) {
    println("Мир $world")
    println("Игорок $playerName")
    println("Возраст: $playerAge")
    println("Жизни $playerLives")
    println("Деньги: $playerName")
}