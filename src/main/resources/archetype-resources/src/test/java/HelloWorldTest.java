package ${package};

import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

    HelloWorld helloWorld;

    @Before
    public void setUp() {
        helloWorld = new HelloWorld();
    }


    @Test
    public void say_hello() {
        assertNotNull(helloWorld.sayHello("Java"));
    }
}