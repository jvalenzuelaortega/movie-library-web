package cl.mycompany.movielibraryweb.unitary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageTest {

    @Test
    public void helloWorldMessageTest(){
        String message = "Hello World";
        assertEquals("Hello World", message);
    }
}
