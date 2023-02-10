package cs301.birthdaycake;

import android.util.Log;
import android.view.View;


public class CakeController implements View.OnClickListener{

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

        // cp 2:3
        view.invalidate();

    }

}
