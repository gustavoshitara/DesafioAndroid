package br.com.digitalhouse.desafioandroid.listacardapio.view;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.desafioandroid.R;
import br.com.digitalhouse.desafioandroid.listacardapio.adapter.CardapioAdapter;
import br.com.digitalhouse.desafioandroid.listacardapio.model.Cardapio;
import br.com.digitalhouse.desafioandroid.listarestaurantes.model.Restaurantes;

public class ListaCardapioActivity extends AppCompatActivity {
    RecyclerView recyclerViewCardapio;
    CardapioAdapter adapter;
    //private ImageView imageviewRestaurante1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cardapio);

        /*imageviewRestaurante1 = findViewById(R.id.imageViewRestaurante1);

        if (getIntent() != null && getIntent().getExtras() != null) {
            Restaurantes restaurantes = getIntent().getParcelableExtra("RESTAURANTE");

            if (restaurantes != null) {
                //imageviewRestaurante1.setImageDrawable(restaurantes.getFotoResturante());
            }
        }
        */

        recyclerViewCardapio = findViewById(R.id.listaPratosRecyclerView);
        adapter = new CardapioAdapter(listaDePratos());
        recyclerViewCardapio.setAdapter(adapter);
        recyclerViewCardapio.setLayoutManager(new GridLayoutManager(this,2));
    }

    private List<Cardapio> listaDePratos(){
        List<Cardapio> pratos = new ArrayList<>();
        pratos.add(new Cardapio("Hamburguer com Batatas",R.drawable.hamburguer));
        pratos.add(new Cardapio("Hamburguer com Batatas",R.drawable.hamburguer));
        pratos.add(new Cardapio("Hamburguer com Batatas",R.drawable.hamburguer));
        pratos.add(new Cardapio("Hamburguer com Batatas",R.drawable.hamburguer));
        pratos.add(new Cardapio("Hamburguer com Batatas",R.drawable.hamburguer));
        pratos.add(new Cardapio("Hamburguer com Batatas",R.drawable.hamburguer));

        return pratos;
    }

}
