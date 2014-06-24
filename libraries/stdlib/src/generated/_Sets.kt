package kotlin

//
// NOTE THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import java.util.*

/**
 * Returns a set containing all distinct elements from the given collection.
 */
public fun <T> Array<out T>.distinct(): Set<T> {
    return this.toMutableSet()
}

/**
 * Returns a set containing all distinct elements from the given collection.
 */
public fun BooleanArray.distinct(): Set<Boolean> {
    return this.toMutableSet()
}

/**
 * Returns a set containing all distinct elements from the given collection.
 */
public fun ByteArray.distinct(): Set<Byte> {
    return this.toMutableSet()
}

/**
 * Returns a set containing all distinct elements from the given collection.
 */
public fun CharArray.distinct(): Set<Char> {
    return this.toMutableSet()
}

/**
 * Returns a set containing all distinct elements from the given collection.
 */
public fun DoubleArray.distinct(): Set<Double> {
    return this.toMutableSet()
}

/**
 * Returns a set containing all distinct elements from the given collection.
 */
public fun FloatArray.distinct(): Set<Float> {
    return this.toMutableSet()
}

/**
 * Returns a set containing all distinct elements from the given collection.
 */
public fun IntArray.distinct(): Set<Int> {
    return this.toMutableSet()
}

/**
 * Returns a set containing all distinct elements from the given collection.
 */
public fun LongArray.distinct(): Set<Long> {
    return this.toMutableSet()
}

/**
 * Returns a set containing all distinct elements from the given collection.
 */
public fun ShortArray.distinct(): Set<Short> {
    return this.toMutableSet()
}

/**
 * Returns a set containing all distinct elements from the given collection.
 */
