package com.example.a8assignment;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MyTableDao {
    @Query("select * from myentity order by id desc")
    LiveData<List<MyEntity>> getAllInDescendingOrder();

    @Insert
    void InsertMyEntity(MyEntity myEntity);
}
