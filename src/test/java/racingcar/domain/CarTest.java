package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {
    @Test
    @DisplayName("5자 이하의 자동차 이름 만들기")
    void MAKE_CAR_NAME_UNDER_5DIGIT(){
        Car car = new Car("ara");
        assertThat(car).isNotNull();
    }

    @Test
    @DisplayName("5자 이상의 자동차 이름 생성 실패하기")
    void MAKE_CAR_NAME_OVER_5DIGIT(){
        assertThatIllegalArgumentException().isThrownBy(()-> new Car("iceChoco"));
    }

    @Test
    @DisplayName("공백으로 된 자동차 이름 생성 실패하기")
    void MAKE_CAR_NAME_ONLY_EMPTY(){
        assertThatIllegalArgumentException().isThrownBy(()-> new Car("     "));
    }
}
