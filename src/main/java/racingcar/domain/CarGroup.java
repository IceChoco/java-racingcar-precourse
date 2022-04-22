package racingcar.domain;

import java.util.*;

public class CarGroup{
    private static final String ERROR_DUPLICATE_CAR_NAME = "중복된 자동차 이름은 허용하지 않습니다.";

    private List<Car> carGroup;

    public CarGroup(List<Car> carGroup) {
        validateDuplication(carGroup);
        this.carGroup = carGroup;
    }

    private void validateDuplication(List<Car> carGroup) {
        HashSet<Car> carSet = new HashSet<>();
        for(Car car:carGroup){
            carSet.add(car);
        }
        if(carGroup.size() != carSet.size()){
            throw new IllegalArgumentException(ERROR_DUPLICATE_CAR_NAME);
        }
    }
}
