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
            assertEquals(converter.convert(dataProvider.gradesDK.get(i)), dataProvider.gradesEU.get(i));
        }
    }

    // Assert that the invalid values are throwing an error
    // Note: We are using Junit4 that doesn't have the assertThrow function, so we had to use the
    // default mechanic in the switch case to cover everything but the legal cases, and then check that
    // the invalid cases from the dataprovider triggers the default message - there's no need to crash the
    // program
    @Test
    public void invalidDKValuesTest() {
        for (int i = 0; i < dataProvider.InvalidDKValues.size(); i++) {
            assertEquals(converter.convert(dataProvider.InvalidDKValues.get(i)), "Error");
        }
    }

    //Assert that the invalid values are throwing an error
    @Test
    public void invalidEUValuesTest() {
        for (int i = 0; i < dataProvider.InvalidEUValues.size(); i++) {
            assertEquals(converter.convert(dataProvider.InvalidEUValues.get(i)), "Error");
        }
    }


}
