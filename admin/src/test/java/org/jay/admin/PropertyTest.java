package org.jay.admin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PropertyTest {
    @Value("${server.port}")
    public int port;


    @Test
    public void testPort () {
    }
}
