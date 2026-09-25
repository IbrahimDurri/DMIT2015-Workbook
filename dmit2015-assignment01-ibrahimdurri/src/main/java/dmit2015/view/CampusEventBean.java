package dmit2015.view;

import dmit2015.model.CampusEvent;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class CampusEventBean implements Serializable {

    private String eventName;
    private String organizerName;
    private LocalDate eventDate;
    private Double capacity;

    private int nextEventId = 2601;

    private final List<CampusEvent> events = new ArrayList<>();

    public String createEvent() {

        CampusEvent event = new CampusEvent(
                nextEventId++,
                eventName,
                organizerName,
                eventDate,
                capacity.intValue()
        );

        events.add(event);

        FacesContext.getCurrentInstance()
                .getExternalContext()
                .getFlash()
                .setKeepMessages(true);

        FacesContext.getCurrentInstance().addMessage(
                null,
                new FacesMessage(
                        FacesMessage.SEVERITY_INFO,
                        "Success",
                        "Event created successfully."
                )
        );

        clearForm();

        return "view-events?faces-redirect=true";
    }

    private void clearForm() {
        eventName = null;
        organizerName = null;
        eventDate = null;
        capacity = null;
    }

    public List<CampusEvent> getEvents() {
        return events;
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

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }
}