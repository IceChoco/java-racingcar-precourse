package racingcar;

import racingcar.domain.CarGroup;
import racingcar.utils.InputHandler;

import java.util.List;

import static racingcar.view.InputView.requestInputCarName;

public class GameSystem {

    public void gameStart() {
        CarGroup carGroup = new CarGroup(InputHandler.splitByComma(requestInputCarName()));
        System.out.println();
    }
}
