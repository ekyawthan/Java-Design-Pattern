package InterfaceTest;

/**
 * Created by kyawthan on 6/18/15.
 */
public class Player {

    public interface GameResult{
        void won();
        void lost();
    }

    public interface GameResultWithSetter{
        void won();
        void lost();
    }


    private GameResult delegate;
    private GameResultWithSetter delegateWithSetter;
    public Player(GameResult delegate, int i){
        this.delegate = delegate;
        shouldPlay(i);

    }
    private int i;
    public Player(int i){
        this.i = i;
    }
    public void setDelegate(GameResultWithSetter setter){
        this.delegateWithSetter = setter;
        shouldPlayWithSetter(this.i);
    }

    private void shouldPlayWithSetter(int i) {
        if (i% 2 == 0){
            delegateWithSetter.won();
        } else {
            delegateWithSetter.lost();
        }

    }

    private void shouldPlay(int j) {
        if (j% 2 == 0){
            delegate.won();
        } else {
            delegate.lost();
        }
    }

}
