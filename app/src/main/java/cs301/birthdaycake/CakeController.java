package cs301.birthdaycake;

public class CakeController {

    // instance variables
    private CakeView view; // 5
    private CakeModel model; // 6

    // getter
    public CakeController(CakeView view){
        this.view = view; // 5
        this.model = view.getModel(); // 6
    }
}
