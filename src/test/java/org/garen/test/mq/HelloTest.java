package org.garen.test.mq;


import org.garen.operation.rpc.mq.listener.HelloListener;
import org.garen.operation.rpc.mq.publish.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTest {
    @Autowired
    private HelloSender sender;
    @Test
    public void hello() throws Exception {
        sender.send();
    }
}