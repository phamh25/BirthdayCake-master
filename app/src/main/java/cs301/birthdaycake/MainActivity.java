package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

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

    }

    public void goodbye(View button) {
        Log.i("button", "Goodbye");
        finishAffinity();
    }

}
