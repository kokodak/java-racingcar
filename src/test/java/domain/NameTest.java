package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class NameTest {

    @DisplayName("자동차 이름의 길이가 1~5글자가 아니거나, null 이라면 예외를 던진다")
    @ParameterizedTest
    @CsvSource(value = {"''", "abcdef", "abcdefgh", "null"}, nullValues = "null")
    void should_ThrowIllegalArgumentException_When_NameIsInvalid(String name) {
        assertThatThrownBy(() -> new Name(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");
    }

    @DisplayName("자동차 이름의 길이가 1~5글자라면 예외를 던지지 않는다")
    @ParameterizedTest
    @CsvSource({"a", "abc", "abcde"})
    void should_DoesNotThrowException_When_NameIsValid(String name) {
        assertThatCode(() -> new Name(name))
                .doesNotThrowAnyException();
    }
}
