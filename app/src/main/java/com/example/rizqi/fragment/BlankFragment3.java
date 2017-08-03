package com.example.rizqi.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment3 extends Fragment {

    RecyclerView recyclerView;
    ArrayList<Anime> animeArrayList;
    public BlankFragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
        animeArrayList = new ArrayList<>();
        animeArrayList.add(new Anime("ONE PIECE", "LUFFY", "200 EP",
                "Kalau kita sedang membahas anime, tentu gak boleh lupa dengan anime terpopuler yang satu ini. Buat Toppers yang hobi nonton anime pastinya film animasi yang satu ini udah gak asing lagi dong? Film animasi ini merupakan salah satu film terpopuler dan terbaik sepanjang masa. Mengisahkan tentang serunya kisah petualangan bajak laut mencari sebuah harta karun. Tidak hanya populer sebagai film animasi saja, One Piece juga meraih penjualan tinggi lewat manga, video game, dan merchandise. Film animasi ini akan membuat penonton tertawa dengan tingkah para karakter di dalamnya sekaligus ketegangan saat bertarung dengan musuhnya",
                "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2015/08/anime.jpg"));
        animeArrayList.add(new Anime("NARUTO", "UJANG", "500 EP",
                "Sama halnya dengan One Piece, film animasi Naruto juga merupakan film yang laris manis gak hanya di negara asalnya, tapi juga di seluruh dunia termasuk Indonesia. Film animasi yang menceritakan seorang ninja muda bernama Naruto Uzumaki plus kelakuan konyolnya beserta teman-teman ninjanya yang lain semakin seru untuk diikuti. Ditambah petualangan mereka sama-sama bertarung dan berjuang melawan musuh demi menyelamatkan Desa Konoha beserta isinya. Keseruan film animasi Naruto ini berlanjut hingga di season 2, Naruto Shippuden. Meski sekarang film animasi ini sudah tamat, tapi masih banyak lho yang tetap menonton ulang film ini.",
                "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2015/08/anime2.jpg"));
        animeArrayList.add(new Anime("BLEACH", "UDIN", "400 EP",
                "Film animasi yang dirilis pertama kali pada tahun 2004 ini mampu menggabungkan humor dan pertempuran dengan sangat apik, sehingga membuat para penonton tidak mudah berpaling saat sedang menyaksikan film yang berhasil meraih berbagai penghargaan internasional bergengsi ini. Film animasi ini berkisah tentang seorang anak muda bernama Kurosaki Ichigo yang memiliki kelebihan dapat melihat hantu dan arwah orang mati atau disebut juga dewa kematian. Yang membuat film animasi ini semakin seru tentunya pertarungan melawan musuh yang berhasil menarik perhatian penonton dan membuktikan film animasi ini bisa menuai kesuksesan.",
                "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2015/08/anime3.jpg"));
        animeArrayList.add(new Anime("DEATH NOTE", "L", "23 EP",
                "Animasi yang satu ini juga tidak bisa diragukan lagi popularitasnya. Saat menyaksikan film animasi ini, kamu akan dihinggapi dengan rasa penasaran karena jalan ceritanya yang unik dan penuh misteri. Film animasi yang disajikan dalam 37 episode ini dipenuhi dengan karakter-karakter keren. Bahkan gaya para karakter Death Note ini juga menjadi inspirasi anak muda lho! Death Note mengisahkan tentang petualangan seorang anak SMA bernama Light Yagami  yang menemukan sebuah buku misterius milik dewa kematian. Yang mana buku tersebut dapat membunuh siapa saja hanya dengan menulis namanya di buku tersebut. Meskipun ceritanya terdengar simpel tapi plot yang tersaji di dalamnya bikin penonton terhanyut dan penasaran.",
                "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2015/08/anime4.jpg"));
        animeArrayList.add(new Anime("DETECTIVE CONAN", "EDOGAWA", "999 EP",
                "Manga selanjutnya yang populer di dunia termasuk juga di Indonesia adalah serial animasi Detective Conan. Buat Toppers yang lahir di era 90an pasti gak asing dengan film animasi yang satu ini. Film ini berkisah tentang seorang detektif handal bernama asli Shinichi Kudo yang terperangkap dalam tubuh anak kecil karena diracuni oleh sebuah organisasi misterius. Setiap harinya Conan membantu Kogoro Mouri memecahkan berbagai kasus pembunuhan yang sulit diungkap, sekaligus mencari pelaku yang meracuninya. Dalam misinya tersebut, Conan juga dibantu oleh Profesor Agasa yang menciptakan beragam alat untuk membantu Conan memecahkan beragam kasus. Selain serial animasi, film yang selalu sukses membangkitkan rasa penasaran para penonton ini juga merambah layar lebar dengan kisah serunya.",
                "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2015/08/anime5.png"));
        animeArrayList.add(new Anime("DRAGON BALL Z", "GOKU", "1001 EP",
                "Selain Detective Conan, kamu juga tentu masih ingat dengan serial animasi Dragon Ball Z dong? Animasi yang populer di seluruh dunia ini juga punya jalan cerita yang menarik dengan menceritakan seorang pemuda bernama Goku dari bangsa Saiya yang memiliki kekuatan luar biasa yang berpetualang untuk mengumpulkan tujuh bola naga atau disebut Dragon Ball yang tersebar di seluruh dunia. Jika ketujuh bola tersebut ditemukan, maka ia mampu memanggil Dewa Naga yang bisa mengabulkan berbagai permintaan. Namun, ternyata petualangannya itu berkembang menjadi sebuah misi untuk menyelamatkan dunia dari berbagai penjahat. Tidak hanya populer, serial manga animasi ini juga paling laris dan mencapai penjualan lebih dari 350 juta kopi di seluruh dunia.",
                "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2015/08/anime6.jpg"));
        animeArrayList.add(new Anime("ATTACK ON TITAN", "ASEP", "59 EP",
                "Meski film animasi ini baru tayang pada tahun 2013 dan tergolong baru, tapi film animasi ini mampu meraih rating yang sangat tinggi. Animasi yang memiliki judul asli Shingeki No Kyojn ini bercerita tentang perjuangan anak remaja bernama Eren Jaegar dan adik tirinya Mikasa Ackerman yang harus bertahan hidup di tengah serangan Titan ke bumi. Titan sendiri merupakan sekelompok makhluk seukuran gedung bertingkat yang kejam dan memangsa manusia. Namun, Eren Jaegar sendiri menunjukkan kemampuannya berubah menjadi Titan dan berkelahi dalam wujud tersebut untuk membela umat manusia.",
                "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2015/08/anime7.png"));
        animeArrayList.add(new Anime("HUNTER X HUNTER", "GON", "409 EP",
                "Film animasi selanjutnya yang meraih kepopuleran luar biasa adalah Hunter X Hunter yang mengisahkan tentang seorang anak bernama Gon Freecs yang berpetualang untuk mencari sosok ayahnya yang masih misterius. Di tengah petualangannya tersebut, Gon bertemu dengan teman dekatnya Kilua dan dari situlah petualangan mereka berlanjut dengan munculnya berbagai musuh yang menghadang. Seiring berjalannya waktu, kekuatan Gon pun semakin bertambah kuat.",
                "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2015/08/anime8.jpg"));
        animeArrayList.add(new Anime("AFRO SAMURAI", "BAMBANG", "50 EP",
                "Sesuai judulnya, serial Afro Samurai menceritakan mengenai kisah seorang samurai yang menuntut balas atas kematian sang ayah. Dalam perjalanannya ia menemukan berbagai macam rintangan dan harus melawan berbagai musuh demi tujuan utamanya. Yang membuat animasi ini berbeda adalah sosok karakter utama yang digambarkan seorang pria berkulit hitam yang mengenakan headband berupa ikat kepala suci yang memiliki kekuatan besar.",
                "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2015/08/anime9.jpg"));
        animeArrayList.add(new Anime("BLACK LAGOON", "ANDI", "69 EP",
                "Serial animasi selanjutnya yang menarik banyak perhatian penonton datang dari manga berjudul Black Lagoon. Film yang sukses melakukan debutnya di Amerika pada tahun 2008 ini mengangkat cerita tentang dunia mafia dan kriminalitas. Selain itu banyak terdapat adegan baku tembak layaknya di film action Hollywood. Buat kamu yang hobi nonton film action, pastinya animasi ini cocok banget kamu saksikan. Anime yang dibuat menjadi 2 season ini semakin seru karena karakter utama yang memiliki keahlian masing-masing dalam berperan sebagai perompak sekaligus serdadu bayaran.",
                "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2015/08/anime10.jpg"));

        recyclerView = (RecyclerView) view.findViewById(R.id.recycle_view);

        //GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2, LinearLayoutManager.VERTICAL, false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        AnimeAdapter animeAdapter = new AnimeAdapter(animeArrayList, getContext());
        recyclerView.setAdapter(animeAdapter);


        return view;
    }

}
