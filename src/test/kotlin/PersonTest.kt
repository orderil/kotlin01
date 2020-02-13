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
        assertTrue(Person("Igor", 51, true).olderThan(Person("John", 40, false)))
    }

    @Test
    fun someTest2() {
        assertFalse(Person("John", 40, false).olderThan(Person("Igor", 51, true)))
    }

}
