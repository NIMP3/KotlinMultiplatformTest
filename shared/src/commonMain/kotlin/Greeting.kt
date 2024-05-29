import kotlin.random.Random

class Greeting {
    private val platform = getPlatform()
    fun greet(): List<String> = buildList {
        add(if (Random.nextBoolean()) "Hi!" else "Hello!")
        add("Welcome Edwin! 😎")
        add("Guess what this is! > ${platform.name.reversed()}!")
        add(daysPhrase())
    }
}