import Lesson_3_6.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class test {
    private boolean a;
    private byte[] b;
    private Main main;

    @Before
    public void init() {
        main = new Main();
    }

    public test(boolean a, byte[] b) {
        this.a = a;
        this.b = b;
    }

    @Test
    public void testFour() {
        Assert.assertArrayEquals(new int[]{5, 6, 3}, main.array4(new int[]{2, 3, 6, 4, 3, 2, 4, 5, 6, 3}));
    }

    @Test(expected = RuntimeException.class)
    public void testEx(){
        main.array4(new int[]{3, 2, 3, 5, 7});
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {true, new byte[]{1, 4, 1, 4, 1, 1}},
                {true, new byte[]{1, 4, 4}},
                {false, new byte[]{4, 4, 4}},
                {false, new byte[]{1, 1, 1}},
                {false, new byte[]{1, 4, 3, 1, 4}}
        });
    }

    @Test
    public void testArr4_1() {
        Assert.assertEquals(a, main.array4_1(b));
    }
}
