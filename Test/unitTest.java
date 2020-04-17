import org.junit.Test;
import static org.junit.Assert.*;

public class unitTest {

DataProvider dataProvider = new DataProvider();


//  Asserts that the method returns the corresponding grade from DK to EU
    @Test
    public void test() {

        for (int i = 0; i < dataProvider.GradesDK.size(); i++) {
            assertEquals(Convert(dataProvider.GradesDK),Grades );

        }
    }
}
