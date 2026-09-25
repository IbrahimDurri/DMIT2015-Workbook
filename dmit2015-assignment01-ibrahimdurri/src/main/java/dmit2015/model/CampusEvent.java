package dmit2015.model;

import java.time.LocalDate;

public class CampusEvent {
    private int eventId;
    private String eventName;
    private String organizerName;
    private LocalDate eventDate;
    private int capacity;

    public CampusEvent() {
    }

    public CampusEvent(int eventId, String eventName, String organizerName,
                       LocalDate eventDate, int capacity) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.organizerName = organizerName;
        this.eventDate = eventDate;
        this.capacity = capacity;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getOrganizerName() {
        return organizerName;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getEventSummary() {
        return eventName + " - " + eventDate;
    }
}
