/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.events.model;

import java.util.Date;
import java.util.Set;

/**
 *
 * @author Vijay
 */
public class Event {
    
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    /**
     * @return the attendees
     */
    public Set<Attendee> getAttendees() {
        return attendees;
    }

    /**
     * @param attendees the attendees to set
     */
    public void setAttendees(Set<Attendee> attendees) {
        this.attendees = attendees;
    }

    /**
     * @return the speakers
     */
    public Set<Speaker> getSpeakers() {
        return speakers;
    }

    /**
     * @param speakers the speakers to set
     */
    public void setSpeakers(Set<Speaker> speakers) {
        this.speakers = speakers;
    }
    
    /**
     * @return the speakers
     */
    public Location getLocation() {
        return location;
    }

    /**
     * @param speakers the speakers to set
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    private long id;
    private String name;
    private Date startDate;
    private int duration;
    private Set<Attendee> attendees;
    private Set<Speaker> speakers;
    private Location location;

}
