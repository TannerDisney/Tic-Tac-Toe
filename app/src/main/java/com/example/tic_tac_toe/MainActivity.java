package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button startup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startup = findViewById(R.id.btnStartGame);
    }
    public void openGame(View v) {
        Intent game = new Intent(this, PlayingTicTacToe.class);
        startActivity(game);
    }
}
