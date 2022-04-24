package racingcar.view;

import racingcar.domain.Car;

public class OutputView {
    private static final String EXECUTION_RESULT = "실행결과";


    public static void printExecutionResultMessage() {
        System.out.println(EXECUTION_RESULT);
    }

    public static void printResultByCar(Car car){
        System.out.println(car + " : " + makeHyphenFromNumber(Integer.parseInt(car.getPosition().toString())));
    }

    private static String makeHyphenFromNumber(int number){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<number;i++){
            sb.append("-");
        }
        return sb.toString();
    }
}
