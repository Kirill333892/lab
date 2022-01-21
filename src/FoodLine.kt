import kotlin.random.Random

open class FoodLine {
    val waiters = Array(Random.nextInt(2, 6)) { Waiter(this) }
    val tables = Array(Random.nextInt(2, 10)) { Table( Random.nextInt(10)==0, this, this.waiters.random()) }
}