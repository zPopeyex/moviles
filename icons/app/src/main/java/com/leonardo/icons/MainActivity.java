package com.leonardo.icons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView lin;
    ImageView git;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lin = findViewById(R.id.linkedin);
        git = findViewById(R.id.github);



    lin.setOnClickListener(v -> gotoUrl("https://www.linkedin.com/in/leonardo-garzon-ospina/"));

    git.setOnClickListener(v -> gotoUrl("https://github.com/zPopeyex"));

    }



    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}