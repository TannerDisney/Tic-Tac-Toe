package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
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
    TextView turn;
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

        turn = findViewById(R.id.txtTurn);

        newGame = findViewById(R.id.btnNewGame);
        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newGame(v);
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

    public void newGame(View v) {
        clearBoard(v);
        turnCount = 0;
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
        topLeft.setEnabled(true);
        topMid.setEnabled(true);
        topRight.setEnabled(true);
        midLeft.setEnabled(true);
        middle.setEnabled(true);
        midRight.setEnabled(true);
        bottomLeft.setEnabled(true);
        bottomMid.setEnabled(true);
        bottomRight.setEnabled(true);
        turnCount = 0;
        turn.setText(R.string.player_x_s_turn);
        Toast.makeText(getApplicationContext(), "Board Cleared!", Toast.LENGTH_SHORT).show();
    }

    public void topLeftClicked(View v) {
        if(turnCount % 2 == 0) {
            topLeft.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
            topLeft.setEnabled(false);
        }
        else {
            topLeft.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
            topLeft.setEnabled(false);
        }
    }

    public void topMiddleClicked(View v) {
        if(turnCount % 2 == 0) {
            topMid.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
            topMid.setEnabled(false);
        }
        else {
            topMid.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
            topMid.setEnabled(false);
        }
    }

    public void topRightClicked(View v) {
        if(turnCount % 2 == 0) {
            topRight.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
            topRight.setEnabled(false);
        }
        else {
            topRight.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
            topRight.setEnabled(false);
        }
    }

    public void middleLeftClicked(View v) {
        if(turnCount % 2 == 0) {
            midLeft.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
            midLeft.setEnabled(false);
        }
        else {
            midLeft.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
            midLeft.setEnabled(false);
        }
    }

    public void middleClicked(View v) {
        if(turnCount % 2 == 0) {
            middle.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
            middle.setEnabled(false);
        }
        else {
            middle.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
            middle.setEnabled(false);
        }
    }

    public void middleRightClicked(View v) {
        if(turnCount % 2 == 0) {
            midRight.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
            midRight.setEnabled(false);
        }
        else {
            midRight.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
            midRight.setEnabled(false);
        }
    }

    public void bottomLeftClicked(View v) {
        if(turnCount % 2 == 0) {
            bottomLeft.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
            bottomLeft.setEnabled(false);
        }
        else {
            bottomLeft.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
            bottomLeft.setEnabled(false);
        }
    }

    public void bottomMiddleClicked(View v) {
        if(turnCount % 2 == 0) {
            bottomMid.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
            bottomMid.setEnabled(false);
        }
        else {
            bottomMid.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
            bottomMid.setEnabled(false);
        }
    }

    public void bottomRightClicked(View v) {
        if(turnCount % 2 == 0) {
            bottomRight.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
            bottomRight.setEnabled(false);
        }
        else {
            bottomRight.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
            bottomRight.setEnabled(false);
        }
    }
}
