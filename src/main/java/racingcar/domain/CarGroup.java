package racingcar.domain;

import racingcar.view.OutputView;

import java.util.*;

import static racingcar.view.OutputView.printResultByCar;

public class CarGroup{
    private static final String ERROR_DUPLICATE_CAR_NAME = "중복된 자동차 이름은 허용하지 않습니다.";

    private List<Car> carGroup;

    public CarGroup(List<Car> carGroup) {
        validateDuplication(carGroup);
        this.carGroup = carGroup;
    }

    private void validateDuplication(List<Car> carGroup) {
        HashSet<Car> carSet = new HashSet<>(carGroup);
        if(carGroup.size() != carSet.size()){
            throw new IllegalArgumentException(ERROR_DUPLICATE_CAR_NAME);
        }
    }

    public void startingDrive(int numberOfRound) {
        for(int i=0;i<numberOfRound;i++){
            carGroup.forEach(Car::goOrStopByRandom);
            carGroup.forEach(OutputView::printResultByCar);
            System.out.println();
        }
    }
}
