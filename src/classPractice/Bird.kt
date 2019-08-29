package classPractice

class Bird : Animal {
    var color: String = "NONE"
        private set

    // Variable Shadowing
    override var leg: Int = 2

    constructor(name: String, age: Int
                , energy: Int, color: String)
        : super(name, age, energy) {
        this.color = color
        println("Initialize bird with full details constructor")
    }

    override fun move() {
        super.decreaseEnergy(10)
        super.move()
    }

    override fun toString(): String = super.toString() + " COLOR : $color" + " and Supper.leg = ${super.leg}"
}