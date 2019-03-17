package com.igorganapolsky.vibratingwatchapp.domain.model;

public class RepeatSetup {

    private final int count;
    private boolean isSelected;

    public RepeatSetup(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
