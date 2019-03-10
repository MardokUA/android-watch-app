package com.igorganapolsky.vibratingwatchapp.domain.model;

import java.util.Locale;
import java.util.Objects;

public class TimerModel {

    public static TimerModel fetchWith(TimerModel activeModel) {
        return null;
    }

    public enum State {RUN, PAUSE, FINISH}

    private int id;
    private int buzz;
    private int repeat;

    private int hoursTotal;
    private int minutesTotal;
    private int secondsTotal;

    private int hoursLeft;
    private int minutesLeft;
    private int secondsLeft;

    private State state = State.FINISH;

    public TimerModel() {
        this(0, 0, 0);
    }

    public TimerModel(int hoursTotal, int minutesTotal, int secondsTotal) {
        this.hoursTotal = hoursTotal;
        this.minutesTotal = minutesTotal;
        this.secondsTotal = secondsTotal;
    }

    public int getHoursTotal() {
        return hoursTotal;
    }

    public void setHoursTotal(int hoursTotal) {
        this.hoursTotal = hoursTotal;
    }

    public int getMinutesTotal() {
        return minutesTotal;
    }

    public void setMinutesTotal(int minutesTotal) {
        this.minutesTotal = minutesTotal;
    }

    public int getSecondsTotal() {
        return secondsTotal;
    }

    public void setSecondsTotal(int secondsTotal) {
        this.secondsTotal = secondsTotal;
    }

    public int getBuzz() {
        return buzz;
    }

    public void setBuzz(int buzz) {
        this.buzz = buzz;
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public int getHoursLeft() {
        return hoursLeft;
    }

    public void setHoursLeft(int hoursLeft) {
        this.hoursLeft = hoursLeft;
    }

    public int getMinutesLeft() {
        return minutesLeft;
    }

    public void setMinutesLeft(int minutesLeft) {
        this.minutesLeft = minutesLeft;
    }

    public int getSecondsLeft() {
        return secondsLeft;
    }

    public void setSecondsLeft(int secondsLeft) {
        this.secondsLeft = secondsLeft;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getValue(TimerSetup timerSetup) {
        switch (timerSetup) {
            case HOURS:
                return getHoursTotal();
            case MINUTES:
                return getMinutesTotal();
            case SECONDS:
                return getSecondsTotal();
        }
        return -1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDefaultTime() {
        return hoursTotal == 0 && minutesTotal == 0 && secondsTotal == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimerModel model = (TimerModel) o;
        return id == model.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "%02d : %02d : %02d", hoursTotal, minutesTotal, secondsTotal);
    }
}
