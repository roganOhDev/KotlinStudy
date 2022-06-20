package C_6

import org.junit.Before

class MyService {
    fun performAction(): String = "foo"
}

class MyTest {
    private lateinit var myService: MyService

    @Before
    fun setUp() {
        myService = MyService()
    }
}