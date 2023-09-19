import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DateSorter {

    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        Comparator<LocalDate> dateCustomComparator = (date1, date2) -> {
            boolean hasRInMonth1 = date1.getMonth().toString().toLowerCase().contains("r");
            boolean hasRInMonth2 = date2.getMonth().toString().toLowerCase().contains("r");

            if (hasRInMonth1 && hasRInMonth2) {
                return date1.compareTo(date2);
            } else if (hasRInMonth1) {
                return -1;
            } else if (hasRInMonth2) {
                return 1;
            } else {
                return date2.compareTo(date1);
            }
        };

        return unsortedDates.stream()
                .sorted(dateCustomComparator)
                .collect(Collectors.toList());
    }
}
