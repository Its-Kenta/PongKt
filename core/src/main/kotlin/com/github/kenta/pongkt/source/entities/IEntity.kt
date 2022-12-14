package com.github.kenta.pongkt.source.entities


import com.badlogic.gdx.math.Rectangle
import com.badlogic.gdx.math.Vector2

// Defining components.
// Internal components -- START
interface Shape {
    var rectangle: Rectangle
}

interface Position {
    var position: Vector2
}

interface Velocity {
    var velocity: Vector2
    val speed: Vector2
}

interface Drawable : Shape, Position
// Internal components -- END

interface Playable {
    fun playerMovement(delta: Float, rectangle: Rectangle, velocity: Vector2, speed: Vector2)
}

interface AIController {
    fun aiMovement(delta: Float, rectangle: Rectangle, velocity: Vector2, speed: Vector2, ball: Ball)
}

interface BallController {
    fun ballMovement(delta: Float, rectangle: Rectangle, velocity: Vector2, speed: Vector2)
}

interface BallReflection {
    fun ballReflect(rectangle: Rectangle, speed: Vector2)
}

interface Collidable {
    fun checkCollision(collider: Rectangle, collidesWith: Rectangle) : Boolean
}


interface Dynamics : Shape, Position, Velocity {
    override var velocity: Vector2
    override var speed: Vector2

    fun update(delta: Float)
    fun keepInBoundary()
}