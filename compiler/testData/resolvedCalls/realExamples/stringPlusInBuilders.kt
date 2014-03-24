// !CALL: +
// !EXPLICIT_RECEIVER_KIND: RECEIVER_ARGUMENT
// !THIS_OBJECT: Title
// !RECEIVER_ARGUMENT: "Foo"

trait Element {
    fun render(builder: StringBuilder, indent: String)
}

class TextElement(val text: String): Element {
    override fun render(builder: StringBuilder, indent: String): Unit = fail
}

abstract class Tag(val name: String): Element {
    protected fun initTag<T: Element>(tag: T, init: T.() -> Unit): T = fail

    override fun render(builder: StringBuilder, indent: String): Unit = fail
}

abstract class TagWithText(name: String): Tag(name) {
    fun String.plus() {}
}

class HTML(): TagWithText("html") {
    fun head(init: Head.() -> Unit): Head = fail

}

class Head(): TagWithText("head") {
    fun title(init: Title.() -> Unit): Title = fail
}

class Title(): TagWithText("title")

fun html(init: HTML.() -> Unit): HTML = fail

fun result() =
        html {
            head {
                title {+"Foo"}
            }
        }

val fail: Nothing get() = throw Exception()