package com.example.a8assignment;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class Fragmentti2ViewModel extends AndroidViewModel {

    private ListaRepository listaRepository;

    LiveData<List<MyEntity>> listLiveData;

    public Fragmentti2ViewModel(@NonNull Application application) {
        super(application);
        this.listaRepository = new ListaRepository(application);
        this.listLiveData = listaRepository.haeLista();

    }


}
