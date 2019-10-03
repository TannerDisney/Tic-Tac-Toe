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
        turnCount = 0;
        turn.setText(R.string.player_x_s_turn);
        Toast.makeText(getApplicationContext(), "Board Cleared!", Toast.LENGTH_SHORT).show();
    }

    public void topLeftClicked(View v) {
        if(turnCount % 2 == 0) {
            topLeft.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
        }
        else {
            topLeft.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
        }
    }

    public void topMiddleClicked(View v) {
        if(turnCount % 2 == 0) {
            topMid.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
        }
        else {
            topMid.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
        }
    }

    public void topRightClicked(View v) {
        if(turnCount % 2 == 0) {
            topRight.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
        }
        else {
            topRight.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
        }
    }

    public void middleLeftClicked(View v) {
        if(turnCount % 2 == 0) {
            midLeft.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
        }
        else {
            midLeft.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
        }
    }

    public void middleClicked(View v) {
        if(turnCount % 2 == 0) {
            middle.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
        }
        else {
            middle.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
        }
    }

    public void middleRightClicked(View v) {
        if(turnCount % 2 == 0) {
            midRight.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
        }
        else {
            midRight.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
        }
    }

    public void bottomLeftClicked(View v) {
        if(turnCount % 2 == 0) {
            bottomLeft.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
        }
        else {
            bottomLeft.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
        }
    }

    public void bottomMiddleClicked(View v) {
        if(turnCount % 2 == 0) {
            bottomMid.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
        }
        else {
            bottomMid.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
        }
    }

    public void bottomRightClicked(View v) {
        if(turnCount % 2 == 0) {
            bottomRight.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
        }
        else {
            bottomRight.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
        }
    }

    public void CheckForWinner() {

    }

    public String winByRow() {
        for(int row = 0; i < board.length; row++) {
            for(int col = 0; col < board[row].length; col++) {
                if
                (
                    board[row][col].equals(board[row][col + 1]) &&
                    board[row][col].equals(board[row][col + 2]) &&
                    board[row][col].equals(board[row][col + 3])
                )
                {

                }
            }
        }
    }

    public String winByColumn() {
        for(int row = 0; i < board.length; row++) {
            for(int col = 0; col < board[row].length; col++) {
                if
                (
                        board[row][col].equals(board[row + 1][col]) &&
                        board[row][col].equals(board[row + 2][col]) &&
                        board[row][col].equals(board[row + 3][col])
                )
                {

                }
            }
        }
    }

    public String winByDiagonal() {
        for(int row = 0; i < board.length; row++) {
            for(int col = 0; col < board[row].length; col++) {

            }
        }
    }
}
