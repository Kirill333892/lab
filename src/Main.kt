import kotlin.random.Random

fun main() {
    val cafe: Array<FoodLine> = Array(Random.nextInt(2, 12)) { if (Random.nextBoolean()) Cafe() else Canteen() }
    println("Есть ${cafe.size} кафе и столовых, в которых есть ${cafe.sumOf { O -> O.tables.size }} стола(ов)")
//    val cafe1 = cafe[Random.nextInt(cafe.size)]
//    cafe1.tables[Random.nextInt(cafe1.tables.size)]
    lateinit var cafe1: Table
    while (true) {
        cafe1 = cafe.random().tables.random()
        if (!cafe1.busy) {
            break
        }
    }
    println("Стол выбран!")
    cafe1.ownIt(Neznaika)
    println("Незнайка занял себе стол.")
    cafe1.waiter.takeOrder(Neznaika)
    println("Незнайка сделал заказ у официанта.")
}