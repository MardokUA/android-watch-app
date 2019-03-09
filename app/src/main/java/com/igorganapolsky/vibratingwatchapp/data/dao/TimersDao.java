package com.igorganapolsky.vibratingwatchapp.data.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.*;
import com.igorganapolsky.vibratingwatchapp.data.models.Timer;

import java.util.List;

@Dao
public interface TimersDao {

    @Query("SELECT * FROM timer")
    LiveData<List<Timer>> getAll();

    @Query("SELECT * FROM timer WHERE id = :id")
    Timer getById(int id);

    @Insert
    void insert(Timer task);

    @Delete
    void delete(Timer task);

    @Update
    void update(Timer task);
}
