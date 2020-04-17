import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DataProvider {

    // The possible grades
    ArrayList<String> gradesDK = new ArrayList<String>(Arrays.asList("-3", "00", "02", "4", "7", "10", "12"));
    ArrayList<String> gradesEU = new ArrayList<String>(Arrays.asList("F", "Fx", "E", "D", "C", "B", "A"));

    // Test Cases
    ArrayList<String> InvalidDKValues = new ArrayList<String>(Arrays.asList("-4", "-02", "01", "A", "5", "11", "13"));
    ArrayList<String> InvalidEUValues = new ArrayList<String>(Arrays.asList("F-", "S", "1", "Å", "F,Fx", "?", "00.02", "", "00"));


}
