import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Schedule {
    List<Event>events;

    public Schedule() {
        this.events = new ArrayList<>();
    }
    public void addEvent(Event event){
        events.add(event);
    }
    public void printAllEvents(){
        if (events.isEmpty()) {
            System.out.println("Розклад порожній.");
        } else {
            for (Event event : events) {
                System.out.println(event);
            }
        }
    }
    public List<Event> getEventsByDate(LocalDate date){
        List<Event> filteredEvents = new ArrayList<>();
        for (Event event : events) {
            if (event.getDateTime().toLocalDate().equals(date)) {
                filteredEvents.add(event);
            }
        }
        return filteredEvents;
    }
    public void removePastEvents() {
        List<Event> updatedEvents = new ArrayList<>();
        LocalDateTime now = LocalDateTime.now();

        for (Event event : events) {
            if (!event.getDateTime().isBefore(now)) {
                updatedEvents.add(event);
            }
        }
        events.clear();
        events.addAll(updatedEvents);
    }
}
