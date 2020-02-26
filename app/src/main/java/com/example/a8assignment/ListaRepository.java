package com.example.a8assignment;

import android.app.Application;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.room.Room;

import java.util.List;

public class ListaRepository {

    private MyTableDao myTableDao;
    private LiveData<List<MyEntity>> listaLivedata;

    public ListaRepository(Application application){
        Database t = Room.databaseBuilder(application.getApplicationContext(), Database.class, Database.NIMI).allowMainThreadQueries().build();
        this.myTableDao = t.myTableDao();
        this.listaLivedata = myTableDao.getAllInDescendingOrder();
    }

    public LiveData<List<MyEntity>> haeLista() {
        return listaLivedata;
    }

    public void insert(String teksti) {
        MyEntity myEntity = new MyEntity();
        myEntity.teksti = teksti;
        myTableDao.InsertMyEntity(myEntity);
        Log.wtf("asdasd", "asdasd");
    }
}
