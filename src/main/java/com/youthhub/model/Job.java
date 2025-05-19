package com.youthhub.model;

public class Job {
    private String title;
    private String location;
    private String deadline;

    public Job(String title, String location, String deadline) {
        this.title = title;
        this.location = location;
        this.deadline = deadline;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getDeadline() { return deadline; }
    public void setDeadline(String deadline) { this.deadline = deadline; }
}
