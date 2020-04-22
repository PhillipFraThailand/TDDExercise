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
    // Note We are using Junit 4 that dosent come with the assertThrow function so we worked our way around it
    // By using the default mechanic in switch case to cover everything but the legal cases and then check that
    // that the invalid cases from the dataprovider triggers the default message - there's no need to crash the
    // program
    @Test
    public void invalidDKValuesTest() {
        for (int i = 0; i < dataProvider.InvalidDKValues.size(); i++) {
            assertEquals(converter.convert(dataProvider.InvalidDKValues.get(i)), "Error");
        }
    }
    //Assert that the invalid values are throwing an error
    // Note we are using Junit 4 that dosent come with the assertThrow function so we worked our way arounnd it
    // By using the default mechanic in switch case to cover everything but the legal cases and then check that
    // that the invalid cases from the dataprovider trigger the default message -  There's no need to chrash the
    // Program
    @Test
    public void invalidEUValuesTest() {
        for (int i = 0; i < dataProvider.InvalidEUValues.size(); i++) {
            assertEquals(converter.convert(dataProvider.InvalidEUValues.get(i)), "Error");
        }
    }


}
