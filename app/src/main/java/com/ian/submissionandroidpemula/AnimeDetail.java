package com.ian.submissionandroidpemula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class AnimeDetail extends AppCompatActivity {

    TextView tvAnime, tvDetail, tvSynopsis;
    ImageView ivPoster;

    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_SYNOPSIS = "extra_synopsis";
    public static final String EXTRA_POSTER = "extra_poster";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime_detail);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        String synopsis = getIntent().getStringExtra(EXTRA_SYNOPSIS);
        int poster = getIntent().getIntExtra(EXTRA_POSTER, 0);

        tvAnime = findViewById(R.id.tvAnime);
        tvDetail = findViewById(R.id.tvDetail);
        tvSynopsis = findViewById(R.id.tvSynopsis);
        ivPoster = findViewById(R.id.ivPoster);

        tvAnime.setText(name);
        tvDetail.setText(detail);
        tvSynopsis.setText(synopsis);
        Glide.with(this)
                .load(poster)
                .apply(new RequestOptions())
                .into(ivPoster);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(name);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
