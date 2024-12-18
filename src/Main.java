//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Schedule schedule = new Schedule();

        schedule.addEvent(new Event("Захід1", LocalDateTime.of(2024, 12, 19, 12, 0), "Локація1"));
        schedule.addEvent(new Event("Захід2", LocalDateTime.of(2024, 12, 18, 13, 0), "Локація2"));
        schedule.addEvent(new Event("Захід3", LocalDateTime.of(2024, 12, 17, 21, 0), "Локація3"));
        schedule.addEvent(new Event("Захід4", LocalDateTime.of(2024, 12, 16, 22, 0), "Локація4"));

        System.out.println("Всі заходи:");
        schedule.printAllEvents();

        LocalDate filterDate = LocalDate.of(2024, 12, 19);
        System.out.println("Заходи на дату " + filterDate + ":");
        List<Event> eventsByDate = schedule.getEventsByDate(filterDate);
        for (Event event : eventsByDate) {
            System.out.println(event);
        }

        System.out.println("Видалення минулих заходів");
        schedule.removePastEvents();

        System.out.println("Оновлений розклад:");
        schedule.printAllEvents();
    }
}