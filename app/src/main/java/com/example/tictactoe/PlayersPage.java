package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PlayersPage extends AppCompatActivity {
    private EditText player1;
    private EditText player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_page);

        player1=findViewById(R.id.players_page_name1);
        player2=findViewById(R.id.players_page_name2);

    }

    public void SubmitBtnClick (View view){
        String player1Name = player1.getText().toString();
        if (player1Name.isEmpty()) {player1Name = "player 1" ;}

        String player2Name = player2.getText().toString();
        if (player2Name.isEmpty()) {player2Name = "player 2" ;}

        Intent intent = new Intent(this,GameDisplay.class);
        intent.putExtra("PLAYER_NAMES",new String[] {player1Name,player2Name});
        startActivity(intent);
finish();
    }
}