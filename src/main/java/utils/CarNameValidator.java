package utils;

import java.util.List;

public class CarNameValidator {

    private static final String NO_NAME_EXISTS_MESSAGE = "[ERROR] 자동차의 이름은 반드시 있어야 합니다.";
    private static final String INVALID_LENGTH_MESSAGE = "[ERROR] 자동차의 이름은 5글자까지 가능합니다.";

    public static void validate(String input) {
        int length = input.length();

        if (length == 0) {
            throw new IllegalArgumentException(NO_NAME_EXISTS_MESSAGE);
        }

        if (length > 5) {
            throw new IllegalArgumentException(INVALID_LENGTH_MESSAGE);
        }
    }
}