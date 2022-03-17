import org.junit.jupiter.api.Test

/**
 * @author yanni
 * @date time 2022/3/17 23:26
 * @modified By:
 *
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}
class PrintTest {
    @Test
    fun testPrint() {
        println("zzzzzz")
        print(sum(3,4))
    }
}