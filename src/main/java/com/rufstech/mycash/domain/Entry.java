package com.rufstech.mycash.domain;

import java.time.LocalDate;

public class Entry {

    private String description;
    private Double value;
    private LocalDate date;
    private EntryType type;

    /**
     * @return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return Double return the value
     */
    public Double getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * @return LocalDate return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * @return EntryType return the type
     */
    public EntryType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(EntryType type) {
        this.type = type;
    }

}