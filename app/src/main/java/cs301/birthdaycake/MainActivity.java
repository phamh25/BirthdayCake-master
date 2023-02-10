package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

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

    }

    public void goodbye(View button) {
        Log.i("button", "Goodbye");
        finishAffinity();
    }

}
