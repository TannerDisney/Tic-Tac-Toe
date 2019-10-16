package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
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
    Button newGame;
    Button[] board;
    TextView turn;
    TextView txtOWins;
    TextView txtXWins;
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
        board = new Button[9];
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

        txtXWins = findViewById(R.id.txtXWins);
        txtOWins = findViewById(R.id.txtOWins);

        // Inserting Buttons into an array
        board[0] = topLeft;
        board[1] = topMid;
        board[2] = topRight;
        board[3] = midLeft;
        board[4] = middle;
        board[5] = midRight;
        board[6] = bottomLeft;
        board[7] = bottomMid;
        board[8] = bottomRight;

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
        txtXWins.setText("Player X's Wins = 0");
        txtOWins.setText("Player O's Wins = 0");
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
            declareWinner();
        }
        else {
            topLeft.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
            topLeft.setEnabled(false);
            declareWinner();
        }
    }

    public void topMiddleClicked(View v) {
        if(turnCount % 2 == 0) {
            topMid.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
            topMid.setEnabled(false);
            declareWinner();
        }
        else {
            topMid.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
            topMid.setEnabled(false);
            declareWinner();
        }
    }

    public void topRightClicked(View v) {
        if(turnCount % 2 == 0) {
            topRight.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
            topRight.setEnabled(false);
            declareWinner();
        }
        else {
            topRight.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
            topRight.setEnabled(false);
            declareWinner();
        }
    }

    public void middleLeftClicked(View v) {
        if(turnCount % 2 == 0) {
            midLeft.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
            midLeft.setEnabled(false);
            declareWinner();
        }
        else {
            midLeft.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
            midLeft.setEnabled(false);
            declareWinner();
        }
    }

    public void middleClicked(View v) {
        if(turnCount % 2 == 0) {
            middle.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
            middle.setEnabled(false);
            declareWinner();
        }
        else {
            middle.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
            middle.setEnabled(false);
            declareWinner();
        }
    }

    public void middleRightClicked(View v) {
        if(turnCount % 2 == 0) {
            midRight.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
            midRight.setEnabled(false);
            declareWinner();
        }
        else {
            midRight.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
            midRight.setEnabled(false);
            declareWinner();
        }
    }

    public void bottomLeftClicked(View v) {
        if(turnCount % 2 == 0) {
            bottomLeft.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
            bottomLeft.setEnabled(false);
            declareWinner();
        }
        else {
            bottomLeft.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
            bottomLeft.setEnabled(false);
            declareWinner();
        }
    }

    public void bottomMiddleClicked(View v) {
        if(turnCount % 2 == 0) {
            bottomMid.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
            bottomMid.setEnabled(false);
            declareWinner();
        }
        else {
            bottomMid.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
            bottomMid.setEnabled(false);
            declareWinner();
        }
    }

    public void bottomRightClicked(View v) {
        if(turnCount % 2 == 0) {
            bottomRight.setText("X");
            turnCount++;
            turn.setText(R.string.player_o_s_turn);
            bottomRight.setEnabled(false);
            declareWinner();
        }
        else {
            bottomRight.setText("O");
            turnCount++;
            turn.setText(R.string.player_x_s_turn);
            bottomRight.setEnabled(false);
            declareWinner();
        }
    }

    public void declareWinner() {
        String winner = checkForWinner();
        if(winner.equals("X")) {
            xWin++;
            Toast.makeText(getApplicationContext(), "X Wins! Reset board for next game with CLEAR GAME", Toast.LENGTH_LONG).show();
            txtXWins.setText("Player X's Wins = " + xWin);
        }
        else if(winner.equals("O")) {
            oWin++;
            Toast.makeText(getApplicationContext(), "O Wins! Reset board for next game with CLEAR GAME", Toast.LENGTH_LONG).show();
            txtOWins.setText("Player O's Wins = " + oWin);
        }

        if(turnCount >= 9) {
            Toast.makeText(getApplicationContext(), "It's a Draw! Reset board for next game with CLEAR GAME", Toast.LENGTH_LONG).show();
        }
    }

    public String checkForWinner() {
        // Checking Row's For Winner
        if(topLeft.getText() == topMid.getText() && topMid.getText() == topRight.getText())
            return topLeft.getText().toString();
        else if(midLeft.getText() == middle.getText() && middle.getText() == midRight.getText())
            return midLeft.getText().toString();
        else if(bottomLeft.getText() == bottomMid.getText() && bottomMid.getText() == bottomRight.getText())
            return bottomLeft.getText().toString();

        // Checking Column's For Winner
        if(topLeft.getText() == midLeft.getText() && midLeft.getText() == bottomLeft.getText())
            return topLeft.getText().toString();
        else if(topMid.getText() == middle.getText() && middle.getText() == bottomMid.getText())
            return topMid.getText().toString();
        else if(topRight.getText() == midRight.getText() && midRight.getText() == bottomRight.getText())
            return topRight.getText().toString();

        // Checking Diagonal and Anti-Diagonal For Winner
        if(topLeft.getText() == middle.getText() && middle.getText() == bottomRight.getText())
            return topLeft.getText().toString();
        else if(topRight.getText() == middle.getText() && middle.getText() == bottomLeft.getText())
            return topRight.getText().toString();

        return "";
    }
}