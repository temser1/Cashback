import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.service.CashBackService;


public class CashBackServiceTest {
    CashBackService hacker = new CashBackService();


    @Test
    public void calculateRemainFrom900() {
        int actual = hacker.remain(900);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateRemainFrom999() {
        int actual = hacker.remain(999);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateRemainFrom1() {
        int actual = hacker.remain(1);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateRemainFrom2222() {
        int actual = hacker.remain(2222);
        int expected = 778;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateRemainFrom1000() {
        int actual = hacker.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

}