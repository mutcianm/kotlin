// Auto-generated by org.jetbrains.jet.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
import java.util.ArrayList
import java.lang as j

fun box(): String {
    val list1 = ArrayList<Double>()
    for (i in j.Double.NaN..5.0) {
        list1.add(i)
        if (list1.size() > 23) break
    }
    if (list1 != listOf<Double>()) {
        return "Wrong elements for j.Double.NaN..5.0: $list1"
    }

    val list2 = ArrayList<Float>()
    for (i in j.Float.NaN.toFloat()..5.0.toFloat()) {
        list2.add(i)
        if (list2.size() > 23) break
    }
    if (list2 != listOf<Float>()) {
        return "Wrong elements for j.Float.NaN.toFloat()..5.0.toFloat(): $list2"
    }

    val list3 = ArrayList<Double>()
    for (i in j.Double.NaN downTo 0.0) {
        list3.add(i)
        if (list3.size() > 23) break
    }
    if (list3 != listOf<Double>()) {
        return "Wrong elements for j.Double.NaN downTo 0.0: $list3"
    }

    val list4 = ArrayList<Float>()
    for (i in j.Float.NaN.toFloat() downTo 0.0.toFloat()) {
        list4.add(i)
        if (list4.size() > 23) break
    }
    if (list4 != listOf<Float>()) {
        return "Wrong elements for j.Float.NaN.toFloat() downTo 0.0.toFloat(): $list4"
    }

    val list5 = ArrayList<Double>()
    for (i in 0.0..j.Double.NaN) {
        list5.add(i)
        if (list5.size() > 23) break
    }
    if (list5 != listOf<Double>()) {
        return "Wrong elements for 0.0..j.Double.NaN: $list5"
    }

    val list6 = ArrayList<Float>()
    for (i in 0.0.toFloat()..j.Float.NaN) {
        list6.add(i)
        if (list6.size() > 23) break
    }
    if (list6 != listOf<Float>()) {
        return "Wrong elements for 0.0.toFloat()..j.Float.NaN: $list6"
    }

    val list7 = ArrayList<Double>()
    for (i in 5.0 downTo j.Double.NaN) {
        list7.add(i)
        if (list7.size() > 23) break
    }
    if (list7 != listOf<Double>()) {
        return "Wrong elements for 5.0 downTo j.Double.NaN: $list7"
    }

    val list8 = ArrayList<Float>()
    for (i in 5.0.toFloat() downTo j.Float.NaN) {
        list8.add(i)
        if (list8.size() > 23) break
    }
    if (list8 != listOf<Float>()) {
        return "Wrong elements for 5.0.toFloat() downTo j.Float.NaN: $list8"
    }

    val list9 = ArrayList<Double>()
    for (i in j.Double.NaN..j.Double.NaN) {
        list9.add(i)
        if (list9.size() > 23) break
    }
    if (list9 != listOf<Double>()) {
        return "Wrong elements for j.Double.NaN..j.Double.NaN: $list9"
    }

    val list10 = ArrayList<Float>()
    for (i in j.Float.NaN..j.Float.NaN) {
        list10.add(i)
        if (list10.size() > 23) break
    }
    if (list10 != listOf<Float>()) {
        return "Wrong elements for j.Float.NaN..j.Float.NaN: $list10"
    }

    val list11 = ArrayList<Double>()
    for (i in j.Double.NaN downTo j.Double.NaN) {
        list11.add(i)
        if (list11.size() > 23) break
    }
    if (list11 != listOf<Double>()) {
        return "Wrong elements for j.Double.NaN downTo j.Double.NaN: $list11"
    }

    val list12 = ArrayList<Float>()
    for (i in j.Float.NaN downTo j.Float.NaN) {
        list12.add(i)
        if (list12.size() > 23) break
    }
    if (list12 != listOf<Float>()) {
        return "Wrong elements for j.Float.NaN downTo j.Float.NaN: $list12"
    }

    return "OK"
}