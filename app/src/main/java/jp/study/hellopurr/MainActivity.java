package jp.study.hellopurr;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button kitty;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kitty = (Button)findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.textView);
        kitty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound();
                textView.setText("1押した");

            }
        });
    }

    public void playSound(){
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.meow);
        mediaPlayer.start();
    }
}
