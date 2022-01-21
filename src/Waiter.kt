class Waiter(val work: FoodLine): Human(){
    fun takeOrder(customer: Customer){ customer.getOrder() }
}