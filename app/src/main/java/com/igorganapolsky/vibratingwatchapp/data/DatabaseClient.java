package com.igorganapolsky.vibratingwatchapp.data;

import android.arch.persistence.room.Room;
import android.content.Context;
import com.igorganapolsky.vibratingwatchapp.data.db.TimersDatabase;

public class DatabaseClient {

    private static DatabaseClient instance;
    private TimersDatabase timersDatabase;

    private DatabaseClient(Context context) {
        timersDatabase = Room.databaseBuilder(context, TimersDatabase.class, "TimersDatabase")
            .allowMainThreadQueries()
            .build();
    }

    public static synchronized DatabaseClient getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseClient(context);
        }
        return instance;
    }

    public TimersDatabase getTimersDatabase() {
        return timersDatabase;
    }
}
