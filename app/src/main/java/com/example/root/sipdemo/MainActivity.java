package com.example.root.sipdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.net.SocketException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            new EventManager();

        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

}
