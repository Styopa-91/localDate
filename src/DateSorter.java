import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class DateSorter {

    /**
     * The implementation of this method should sort dates.
     * The output should be in the following order:
     * Dates with an 'r' in the month,
     * sorted ascending (first to last),
     * then dates without an 'r' in the month,
     * sorted descending (last to first).
     * For example, October dates would come before May dates,
     * because October has an 'r' in it.
     * thus: (2004-07-01, 2005-01-02, 2007-01-01, 2032-05-03)
     * would sort to
     * (2005-01-02, 2007-01-01, 2032-05-03, 2004-07-01)
     *
     * @param unsortedDates - an unsorted list of dates
     * @return the collection of dates now sorted as per the spec
     */
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        List<LocalDate> listWithR = new ArrayList<>();
        List<LocalDate> listWithoutR = new ArrayList<>();
        List<LocalDate> resultList = new ArrayList<>();
        char r = 'R';

        for (LocalDate localDate : unsortedDates) {
            String month = localDate.getMonth().toString();
            if (month.contains(Character.toString(r))) {
                listWithR.add(localDate);
            } else {
                listWithoutR.add(localDate);
            }
        }
        listWithR.sort(null);
        listWithoutR.sort(Comparator.reverseOrder());
        resultList.addAll(listWithR);
        resultList.addAll(listWithoutR);

        return resultList;
    }
}