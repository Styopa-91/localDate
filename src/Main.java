import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DateSorter dateSorter = new DateSorter();

        LocalDate localDate1 = LocalDate.now().plusYears(2);
        LocalDate localDate2 = LocalDate.now().plusMonths(1).minusYears(1);
        LocalDate localDate3 = LocalDate.now().plusMonths(2).minusYears(2);
        LocalDate localDate4 = LocalDate.now().plusMonths(5).plusYears(3);

        List<LocalDate> rez = (List<LocalDate>) dateSorter.sortDates(Arrays.asList(localDate1, localDate2, localDate3, localDate4));
        for (LocalDate r : rez) {
            System.out.println(r);
        }
    }
}