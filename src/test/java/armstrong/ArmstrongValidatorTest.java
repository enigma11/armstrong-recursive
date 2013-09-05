package armstrong;

import org.junit.Test;

import java.util.List;

import static armstrong.ArmstrongValidator.isValid;
import static java.util.Arrays.asList;
import static org.fest.assertions.Assertions.assertThat;

public class ArmstrongValidatorTest {

    @Test
    public void validArmstrongNumber() throws Exception {
        List<Integer> sample = asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407);

        for (Integer candidate : sample) {
            assertThat(isValid(candidate))
                    .as(candidate + " is an invalid armstrong number")
                    .isTrue();
        }
    }

    @Test
    public void invalidArmstrongNumber() throws Exception {
        List<Integer> sample = asList(152, 375, 372);

        for (Integer candidate : sample) {
            assertThat(isValid(candidate))
                    .as(candidate + " is a valid armstrong number")
                    .isFalse();
        }
    }
}
