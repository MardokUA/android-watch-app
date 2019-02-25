package com.igorganapolsky.vibratingwatchapp.data.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;

/**
 * Timer entity (model).
 */
@Entity
public class Timer implements Serializable {
    /**
     * Timer id.
     */
    @PrimaryKey(autoGenerate = true)
    private int id;

    /**
     * Total time in milliseconds.
     */
    @ColumnInfo(name = "time")
    private long milliseconds;

    /**
     * Buzz mode.
     */
    @ColumnInfo(name = "buzz_mode")
    private int buzzMode;

    /**
     * Repeats count.
     */
    @ColumnInfo(name = "repeat")
    private int repeat;

    /**
     * Milliseconds left.
     */
    @ColumnInfo(name = "timestamp")
    private long timestamp;

    /**
     * Previous state.
     */
    @ColumnInfo(name = "state")
    private String state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(long milliseconds) {
        this.milliseconds = milliseconds;
    }

    public int getBuzzMode() {
        return buzzMode;
    }

    public void setBuzzMode(int buzzMode) {
        this.buzzMode = buzzMode;
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
