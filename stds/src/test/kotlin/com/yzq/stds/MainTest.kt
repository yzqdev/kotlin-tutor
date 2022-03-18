import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/**
 * @author yanni
 * @date time 2022/3/17 23:17
 * @modified By:
 */

data class Customer(val name: String, val email: String)
internal class MainTest{
    @Test
    fun testMain(){
        assertEquals(1,1)
        print("hhlllll")
    }
    @Test
    fun testDataClass() {
        val customer = Customer("yanni", "yzqdev@outlook.com")
        assertEquals("yanni", customer.name)
    }
}