public fun <T> Iterable<T>.distinct(): Set<T> {
    return this.toMutableSet()
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun <T> Array<out T>.intersect(other: Iterable<T>): Set<T> {
    val set = this.toMutableSet()
    set.retainAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun BooleanArray.intersect(other: Iterable<Boolean>): Set<Boolean> {
    val set = this.toMutableSet()
    set.retainAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun ByteArray.intersect(other: Iterable<Byte>): Set<Byte> {
    val set = this.toMutableSet()
    set.retainAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun CharArray.intersect(other: Iterable<Char>): Set<Char> {
    val set = this.toMutableSet()
    set.retainAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun DoubleArray.intersect(other: Iterable<Double>): Set<Double> {
    val set = this.toMutableSet()
    set.retainAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun FloatArray.intersect(other: Iterable<Float>): Set<Float> {
    val set = this.toMutableSet()
    set.retainAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun IntArray.intersect(other: Iterable<Int>): Set<Int> {
    val set = this.toMutableSet()
    set.retainAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun LongArray.intersect(other: Iterable<Long>): Set<Long> {
    val set = this.toMutableSet()
    set.retainAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun ShortArray.intersect(other: Iterable<Short>): Set<Short> {
    val set = this.toMutableSet()
    set.retainAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun <T> Iterable<T>.intersect(other: Iterable<T>): Set<T> {
    val set = this.toMutableSet()
    set.retainAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun <T> Array<out T>.subtract(other: Iterable<T>): Set<T> {
    val set = this.toMutableSet()
    set.removeAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun BooleanArray.subtract(other: Iterable<Boolean>): Set<Boolean> {
    val set = this.toMutableSet()
    set.removeAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun ByteArray.subtract(other: Iterable<Byte>): Set<Byte> {
    val set = this.toMutableSet()
    set.removeAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun CharArray.subtract(other: Iterable<Char>): Set<Char> {
    val set = this.toMutableSet()
    set.removeAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun DoubleArray.subtract(other: Iterable<Double>): Set<Double> {
    val set = this.toMutableSet()
    set.removeAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun FloatArray.subtract(other: Iterable<Float>): Set<Float> {
    val set = this.toMutableSet()
    set.removeAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun IntArray.subtract(other: Iterable<Int>): Set<Int> {
    val set = this.toMutableSet()
    set.removeAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun LongArray.subtract(other: Iterable<Long>): Set<Long> {
    val set = this.toMutableSet()
    set.removeAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun ShortArray.subtract(other: Iterable<Short>): Set<Short> {
    val set = this.toMutableSet()
    set.removeAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun <T> Iterable<T>.subtract(other: Iterable<T>): Set<T> {
    val set = this.toMutableSet()
    set.removeAll(other)
    return set
}

/**
 * Returns a mutable set containing all distinct elements from the given collection.
 */
public fun <T> Array<out T>.toMutableSet(): MutableSet<T> {
    val set = LinkedHashSet<T>(size)
    for (item in this) set.add(item)
    return set
}

/**
 * Returns a mutable set containing all distinct elements from the given collection.
 */
public fun BooleanArray.toMutableSet(): MutableSet<Boolean> {
    val set = LinkedHashSet<Boolean>(size)
    for (item in this) set.add(item)
    return set
}

/**
 * Returns a mutable set containing all distinct elements from the given collection.
 */
public fun ByteArray.toMutableSet(): MutableSet<Byte> {
    val set = LinkedHashSet<Byte>(size)
    for (item in this) set.add(item)
    return set
}

/**
 * Returns a mutable set containing all distinct elements from the given collection.
 */
public fun CharArray.toMutableSet(): MutableSet<Char> {
    val set = LinkedHashSet<Char>(size)
    for (item in this) set.add(item)
    return set
}

/**
 * Returns a mutable set containing all distinct elements from the given collection.
 */
public fun DoubleArray.toMutableSet(): MutableSet<Double> {
    val set = LinkedHashSet<Double>(size)
    for (item in this) set.add(item)
    return set
}

/**
 * Returns a mutable set containing all distinct elements from the given collection.
 */
public fun FloatArray.toMutableSet(): MutableSet<Float> {
    val set = LinkedHashSet<Float>(size)
    for (item in this) set.add(item)
    return set
}

/**
 * Returns a mutable set containing all distinct elements from the given collection.
 */
public fun IntArray.toMutableSet(): MutableSet<Int> {
    val set = LinkedHashSet<Int>(size)
    for (item in this) set.add(item)
    return set
}

/**
 * Returns a mutable set containing all distinct elements from the given collection.
 */
public fun LongArray.toMutableSet(): MutableSet<Long> {
    val set = LinkedHashSet<Long>(size)
    for (item in this) set.add(item)
    return set
}

/**
 * Returns a mutable set containing all distinct elements from the given collection.
 */
public fun ShortArray.toMutableSet(): MutableSet<Short> {
    val set = LinkedHashSet<Short>(size)
    for (item in this) set.add(item)
    return set
}

/**
 * Returns a mutable set containing all distinct elements from the given collection.
 */
public fun <T> Iterable<T>.toMutableSet(): MutableSet<T> {
    return when (this) {
        is Collection<T> -> LinkedHashSet(this)
        else -> toCollection(LinkedHashSet<T>())
    }
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun <T> Array<out T>.union(other: Iterable<T>): Set<T> {
    val set = this.toMutableSet()
    set.addAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun BooleanArray.union(other: Iterable<Boolean>): Set<Boolean> {
    val set = this.toMutableSet()
    set.addAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun ByteArray.union(other: Iterable<Byte>): Set<Byte> {
    val set = this.toMutableSet()
    set.addAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun CharArray.union(other: Iterable<Char>): Set<Char> {
    val set = this.toMutableSet()
    set.addAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun DoubleArray.union(other: Iterable<Double>): Set<Double> {
    val set = this.toMutableSet()
    set.addAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun FloatArray.union(other: Iterable<Float>): Set<Float> {
    val set = this.toMutableSet()
    set.addAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun IntArray.union(other: Iterable<Int>): Set<Int> {
    val set = this.toMutableSet()
    set.addAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun LongArray.union(other: Iterable<Long>): Set<Long> {
    val set = this.toMutableSet()
    set.addAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun ShortArray.union(other: Iterable<Short>): Set<Short> {
    val set = this.toMutableSet()
    set.addAll(other)
    return set
}

/**
 * Returns a set containing all distinct elements from both collections.
 */
public fun <T> Iterable<T>.union(other: Iterable<T>): Set<T> {
    val set = this.toMutableSet()
    set.addAll(other)
    return set
}

