package Class

object CarFactory {
    val cars = mutableListOf<Car>()

    fun makeCar(horsePowers: Int): Car {
        val car = Car(horsePowers)
        cars.add(car)
        return car
    }
}

class Car(power: Int)