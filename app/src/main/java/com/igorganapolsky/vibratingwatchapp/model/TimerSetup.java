package com.igorganapolsky.vibratingwatchapp.model;

public enum TimerSetup {
    HOURS("H", 12.), MINUTES("M", 59.), SECONDS("S", 59.);

    private String shortcut;
    private double measure;

    TimerSetup(String shortcut, double measure) {
        this.shortcut = shortcut;
        this.measure = measure;
    }

    public String getShortcut() {
        return shortcut;
    }

    public double getMeasure() {
        return measure;
    }
}
