package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        // 7
        CakeView viewID = findViewById(R.id.cakeview);

        // 8
        CakeController controller = new CakeController(viewID);

        // cp2:2
        Button blowout = (Button)findViewById(R.id.blowout);
        blowout.setOnClickListener(controller);

        // cp3:3
        CompoundButton candles = (CompoundButton)findViewById(R.id.candles);
        candles.setOnCheckedChangeListener(controller);

        // cp 4
        SeekBar numCandles = (SeekBar)findViewById(R.id.seekBar);
        numCandles.setOnSeekBarChangeListener(controller);


    }

    public void goodbye(View button) {
        Log.i("button", "Goodbye");
        finishAffinity();
    }

}
