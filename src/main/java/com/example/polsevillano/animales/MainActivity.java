package com.example.polsevillano.animales;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playPerro(View view){
        Toast toast = Toast.makeText(this,R.string.perro,Toast.LENGTH_SHORT);
        toast.show();
        mp = MediaPlayer.create(this,R.raw.perrosound);
        mp.start();
    }

    public void playGato(View view){
        Toast toast = Toast.makeText(this,R.string.gato,Toast.LENGTH_SHORT);
        toast.show();
        mp = MediaPlayer.create(this,R.raw.gatosound);
        mp.start();
    }
    public void playTigre(View view){
        Toast toast = Toast.makeText(this,R.string.tigre,Toast.LENGTH_SHORT);
        toast.show();
        mp = MediaPlayer.create(this,R.raw.tigersound);
        mp.start();
    }

    public void playBurro(View view){
        Toast toast = Toast.makeText(this,R.string.burro,Toast.LENGTH_SHORT);
        toast.show();
        mp = MediaPlayer.create(this,R.raw.burrosound);
        mp.start();
    }

    public void playCabra(View view){
        Toast toast = Toast.makeText(this,R.string.cabra,Toast.LENGTH_SHORT);
        toast.show();
        mp = MediaPlayer.create(this,R.raw.cabrasound);
        mp.start();
    }

    public void playMono(View view){
        Toast toast = Toast.makeText(this,R.string.mono,Toast.LENGTH_SHORT);
        toast.show();
        mp = MediaPlayer.create(this,R.raw.monosound);
        mp.start();
    }

    public void playVaca(View view){
        Toast toast = Toast.makeText(this,R.string.vaca,Toast.LENGTH_SHORT);
        toast.show();
        mp = MediaPlayer.create(this,R.raw.vacasound);
        mp.start();
    }
}
