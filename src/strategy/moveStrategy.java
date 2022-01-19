package strategy;

import com.hz.Opponent;

public interface moveStrategy {

    void reply(Opponent opponent);
    void compare(Opponent opponent);
}
