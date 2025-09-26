package ru.tracker.input;

import org.junit.jupiter.api.Test;
import ru.tracker.output.MockOutput;
import ru.tracker.output.Output;

import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output output = new MockOutput();
        Input in = new MockInput(
                new String[] {"вап", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Выбрать:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenNegativeValidInput() {
        Output output = new MockOutput();
        Input in = new MockInput(
                new String[] {"-5"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Выбрать:");
        assertThat(selected).isEqualTo(-5);
    }

    @Test
    void whenArrayValidInput() {
        Output output = new MockOutput();
        String[] selects = new String[] {"0", "1", "2", "3", "4"};
        Input in = new MockInput(selects);
        int selected;
        for (int i = 0; i < selects.length; i++) {
            ValidateInput input = new ValidateInput(output, in);
            selected = input.askInt("Выбрать:");
            assertThat(selected).isEqualTo(Integer.parseInt(selects[i]));
        }
    }
}
