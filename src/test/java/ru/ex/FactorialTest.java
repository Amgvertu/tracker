package ru.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {
    @Test
    public void whenException() {
        Factorial factorial = new Factorial();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    factorial.calc(-1);
                });
        assertThat(exception.getMessage()).isEqualTo("Аргумент должен быть не меньше 0");
    }

    @Test
    public void whenNotException() {
        Factorial factorial = new Factorial();
        int number = 2;
        int expected = 2;
        int result = factorial.calc(number);
        assertThat(result).isEqualTo(expected);
    }

}
