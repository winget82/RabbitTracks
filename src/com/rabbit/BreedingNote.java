package com.rabbit;

import java.sql.Date;

public class BreedingNote {
    private Date breedDateTime;
    private String buckName;
    private String doeName;
    private String notes;
    private int falloffs;
    private Date nestBoxDate;//25 days from breedDateTime
    private Date dueDate;//31 days from breedDateTime
    private String results;
    private String litterName;

    public BreedingNote(Date breedDateTime, String buckName, String doeName, String notes, int falloffs){
        this.breedDateTime = breedDateTime;
        this.buckName = buckName;
        this.doeName = doeName;
        this.notes = notes;
        this.falloffs = falloffs;
    }

    public Date getBreedDateTime() {
        return breedDateTime;
    }

    public void setBreedDateTime(Date breedDateTime) {
        this.breedDateTime = breedDateTime;
    }

    public String getBuckName() {
        return buckName;
    }

    public void setBuckName(String buckName) {
        this.buckName = buckName;
    }

    public String getDoeName() {
        return doeName;
    }

    public void setDoeName(String doeName) {
        this.doeName = doeName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getFalloffs() {
        return falloffs;
    }

    public void setFalloffs(int falloffs) {
        this.falloffs = falloffs;
    }

    public Date getNestBoxDate() {
        return nestBoxDate;
    }

    public void setNestBoxDate(Date nestBoxDate) {
        this.nestBoxDate = nestBoxDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public String getLitterName() {
        return litterName;
    }

    public void setLitterName(String litterName) {
        this.litterName = litterName;
    }
}
