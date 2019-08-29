package classPractice

open class Animal(private var name: String = ""){
    // in kotlin
    // getter usage : animal.name, animal.leg, animal.energy
    // setter usage : animal.name = "Prayooz"

    // you can just set these var to private and make getter/setter like java

    // or adjust visibility of getter/setter manually

    // can't access only setter
    var age: Int = 0
        private set

    // can access both getter/setter
    open var leg: Int = 0

    // can't access only setter
    var energy: Int = 100
        private set

    // call init everytime the primary constructor has called
    init {
        println("Calling primary constructor")
    }

    // overloading constructor : secondary constructor in kotlin
    //   - if class have primary constructor : must call it first
    constructor() : this("NONAME")
    constructor(name: String, age: Int, energy: Int)
            : this(name, age, 0, energy) {
    }
    constructor(name: String, age: Int, leg: Int, energy: Int)
            : this(name) {
        this.age = age
        this.leg = leg
        this.energy = energy
    }

    open fun move() {
        decreaseEnergy(5)
        println("$name is moving, $energy energy left.")
    }

    fun decreaseEnergy(value: Int) {
        energy -= value
    }

    override fun toString() = "$name is $age years old. Have $leg legs and energy = $energy"

}