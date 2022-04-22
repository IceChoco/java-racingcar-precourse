package racingcar.utils;

import racingcar.domain.Car;

import java.util.ArrayList;

public class InputHandler {

    public static ArrayList<Car> splitByComma(String requestInputCarName) {
        String[] result = requestInputCarName.split(",");
        ArrayList<Car> resultList = new ArrayList<>();

        for(int i=0;i<result.length;i++){
            resultList.add(new Car(result[i]));
        }

        return resultList;
    }
}
