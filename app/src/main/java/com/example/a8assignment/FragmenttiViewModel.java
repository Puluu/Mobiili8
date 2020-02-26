package com.example.a8assignment;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class FragmenttiViewModel extends AndroidViewModel {

    private ListaRepository listaRepository;

    LiveData<List<MyEntity>> listLiveData;

    public FragmenttiViewModel(@NonNull Application application) {
        super(application);
        this.listaRepository = new ListaRepository(application);
        this.listLiveData = listaRepository.haeLista();

    }
    public void insert(String teksti) {listaRepository.insert(teksti);}
}
