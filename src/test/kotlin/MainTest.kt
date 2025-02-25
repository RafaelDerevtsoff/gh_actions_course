import org.junit.jupiter.api.Test
import org.study.add
import kotlin.test.assertEquals

class MainTest {
    @Test
    fun testAdd() {
        assertEquals(112, add(2, 3))
    }
}
