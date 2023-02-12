package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

class CarTest {

    @DisplayName("0 ~ 3의 값일때는 움직이지 않는다.")
    @ParameterizedTest
    @CsvSource({"0, 0", "1, 0", "2, 0", "3, 0"})
    void should_Stay_When_NumberIsZeroToThree(int number, int position) {
        //given
        Car car = Car.from("test");

        //when
        car.move(number);

        //then
        assertThat(car.getPosition()).isEqualTo(position);
    }

    @DisplayName("4 ~ 9의 값일때는 움직인다.")
    @ParameterizedTest
    @CsvSource({"4, 1", "5, 1", "6, 1", "7, 1", "8, 1", "9, 1"})
    void should_Move_When_NumberIsFourToNine(int number, int position) {
        //given
        Car car = Car.from("test");

        //when
        car.move(number);

        //then
        assertThat(car.getPosition()).isEqualTo(position);
    }
}
