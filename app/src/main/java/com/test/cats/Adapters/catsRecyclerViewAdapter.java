package com.test.cats.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.test.cats.R;
import com.test.cats.models.Cat;

import java.util.List;

public class catsRecyclerViewAdapter extends RecyclerView.Adapter<catsRecyclerViewAdapter.ViewHolder> {

    private List<Cat> cats;

    @NonNull
    @Override
    public catsRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cat_cardview,null,false);
        view.setLayoutParams(new ViewGroup.LayoutParams(new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT, RecyclerView.LayoutParams.WRAP_CONTENT)));
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull catsRecyclerViewAdapter.ViewHolder holder, int position) {
        holder.addCat(cats.get(position));
    }

    @Override
    public int getItemCount() {
        return cats.size();
    }

    public catsRecyclerViewAdapter(List<Cat> cats) {
        this.cats = cats;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView nombre, pais, inteligencia;
        private ImageView imagen;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.nombre_cat_cardview);
            pais = itemView.findViewById(R.id.pais_cat_cardview);
            inteligencia = itemView.findViewById(R.id.inteligencia_cat_cardview);
            imagen = itemView.findViewById(R.id.image_cat_cardview);
        }

        public void addCat(Cat cat) {
            nombre.setText(cat.getName());
            pais.setText(cat.getOrigin());
            inteligencia.setText(String.valueOf(cat.getIntelligence()));
            Picasso.get().load("https://cdn2.thecatapi.com/images/"+cat.getReference_image_id()+".jpg").into(imagen);
        }
    }
}
