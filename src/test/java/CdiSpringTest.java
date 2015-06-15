import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.smallpawn.example.MessageManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("/application-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext
public class CdiSpringTest {

    @Autowired
    private MessageManager messageManager;

    /**
     * CDI Spring implementation based on http://niklasschlimm.blogspot.com.es/2011/08/jsr-299-cdi-interceptors-for-spring.html
     */
    @Test
    public void springContextCDITest() {
        String msg1 = "This is a message that should be printed, because it is 75 characters long";
        String msg2 = "This is a message that should NOT be printed, because it is more than 75 characters long";
        String msg3 = "This is a message that should be printed";
        String result1 = messageManager.prepareMessage(msg1);
        String result2 = messageManager.prepareMessage(msg2);
        String result3 = messageManager.prepareMessage(msg3);
        Assert.assertEquals(msg1.toLowerCase(), result1);
        Assert.assertEquals(null, result2);
        Assert.assertEquals(msg3.toLowerCase(), result3);
    }
}
