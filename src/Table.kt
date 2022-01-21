import java.lang.RuntimeException

class Table(busy: Boolean, val place: FoodLine, val waiter: Waiter) {
    var busy = busy
        private set

    class TableIsAlreadyBusyException : RuntimeException()

    fun ownIt(tableOwner: TableOwner) {
        if (this.busy) {
            throw TableIsAlreadyBusyException()
        }
        this.busy = true
        tableOwner.ownedTable = this
    }
}