package br.com.senac.mybike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class CatalogosActivity extends AppCompatActivity {

    RecyclerView idRecCatalogo;

    List<Bike> bikes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catalogos_layout);

        idRecCatalogo = findViewById(R.id.idRecCatalogo);

        //montagem do leyout que será utilizado na lista

        idRecCatalogo.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        //vai deixar a lista mais eficiente
        idRecCatalogo.hasFixedSize();

        //instanciar o adaptador
        MyAdapter adapter = new MyAdapter();

        //executar a montagem da lista com o modelo
        idRecCatalogo.setAdapter(adapter);

    }
}