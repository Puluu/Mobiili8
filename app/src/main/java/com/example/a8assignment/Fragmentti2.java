package com.example.a8assignment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class Fragmentti2 extends Fragment {

    private Fragmentti2ViewModel mViewModel;

    private ListView listView;
    ArrayAdapter<String> arrayAdapter;

    public static Fragmentti2 newInstance() {
        return new Fragmentti2();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragmentti2_fragment, container, false);
        this.listView = v.findViewById(R.id.listView1);
        arrayAdapter = new ArrayAdapter<>(getActivity().getApplicationContext(), android.R.layout.simple_list_item_1);
        listView.setAdapter(arrayAdapter);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ViewModelProvider viewModelProvider = new ViewModelProvider(this);
        this.mViewModel = viewModelProvider.get(Fragmentti2ViewModel.class);
        this.mViewModel.listLiveData.observe(getViewLifecycleOwner(), new Observer<List<MyEntity>>() {
            @Override
            public void onChanged(List<MyEntity> myEntities) {
                for (MyEntity t : myEntities){
                    String s = "";
                    s = s + t.teksti;
                    arrayAdapter.add(s);
                }
            }
        });


        }

}

