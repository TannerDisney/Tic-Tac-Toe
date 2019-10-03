package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PlayingTicTacToe extends AppCompatActivity {
    Button topLeft;
    Button topMid;
    Button topRight;
    Button midLeft;
    Button middle;
    Button midRight;
    Button bottomLeft;
    Button bottomMid;
    Button bottomRight;
    String[][] board;
    Button newGame;
    // Odd is X , Even is O
    int turnCount;
    // Win Counter for X
    int xWin;
    // Win Counter for O
    int oWin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_tic_tac_toe);
        board = new String[3][3];
        // TicTacToe Grid
        // Top Row
        topLeft = findViewById(R.id.btnTopLeft); // [0][0]
        topMid = findViewById(R.id.btnTopMid); // [0][1]
        topRight = findViewById(R.id.btnTopRight); // [0][2]
        // Middle Row
        midLeft = findViewById(R.id.btnMidLeft); // [1][0]
        middle = findViewById(R.id.btnMid); // [1][1]
        midRight = findViewById(R.id.btnMidRight); // [1][2]
        // Bottom Row
        bottomLeft = findViewById(R.id.btnBottomLeft); // [2][0]
        bottomMid = findViewById(R.id.btnBottomMid); // [2][1]
        bottomRight = findViewById(R.id.btnBottomRight); // [2][2]

        newGame = findViewById(R.id.btnNewGame);
        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newGame();
            }
        });
    }

    /*
        TopLeft     | TopMiddle     | TopRight
        -----------------------------------------
        midLeft     | middle        | midRight
        -----------------------------------------
        bottomLeft  | bottomMid     | bottomRight
     */
    // On button click it will check which part of the array that its in and place it in the 2d array
    // After turn 3 it will start checking the board for a winning board from X or from O

    public void newGame() {
        turnCount = 1;
        xWin = 0;
        oWin = 0;
    }

    public void clearBoard(View v) {
        topLeft.setText("");
        topMid.setText("");
        topRight.setText("");
        midLeft.setText("");
        middle.setText("");
        midRight.setText("");
        bottomLeft.setText("");
        bottomMid.setText("");
        bottomRight.setText("");
        Toast.makeText(getApplicationContext(), "Board Cleared!", Toast.LENGTH_SHORT).show();
    }

    public void topLeftClicked(View v) {
        if(turnCount % 2 == 0) {
            topLeft.setText("X");
        }
        else {
            topLeft.setText("O");
        }
    }

    public void topMiddleClicked(View v) {

    }

    public void topRightClicked(View v) {

    }
}
