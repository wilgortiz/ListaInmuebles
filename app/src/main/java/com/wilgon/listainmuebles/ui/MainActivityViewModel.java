package com.wilgon.listainmuebles.ui;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.wilgon.listainmuebles.R;
import com.wilgon.listainmuebles.modelo.Inmueble;

import java.util.ArrayList;
import java.util.List;

//generar la lista de inmuebels, el metodo publico
// que sea accedido desde la vista (arma la lista de inmubeles) y mutable que lo informe al activity
//va a haber un observer para que cuando reciba la lista lo infle en el listView
public class MainActivityViewModel extends AndroidViewModel {
    private MutableLiveData<List<Inmueble>> inmueblesMutable;
    public MainActivityViewModel(@NonNull Application application) {super(application);
        // listaInmuebles = new MutableLiveData<>();
        // cargarDatos();
    }

    public LiveData<List<Inmueble>> getInmuebleMutable(){
        if (inmueblesMutable==null){
            this.inmueblesMutable=new MutableLiveData();

        }
        return inmueblesMutable;
    }
    public void crearLista(){
        ArrayList<Inmueble> lista=new ArrayList<>();
        // Arraylist<Inmueble> lista= new Arraylist<>();
        lista.add(new Inmueble(R.drawable.casa1,"La florida", 100000));
        lista.add(new Inmueble(R.drawable.casa2,"Potrero de los funes", 110000));
        lista.add(new Inmueble(R.drawable.casa3,"Juana Koslay", 120000));
        lista.add(new Inmueble(R.drawable.casa4,"Merlo", 110000));
        inmueblesMutable.setValue(lista);
    }

}