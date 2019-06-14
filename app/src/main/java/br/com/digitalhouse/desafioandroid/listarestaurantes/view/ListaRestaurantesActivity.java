package br.com.digitalhouse.desafioandroid.listarestaurantes.view;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.desafioandroid.R;
import br.com.digitalhouse.desafioandroid.interfaces.RecyclerViewListenerRestaurante;
import br.com.digitalhouse.desafioandroid.listacardapio.view.ListaCardapioActivity;
import br.com.digitalhouse.desafioandroid.listarestaurantes.adapter.RestauranteAdapter;
import br.com.digitalhouse.desafioandroid.listarestaurantes.model.Restaurantes;
import br.com.digitalhouse.desafioandroid.splash.SplashActivity;

public class ListaRestaurantesActivity extends AppCompatActivity implements RecyclerViewListenerRestaurante {
    RecyclerView recyclerViewRestaurantes;

    RestauranteAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);

        recyclerViewRestaurantes = findViewById(R.id.listaRestaurantesRecyclerView);

        adapter = new RestauranteAdapter(listaDeRestaurantes(), this);

        recyclerViewRestaurantes.setAdapter(adapter);

        recyclerViewRestaurantes.setLayoutManager(new LinearLayoutManager(this));

    }

    private List<Restaurantes> listaDeRestaurantes(){
        List<Restaurantes> restaurantes = new ArrayList<>();
        restaurantes.add(new Restaurantes(R.drawable.tony_roma,"Restaurante 1","Rua","10 hs"));
        restaurantes.add(new Restaurantes(R.drawable.tony_roma,"Restaurante 1","Rua","10 hs"));
        restaurantes.add(new Restaurantes(R.drawable.tony_roma,"Restaurante 1","Rua","10 hs"));
        restaurantes.add(new Restaurantes(R.drawable.tony_roma,"Restaurante 1","Rua","10 hs"));
        restaurantes.add(new Restaurantes(R.drawable.tony_roma,"Restaurante 1","Rua","10 hs"));
        restaurantes.add(new Restaurantes(R.drawable.tony_roma,"Restaurante 1","Rua","10 hs"));

        return restaurantes;
    }

    @Override
    public void onClick(Restaurantes restaurantes) {
        Intent intent = new Intent(ListaRestaurantesActivity.this, ListaCardapioActivity.class);
        //intent.putExtra("RESTAURANTE", (Parcelable) restaurantes);
        startActivity(intent);
    }
}
