package jp.study.hellokitten;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Boolean kittyFlag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button kittyButton = (Button)findViewById(R.id.button);
        kittyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //クリック時
                MediaPlayer mediaPlayer =
                        MediaPlayer.create(getApplicationContext(), R.raw.meow);
                mediaPlayer.start();

                if(kittyFlag){
                    kittyButton.setBackgroundResource(R.drawable.kitty);
                }

            }
        });
    }
}
