package com.example.rizqi.fragment;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by rizqi on 03/08/17.
 */


public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder> {

//    public static final String JUDUL = "JUDUL ANIME";
//    public static final String PENGARANG = "PENGARANG ANIME";
//    public static final String SINOPSIS = "SINOPSIS ANIME";
//    public static final String JUMLAH = "JUMLAH EPISODE ANIME";
//    public static final String GAMBAR = "GAMBAR ANIME";

    private ArrayList<Anime> animes;
    private Context context;


    @Override
    public AnimeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.anime, parent, false);

        return new AnimeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AnimeViewHolder holder, final int position) {

        final Anime anime = animes.get(position);
        holder.judulAnime.setText(anime.getJudulAnime());

        Picasso.with(context).load(anime.getIdGambarAnime()).into(holder.gambar);

//        holder.gambar.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(context, DetailAnime.class);
//                intent.putExtra("ANIME", animes.get(position));
//                context.startActivity(intent);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return animes.size();
    }

    public class AnimeViewHolder extends RecyclerView.ViewHolder {
        TextView judulAnime;
        ImageView gambar;

        public AnimeViewHolder(View animeView) {
            super(animeView);
            judulAnime = (TextView) animeView.findViewById(R.id.judul_anime);
            gambar = (ImageView) animeView.findViewById(R.id.gambar);
        }
    }

    public AnimeAdapter(ArrayList<Anime> animeArrayList, Context context) {
        this.animes = animeArrayList;
        this.context = context;
    }
}
