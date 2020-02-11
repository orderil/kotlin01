import com.ilazarev.kotlin.quickstart.Person
import org.junit.Assert.assertTrue
import org.junit.Assert.assertFalse
import org.junit.Test

/**
 * Unit tests for the EmailValidator logic.
 */
class PersonTest {

    @Test
    fun someTest1() {
        assertFalse(Person("Igor", 51, true).isOlder(Person("John", 40, false)))
    }

    @Test
    fun someTest2() {
        assertTrue(Person("John", 40, false).isOlder(Person("Igor", 51, true)))
    }

}
