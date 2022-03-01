import kotlin.test.Test
import kotlin.test.assertEquals

internal class FindSevenishNumberKtTest {

    @Test
    fun findSevenishNumberExample1() {
        assertEquals(1, findSevenishNumber(1))
    }
    @Test
    fun findSevenishNumberExample2() {
        assertEquals(7, findSevenishNumber(2))
    }
    @Test
    fun findSevenishNumberExample3() {
        assertEquals(8, findSevenishNumber(3))
    }
    @Test
    fun findSevenishNumberExample4() {
        assertEquals(49, findSevenishNumber(4))
    }
}