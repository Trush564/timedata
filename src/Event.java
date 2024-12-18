
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event {
    String name;
    LocalDateTime dateTime;
    String location;

    public Event(String name, LocalDateTime dateTime, String location) {
        this.name = name;
        this.dateTime = dateTime;
        this.location = location;
    }
    public LocalDateTime getDateTime(){
        return dateTime;
    }

    @Override
    public String toString() {

        return "Event{" +
                "name='" + name + '\'' +
                ", dateTime=" + dateTime +
                ", location='" + location + '\'' +
                '}';
    }
}
