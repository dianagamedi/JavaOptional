package basic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;

@ExtendWith(MockitoExtension.class)
class OptionalEmptyTest {

    @Test
    void returnsFalseWhenOptionalIsEmptyAndPresentIsInvoked() {
        Optional<String> empty = Optional.empty();
        assertFalse(empty.isPresent());
    }
}