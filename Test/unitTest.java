import com.company.Converter;
import org.junit.Test;
import static org.junit.Assert.*;

public class unitTest {

DataProvider dataProvider = new DataProvider();
Converter converter = new Converter();


//  Asserts that the method returns the corresponding grade from DK to EU
    @Test
    public void test() {
        for (int i = 0; i < dataProvider.GradesDK.size(); i++) {
            System.out.println(dataProvider.GradesDK.get(i));
            assertEquals(converter.convert(dataProvider.GradesDK.get(i)),dataProvider.GradesEU.get(i));

        }
    }
}
