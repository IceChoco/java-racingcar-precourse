package racingcar.domain;

public class NumberOfRound{
    private int numberOfRound;
    private static final String IS_NUMBER = "[+-]?\\d*(\\.\\d+)?";
    private static final String ERROR_MUST_BE_NUMBER = "[ERROR] 시도 횟수는 숫자여야 합니다.";

    public NumberOfRound(String numberOfRound) {
        if(verifyingNumberOfRoundIsEmpty(numberOfRound) || !validateIsInteger(numberOfRound)){
            throw new IllegalArgumentException(ERROR_MUST_BE_NUMBER);
        }
        this.numberOfRound = Integer.parseInt(numberOfRound);
    }

    private boolean verifyingNumberOfRoundIsEmpty(String numberOfRound) {
        return numberOfRound.isEmpty();
    }

    private boolean validateIsInteger(String numberOfRound) {
        return numberOfRound.matches(IS_NUMBER);
    }

    public int getNumberOfRound() {
        return numberOfRound;
    }
}
