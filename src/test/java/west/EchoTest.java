package west;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EchoTest {

    @Test
    public void echoEchoesString() {
        String echo = Echo.echo();
        assertEquals("echo!", echo);
    }
}