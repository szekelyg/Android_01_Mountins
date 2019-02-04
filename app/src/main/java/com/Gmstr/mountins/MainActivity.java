package com.Gmstr.mountins;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button showTheMountinButton;
    private TextView showMyMountinText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showTheMountinButton = findViewById(R.id.buttonID);
        showMyMountinText =  findViewById(R.id.textViewID);

        final String[] mountins = {"Everest","Kilimanjaro","Kekes Teto","Vigyázó","Vaskapu","Hargita"};

        showTheMountinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int randNum = rand.nextInt(mountins.length);

                showMyMountinText.setText(mountins[randNum]);
            }
        });
    }
}
