import static org.junit.Assert.*;
import org.junit.Test;

public class SumOfDividedTest {

    @Test
    public void testOne() {

        int[] lst = new int[] {12, 15};
        assertEquals("(2 12)(3 27)(5 15)", SumOfDivided.sumOfDivided(lst));

        lst = new int[] {107, 158, 204, 100, 118, 123, 126, 110, 116, 100};
        assertEquals("(2 1032)(3 453)(5 310)(7 126)(11 110)(17 204)(29 116)(41 123)(59 118)(79 158)(107 107)", SumOfDivided.sumOfDivided(lst));

//        lst = new int[] {100000, 1000000};
//        assertEquals("(2 1100000)(5 1100000)", SumOfDivided.sumOfDivided(lst));

    }
}
