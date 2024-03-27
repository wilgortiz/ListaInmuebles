package com.wilgon.listainmuebles.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.ListView;

import com.wilgon.listainmuebles.R;
import com.wilgon.listainmuebles.databinding.ActivityMainBinding;
import com.wilgon.listainmuebles.modelo.Inmueble;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    //private ArrayList<Inmueble> lista=new ArrayList<>();
    private ActivityMainBinding binding;
    private MainActivityViewModel mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mv = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);
        mv.getInmuebleMutable().observe(this, new Observer<List<Inmueble>>() {
            @Override
            public void onChanged(List<Inmueble> inmuebles) {
                InmuebleAdapter ia = new InmuebleAdapter(MainActivity.this, R.layout.item, inmuebles, getLayoutInflater());
                ListView lv = binding.miLista;
                lv.setAdapter(ia);
            }
        });
        mv.crearLista();
    }
}