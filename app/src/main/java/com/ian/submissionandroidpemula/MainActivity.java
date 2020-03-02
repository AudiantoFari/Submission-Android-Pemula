package com.ian.submissionandroidpemula;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvAnime;
    private ArrayList<Anime> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAnime = findViewById(R.id.rv_anime);
        rvAnime.setHasFixedSize(true);

        list.addAll(AnimeData.getListData());
        showRecyclerList();

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Home");
        }
    }

    private void showRecyclerList() {
        rvAnime.setLayoutManager(new LinearLayoutManager(this));
        ListAnimeAdapter listAnimeAdapter = new ListAnimeAdapter(list);
        rvAnime.setAdapter(listAnimeAdapter);

        listAnimeAdapter.setOnItemClickCallback(new ListAnimeAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Anime data) {
                showSelectedAnime(data);
            }
        });
    }

    private void showSelectedAnime(Anime anime) {
        Intent animedetail = new Intent(this, AnimeDetail.class);
        animedetail.putExtra(AnimeDetail.EXTRA_NAME, anime.getName());
        animedetail.putExtra(AnimeDetail.EXTRA_DETAIL, anime.getDetail());
        animedetail.putExtra(AnimeDetail.EXTRA_SYNOPSIS, anime.getSynopsis());
        animedetail.putExtra(AnimeDetail.EXTRA_POSTER, anime.getPoster());
        startActivity(animedetail);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int itemId) {
        switch (itemId) {
            case R.id.itmAbout:
                Intent about = new Intent(this, About.class);
                startActivity(about);
        }
    }
}
