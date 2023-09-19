import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateSorterTest {

    private DateSorter dateSorter;

    @BeforeEach
    public void setUp() {
        dateSorter = new DateSorter();
    }

    @Test
    public void testSortDates() {
        List<LocalDate> unsortedDates = Arrays.asList(
                LocalDate.of(2005, 7, 1),
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2005, 1, 1),
                LocalDate.of(2005, 5, 3)
        );
        Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);
        List<LocalDate> expectedDates = Arrays.asList(
                LocalDate.of(2005, 1, 1),
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2005, 7, 1),
                LocalDate.of(2005, 5, 3)
        );
        assertEquals(expectedDates, sortedDates);
    }
}
