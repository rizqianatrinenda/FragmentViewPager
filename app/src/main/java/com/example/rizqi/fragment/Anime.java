package com.example.rizqi.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;

/**
 * Created by rizqi on 03/08/17.
 */

public class Anime implements Parcelable{
    private String judulAnime;
    private String pengarangAnime;
    private String jumlahEpisode;
    private String sinopsisAnime;
    private String idGambarAnime;

    public Anime(String judulAnime, String pengarangAnime, String jumlahEpisode, String sinopsisAnime, String idGambarAnime) {
        this.judulAnime = judulAnime;
        this.pengarangAnime = pengarangAnime;
        this.jumlahEpisode = jumlahEpisode;
        this.sinopsisAnime = sinopsisAnime;
        this.idGambarAnime = idGambarAnime;
    }

    public String getJudulAnime() {
        return judulAnime;
    }

    public void setJudulAnime(String judulAnime) {
        this.judulAnime = judulAnime;
    }

    public String getPengarangAnime() {
        return pengarangAnime;
    }

    public void setPengarangAnime(String pengarangAnime) {
        this.pengarangAnime = pengarangAnime;
    }

    public String getJumlahEpisode() {
        return jumlahEpisode;
    }

    public void setJumlahEpisode(String jumlahEpisode) {
        this.jumlahEpisode = jumlahEpisode;
    }

    public String getSinopsisAnime() {
        return sinopsisAnime;
    }

    public void setSinopsisAnime(String sinopsisAnime) {
        this.sinopsisAnime = sinopsisAnime;
    }

    public String getIdGambarAnime() {
        return idGambarAnime;
    }

    public void setIdGambarAnime(String idGambarAnime) {
        this.idGambarAnime = idGambarAnime;
    }

    protected Anime(Parcel in) {
        judulAnime = in.readString();
        pengarangAnime = in.readString();
        jumlahEpisode = in.readString();
        sinopsisAnime = in.readString();
        idGambarAnime = in.readString();
    }

    public static final Creator<Anime> CREATOR = new Creator<Anime>() {
        @Override
        public Anime createFromParcel(Parcel in) {
            return new Anime(in);
        }

        @Override
        public Anime[] newArray(int size) {
            return new Anime[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(judulAnime);
        dest.writeString(pengarangAnime);
        dest.writeString(jumlahEpisode);
        dest.writeString(sinopsisAnime);
        dest.writeString(idGambarAnime);
    }
}

