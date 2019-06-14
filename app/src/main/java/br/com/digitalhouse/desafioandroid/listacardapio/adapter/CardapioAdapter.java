package br.com.digitalhouse.desafioandroid.listacardapio.adapter;

import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.digitalhouse.desafioandroid.R;
import br.com.digitalhouse.desafioandroid.listacardapio.model.Cardapio;
import br.com.digitalhouse.desafioandroid.listarestaurantes.adapter.RestauranteAdapter;

public class CardapioAdapter extends RecyclerView.Adapter<CardapioAdapter.ViewHolder> {
    private List<Cardapio> listaPratos;

    public CardapioAdapter(List<Cardapio> listaPratos) {
        this.listaPratos = listaPratos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_lista_cardapio_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardapioAdapter.ViewHolder viewHolder, int i) {
        Cardapio novoCardapio = listaPratos.get(i);
        viewHolder.bind(novoCardapio);
    }

    @Override
    public int getItemCount() {
        return listaPratos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView fotoPrato;
        private TextView nomePrato;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            fotoPrato = itemView.findViewById(R.id.imageViewPrato);
            nomePrato = itemView.findViewById(R.id.textViewPrato);
        }

        public void bind(Cardapio cardapio){
            fotoPrato.setImageDrawable(ContextCompat.getDrawable(fotoPrato.getContext(),cardapio.getFotoPrato()));
            nomePrato.setText(cardapio.getNomePrato());
        }
    }
}
