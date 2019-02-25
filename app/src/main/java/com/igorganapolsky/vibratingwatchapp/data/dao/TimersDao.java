package com.igorganapolsky.vibratingwatchapp.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.igorganapolsky.vibratingwatchapp.data.models.Timer;

import java.util.List;

/**
 * Data Access Object class provides methods to operate database objects.
 */
@Dao
public interface TimersDao {

    /**
     * Getting list of Timer objects.
     *
     * @return timer list.
     */
    @Query("SELECT * FROM timer")
    List<Timer> getAll();

    /**
     * Geting one {@link Timer} object by id.
     *
     * @param id an id of timer.
     * @return null or {@link Timer} instance.
     */
    @Query("SELECT * FROM timer WHERE id = :id")
    List<Timer> getById(int id);

    /**
     * Inserting new object to database.
     *
     * @param timer object to insert.
     */
    @Insert
    void insert(Timer timer);

    /**
     * Deleting object from database.
     *
     * @param timer object to delete.
     */
    @Delete
    void delete(Timer timer);

    /**
     * Updating object in database.
     *
     * @param timer object to update.
     */
    @Update
    void update(Timer timer);
}
