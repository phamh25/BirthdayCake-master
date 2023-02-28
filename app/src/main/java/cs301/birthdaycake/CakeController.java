package cs301.birthdaycake;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;


public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, View.OnTouchListener {

    // instance variables
    private CakeView view; // 5
    private CakeModel model; // 6

    // getter
    public CakeController(CakeView view){
        this.view = view; // 5
        this.model = view.getModel(); // 6
    }

    // cp 2:1
    public void onClick(View v){
        Log.d("Click", "Click");

        // cp 2:1
        model.isLit = false;

        // cp 2:2
        view.invalidate(); // redraws

    }

    // cp 3:1
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        model.hasCandles = isChecked;
        view.invalidate(); // redraws
    }

    // cp 4
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        model.numCandles = progress;
        view.invalidate();
    }
    public void onStartTrackingTouch(SeekBar seekBar) {}
    public void onStopTrackingTouch(SeekBar seekBar) {}

    public boolean onTouch(View v, MotionEvent event) {
        Log.d("XY", "Touch");
        model.balloonX = event.getX();
        model.balloonY = event.getY();
        model.hasTouched = true;
        view.invalidate();
        return false;
    }


}
