package racingcar.domain;

public class Car {
    private String car;
    private CarPosition position;
    private static final int CAR_NAME_MAX = 5;
    private static final String ERROR_CAR_NAME_MAX_GUIDE = "[ERROR] 자동차의 이름은 5글자가 넘지 않아야 합니다.";
    private static final String ERROR_CAN_NOT_EMPTY_CAN_NAME = "[ERROR] 자동차 이름은 공백이 올 수 없습니다.";

    public Car(String carName) {
        carName = carName.trim();
        verifyingCarNameLength(carName);
        verifyingCarNameIsEmpty(carName);
        position = new CarPosition(0);
        this.car = carName;
    }

    private void verifyingCarNameIsEmpty(String carName) {
        if(carName.isEmpty()){
            throw new IllegalArgumentException(ERROR_CAN_NOT_EMPTY_CAN_NAME);
        }
    }

    private void verifyingCarNameLength(String carName) {
        if(carName.length() > CAR_NAME_MAX){
            throw new IllegalArgumentException(ERROR_CAR_NAME_MAX_GUIDE);
        }
    }

    public void goOrStopByRandom() {
        RandomNumber randomNumber = new RandomNumber();
        goOrStop(randomNumber.getNumber());
    }

    private void goOrStop(int number){
        if(number >= 4){
            position.increase();
        }
    }

    public CarPosition getPosition() {
        return position;
    }

    @Override
    public String toString(){
        return car;
    }

    public void callGoOrStop(int number){
        goOrStop(number);
    }
}
