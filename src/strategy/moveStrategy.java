package strategy;

import com.hz.Opponent;

public interface moveStrategy {

    void requestInput(Opponent opponent);
    void reply(Opponent opponent);
    void compare(Opponent opponent);
}
