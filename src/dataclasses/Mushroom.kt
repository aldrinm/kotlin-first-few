package dataclasses

data class Mushroom(val size: Int, val isMagic: Boolean) {

    //secondary constructor
    constructor(isMagic_param: Boolean): this(0, isMagic_param) {
        println("Secondary constructor called")
    }

}