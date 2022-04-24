package racingcar.domain;

public class CarPosition {
    int carPosition;

    public CarPosition(int carPosition) {
        this.carPosition = carPosition;
    }

    public void increase() {
        carPosition++;
    }

    @Override
    public String toString(){
        return Integer.toString(carPosition);
    }
}
