package com.example.a8assignment;

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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

public class Fragmentti extends Fragment {

    private FragmenttiViewModel mViewModel;

    private EditText editText;
    private Button button;
    ListView listView;
    ArrayAdapter<String> arrayAdapter;

    public static Fragmentti newInstance() {
        return new Fragmentti();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragmentti_fragment,container, false);

        this.editText = v.findViewById(R.id.editText1);
        this.button = v.findViewById(R.id.button1);
        //arrayAdapter = new ArrayAdapter<>(getActivity().getApplicationContext(), android.R.layout.simple_list_item_1);
        //listView.setAdapter(arrayAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewModel.insert(editText.getText().toString());
            }
        });
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ViewModelProvider viewModelProvider = new ViewModelProvider(this);
        this.mViewModel = viewModelProvider.get(FragmenttiViewModel.class);

    }

}
