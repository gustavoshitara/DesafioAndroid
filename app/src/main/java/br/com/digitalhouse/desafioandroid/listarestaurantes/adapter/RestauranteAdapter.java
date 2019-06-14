package br.com.digitalhouse.desafioandroid.listarestaurantes.adapter;

import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.digitalhouse.desafioandroid.R;
import br.com.digitalhouse.desafioandroid.interfaces.RecyclerViewListenerRestaurante;
import br.com.digitalhouse.desafioandroid.listarestaurantes.model.Restaurantes;

public class RestauranteAdapter extends RecyclerView.Adapter<RestauranteAdapter.ViewHolder> {
    private List<Restaurantes> listaRestaurantes;
    private RecyclerViewListenerRestaurante listener;

    public RestauranteAdapter(List<Restaurantes> listaRestaurantes, RecyclerViewListenerRestaurante listener) {
        this.listaRestaurantes = listaRestaurantes;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RestauranteAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_lista_restaurantes_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestauranteAdapter.ViewHolder viewHolder, int i) {
        Restaurantes novoRestaurante =listaRestaurantes.get(i);

        viewHolder.bind(novoRestaurante);
    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView fotoRestaurante;
        private TextView nomeRestaurante;
        private TextView enderecoRestaurante;
        private TextView horarioRestaurante;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            fotoRestaurante = itemView.findViewById(R.id.imageViewRestaurante);
            nomeRestaurante = itemView.findViewById(R.id.textViewNomeRestaurante);
            enderecoRestaurante = itemView.findViewById(R.id.textViewEnderecoRestaurante);
            horarioRestaurante = itemView.findViewById(R.id.textViewHorarioRestaurante);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onClick(listaRestaurantes.get(getLayoutPosition()));
                }
            });{

            }

        }

        public void bind(Restaurantes restaurante){
            fotoRestaurante.setImageDrawable(ContextCompat.getDrawable(fotoRestaurante.getContext(),restaurante.getFotoResturante()));
            nomeRestaurante.setText(restaurante.getNomeRestaurante());
            enderecoRestaurante.setText(restaurante.getEnderecoRestaurante());
            horarioRestaurante.setText(restaurante.getHorarioRestaurante());
        }
    }
}
