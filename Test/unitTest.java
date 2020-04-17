import com.company.Converter;
import org.junit.Test;
import static org.junit.Assert.*;

public class unitTest {

DataProvider dataProvider = new DataProvider();
Converter converter = new Converter();


//  Asserts that the method returns the corresponding grade from DK to EU
    @Test
    public void test() {
        for (int i = 0; i < dataProvider.gradesDK.size(); i++) {
            assertEquals(converter.convert(dataProvider.gradesDK.get(i)),dataProvider.gradesEU.get(i));
        }
    }

// Assert that the

}
